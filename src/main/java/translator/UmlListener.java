package translator;

import static translator.UmlListenerHelper.getMethod;
import static translator.UmlListenerHelper.getUmlModifier;
import static translator.UmlListenerHelper.isAbstract;
import static translator.UmlListenerHelper.isStatic;

import grammar.JavaGrammarBaseListener;
import grammar.JavaGrammarParser.ClassDeclarationContext;
import grammar.JavaGrammarParser.ClassOrInterfaceTypeContext;
import grammar.JavaGrammarParser.FieldDeclarationContext;
import grammar.JavaGrammarParser.FieldHeaderContext;
import grammar.JavaGrammarParser.InterfaceDeclarationContext;
import grammar.JavaGrammarParser.InterfaceMethodDeclarationContext;
import grammar.JavaGrammarParser.MethodDeclarationContext;
import grammar.JavaGrammarParser.MethodHeaderContext;
import grammar.JavaGrammarParser.MethodModifierContext;
import grammar.JavaGrammarParser.PackageDeclarationContext;
import grammar.JavaGrammarParser.SingleTypeImportDeclarationContext;
import grammar.JavaGrammarParser.SuperClassContext;
import grammar.JavaGrammarParser.SuperInterfacesContext;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class UmlListener extends JavaGrammarBaseListener {

    private LinkedList<String> content = new LinkedList<>();

    private Set<String> visitedPackages = new LinkedHashSet<>();

    private String actualRootPackage = "";

    private String actualPackage = "";

    private Map<String, Set<String>> relations = new LinkedHashMap<>();

    private Map<String, String> classExtend = new LinkedHashMap<>();

    private Map<String, Set<String>> classImplements = new LinkedHashMap<>();

    private Set<String> imports = new LinkedHashSet<>();

    @Override
    public void enterPackageDeclaration(PackageDeclarationContext ctx) {
        String packageName = ctx.packageName().getText();
        if (visitedPackages.size() > 0 && !visitedPackages.contains(packageName)) {
            content.add("}");
            content.add("\n");
        }
        if (!visitedPackages.contains(packageName)) {
            content.add("package " + packageName + "{");
            content.add("\n");
            visitedPackages.add(packageName);
        }

        int firstDot = ctx.packageName().getText().indexOf(".");
        if(firstDot > 0){
            actualRootPackage = ctx.packageName().getText().substring(0, firstDot);
        }else{
            actualRootPackage = ctx.packageName().getText();
        }
        actualPackage = ctx.packageName().getText();
    }

    @Override
    public void enterSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
        if (ctx.typeName().getText().contains(actualRootPackage)) {
            imports.add(ctx.typeName().getText());
        }
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        content.add(isAbstract(ctx.classModifier()) ? "abstract " : "");

        content.add("class " + getFullClassName(ctx) + getTypeArguments(ctx) + "{");
        content.add("\n");
    }

    private String getTypeArguments(ClassDeclarationContext ctx) {
        if (ctx.typeArguments() == null) {
            return "";
        }

        return ctx.typeArguments().getText();
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        content.add("}");
        content.add("\n");

        relations.put(getFullClassName(ctx), new LinkedHashSet<>(imports));
        imports = new LinkedHashSet<>();
    }

    @Override
    public void enterSuperClass(SuperClassContext ctx) {
        ClassDeclarationContext classDeclarationContext = (ClassDeclarationContext) ctx.getParent();
        String currentClassName = getFullClassName(classDeclarationContext);

        Optional<String> optionalImport = imports.stream()
            .filter(rel -> rel.contains(ctx.classOrInterfaceType().Identifier().getText()))
            .findAny();

        if (optionalImport.isPresent()) {
            classExtend.put(currentClassName, optionalImport.get());
            imports.remove(optionalImport.get());
        }
    }

    @Override
    public void enterSuperInterfaces(SuperInterfacesContext ctx) {
        ClassDeclarationContext classDeclarationContext = (ClassDeclarationContext) ctx.getParent();
        String currentClassName = getFullClassName(classDeclarationContext);

        for (ClassOrInterfaceTypeContext interfaceClass : ctx.interfaceTypeList()
            .classOrInterfaceType()) {
            Optional<String> optionalImport = imports.stream()
                .filter(rel -> rel.contains(interfaceClass.Identifier().getText()))
                .findAny();

            if (optionalImport.isPresent()) {
                classImplements.putIfAbsent(currentClassName, new LinkedHashSet<>());
                classImplements.computeIfPresent(currentClassName, (s, strings) -> {
                    strings.add(optionalImport.get());
                    return strings;
                });
                imports.remove(optionalImport.get());
            }
        }
    }

    private String getFullClassName(ClassDeclarationContext ctx) {
        if (actualPackage.isEmpty()) {
            return ctx.Identifier().getText();
        }
        return actualPackage + "." + ctx.Identifier().getText();
    }

    @Override
    public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        content.add("interface " + getFullClassName(ctx) + getTypeArguments(ctx) + "{");
        content.add("\n");
    }

    private String getTypeArguments(InterfaceDeclarationContext ctx) {
        if (ctx.typeArguments() == null) {
            return "";
        }

        return ctx.typeArguments().getText();
    }

    private String getFullClassName(InterfaceDeclarationContext ctx) {
        if (actualPackage.isEmpty()) {
            return ctx.Identifier().getText();
        }
        return actualPackage + "." + ctx.Identifier().getText();
    }

    @Override
    public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        content.add("}");
        content.add("\n");

        relations.put(getFullClassName(ctx), new LinkedHashSet<>(imports));
        imports = new LinkedHashSet<>();
    }

    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        List<MethodModifierContext> methodModifierContextList = ctx.methodModifier();

        content.add("{method}");
        content.add(isAbstract(methodModifierContextList) ? "{abstract}" : "");
        content.add(isStatic(methodModifierContextList) ? "{static}" : "");
        content.add(" ");
        content.add(getUmlModifier(methodModifierContextList));
    }

    @Override
    public void enterFieldDeclaration(FieldDeclarationContext ctx) {
        content.add("{field} ");
        content.add(getUmlModifier(ctx.fieldModifier()));
    }

    @Override
    public void enterMethodHeader(MethodHeaderContext ctx) {
        content.add(getMethod(ctx));
        content.add(": ");
        content.add(ctx.result().getText());
        content.add("\n");
    }

    @Override
    public void enterFieldHeader(FieldHeaderContext ctx) {
        content.add(ctx.fieldDeclaratorId().getText());
        content.add(": ");
        content.add(ctx.unannType().getText());
        content.add("\n");
    }

    @Override
    public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
        content.add("{method} ");
        content.add(getUmlModifier(ctx.interfaceMethodModifier()));
    }

    public String umlClass() {
        String start = "@startuml";

        String packagesEnd = getPackages();
        String relations = getRelations();
        String extensions = getExtensions();
        String implementations = getImplementations();

        String end = "@enduml";

        return start
            + "\n" + String.join("", content)
            + packagesEnd
            + relations
            + extensions
            + implementations
            + end;
    }

    private String getRelations() {
        String relationsString = "";
        for (Entry<String, Set<String>> entry : relations.entrySet()) {
            for (String referenceClass : entry.getValue()) {
                if (relations.containsKey(referenceClass)) {
                    relationsString += referenceClass + " -- " + entry.getKey() + "\n";
                }
            }
        }

        return relationsString;
    }

    private String getExtensions() {
        String extensionsString = "";
        for (Entry<String, String> entry : classExtend.entrySet()) {
            extensionsString += entry.getValue() + " <|-- " + entry.getKey() + "\n";
        }

        return extensionsString;
    }

    private String getImplementations() {
        String implemenetationsString = "";
        for (Entry<String, Set<String>> entry : classImplements.entrySet()) {
            for(String interfaceClass : entry.getValue()){
                implemenetationsString += interfaceClass + " .. " + entry.getKey() + "\n";
            }
        }

        return implemenetationsString;
    }


    private String getPackages() {
        String packagesEnd = "";
        if (visitedPackages.size() > 0) {
            packagesEnd = "}\n";
        }
        return packagesEnd;
    }
}

