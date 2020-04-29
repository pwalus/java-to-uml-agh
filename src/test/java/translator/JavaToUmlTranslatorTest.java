package translator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class JavaToUmlTranslatorTest {

    @Test
    void ClassWithoutMethods() throws IOException {
        test("ClassWithoutMethods.java.txt", "ClassWithoutMethods.uml.txt");
    }

    @Test
    void InterfaceWithoutMethods() throws IOException {
        test("InterfaceWithoutMethods.java.txt", "InterfaceWithoutMethods.uml.txt");
    }

    @Test
    void ClassWithMethods() throws IOException {
        test("ClassWithMethods.java.txt", "ClassWithMethods.uml.txt");
    }

    @Test
    void InterfaceWithMethods() throws IOException {
        test("InterfaceWithMethods.java.txt", "InterfaceWithMethods.uml.txt");
    }

    @Test
    void ClassWithPrimitives() throws IOException {
        test("ClassWithPrimitives.java.txt", "ClassWithPrimitives.uml.txt");
    }

    @Test
    void ClassWithReferencesTypes() throws IOException {
        test("ClassWithReferencesTypes.java.txt", "ClassWithReferencesTypes.uml.txt");
    }

    @Test
    void ClassWithGenerics() throws IOException {
        test("ClassWithGenerics.java.txt", "ClassWithGenerics.uml.txt");
    }

    @Test
    void ClassWithArrays() throws IOException {
        test("ClassWithArrays.java.txt", "ClassWithArrays.uml.txt");
    }

    @Test
    void ClassWithMethodParameters() throws IOException {
        test("ClassWithMethodParameters.java.txt", "ClassWithMethodParameters.uml.txt");
    }

    @Test
    void ClassWithFields() throws IOException {
        test("ClassWithFields.java.txt", "ClassWithFields.uml.txt");
    }

    @Test
    void InterfaceWithMethodParameters() throws IOException {
        test("InterfaceWithMethodParameters.java.txt", "InterfaceWithMethodParameters.uml.txt");
    }

    @Test
    void InterfaceWithTypes() throws IOException {
        test("InterfaceWithTypes.java.txt", "InterfaceWithTypes.uml.txt");
    }

    @Test
    void AbstractModifier() throws IOException {
        test("AbstractModifier.java.txt", "AbstractModifier.uml.txt");
    }

    @Test
    void StaticModifier() throws IOException {
        test("StaticModifier.java.txt", "StaticModifier.uml.txt");
    }

    @Test
    void AnythingInMethodBody() throws IOException {
        test("AnythingInMethodBody.java.txt", "AnythingInMethodBody.uml.txt");
    }

    @Test
    void Packages() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/onepackage/FirstClass.java.txt");
        files.add("packages/onepackage/SecondClass.java.txt");

        test(files, "packages/onepackage/Result.uml.txt");
    }

    @Test
    void TwoPackages() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/twopackages/FirstClass.java.txt");
        files.add("packages/twopackages/SecondClass.java.txt");
        files.add("packages/twopackages/ThirdClass.java.txt");

        test(files, "packages/twopackages/Result.uml.txt");
    }

    @Test
    void Relations() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/relations/FirstClass.java.txt");
        files.add("packages/relations/SecondClass.java.txt");

        test(files, "packages/relations/Result.uml.txt");
    }

    @Test
    void Extensions() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/extensions/FirstClass.java.txt");
        files.add("packages/extensions/SecondClass.java.txt");
        files.add("packages/extensions/ThirdClass.java.txt");
        files.add("packages/extensions/FourthClass.java.txt");

        test(files, "packages/extensions/Result.uml.txt");
    }

    @Test
    void GenericClasses() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/genericClasses/FirstClass.java.txt");
        files.add("packages/genericClasses/SecondClass.java.txt");
        files.add("packages/genericClasses/ThirdClass.java.txt");
        files.add("packages/genericClasses/FourthClass.java.txt");

        test(files, "packages/genericClasses/Result.uml.txt");
    }

    @Test
    void ImplementsClasses() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/implementsClasses/FirstClass.java.txt");
        files.add("packages/implementsClasses/SecondClassInterface.java.txt");
        files.add("packages/implementsClasses/ThirdClass.java.txt");
        files.add("packages/implementsClasses/FourthClassInterface.java.txt");

        test(files, "packages/implementsClasses/Result.uml.txt");
    }

    private void test(String classFile, String expectedUml) throws IOException {
        JavaToUmlTranslator javaToUmlTranslator = new JavaToUmlTranslator();
        List<Path> absolutePaths = new ArrayList<>();
        absolutePaths.add(absolutePath(classFile));

        assertEquals(
            content(expectedUml),
            javaToUmlTranslator.translate(absolutePaths)
        );
    }

    private void test(List<String> classesFile, String expectedUml) throws IOException {
        List<Path> absolutePaths = classesFile.stream()
            .map(this::absolutePath)
            .collect(Collectors.toList());

        JavaToUmlTranslator javaToUmlTranslator = new JavaToUmlTranslator();

        assertEquals(
            content(expectedUml),
            javaToUmlTranslator.translate(absolutePaths)
        );
    }

    private String content(String path) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());

        return new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
    }

    private Path absolutePath(String path) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());

        return Paths.get(file.getAbsolutePath());
    }
}