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
        test("ClassWithoutMethods", "ClassWithoutMethods.uml");
    }

    @Test
    void InterfaceWithoutMethods() throws IOException {
        test("InterfaceWithoutMethods", "InterfaceWithoutMethods.uml");
    }

    @Test
    void ClassWithMethods() throws IOException {
        test("ClassWithMethods", "ClassWithMethods.uml");
    }

    @Test
    void InterfaceWithMethods() throws IOException {
        test("InterfaceWithMethods", "InterfaceWithMethods.uml");
    }

    @Test
    void ClassWithPrimitives() throws IOException {
        test("ClassWithPrimitives", "ClassWithPrimitives.uml");
    }

    @Test
    void ClassWithReferencesTypes() throws IOException {
        test("ClassWithReferencesTypes", "ClassWithReferencesTypes.uml");
    }

    @Test
    void ClassWithGenerics() throws IOException {
        test("ClassWithGenerics", "ClassWithGenerics.uml");
    }

    @Test
    void ClassWithArrays() throws IOException {
        test("ClassWithArrays", "ClassWithArrays.uml");
    }

    @Test
    void ClassWithMethodParameters() throws IOException {
        test("ClassWithMethodParameters", "ClassWithMethodParameters.uml");
    }

    @Test
    void ClassWithFields() throws IOException {
        test("ClassWithFields", "ClassWithFields.uml");
    }

    @Test
    void InterfaceWithMethodParameters() throws IOException {
        test("InterfaceWithMethodParameters", "InterfaceWithMethodParameters.uml");
    }

    @Test
    void InterfaceWithTypes() throws IOException {
        test("InterfaceWithTypes", "InterfaceWithTypes.uml");
    }

    @Test
    void AbstractModifier() throws IOException {
        test("AbstractModifier", "AbstractModifier.uml");
    }

    @Test
    void StaticModifier() throws IOException {
        test("StaticModifier", "StaticModifier.uml");
    }

    @Test
    void AnythingInMethodBody() throws IOException {
        test("AnythingInMethodBody", "AnythingInMethodBody.uml");
    }

    @Test
    void Packages() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/onepackage/FirstClass");
        files.add("packages/onepackage/SecondClass");

        test(files, "packages/onepackage/Result.uml");
    }

    @Test
    void TwoPackages() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/twopackages/FirstClass");
        files.add("packages/twopackages/SecondClass");
        files.add("packages/twopackages/ThirdClass");

        test(files, "packages/twopackages/Result.uml");
    }

    @Test
    void Relations() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/relations/FirstClass");
        files.add("packages/relations/SecondClass");

        test(files, "packages/relations/Result.uml");
    }

    @Test
    void Extensions() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/extensions/FirstClass");
        files.add("packages/extensions/SecondClass");
        files.add("packages/extensions/ThirdClass");
        files.add("packages/extensions/FourthClass");

        test(files, "packages/extensions/Result.uml");
    }

    @Test
    void GenericClasses() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/genericClasses/FirstClass");
        files.add("packages/genericClasses/SecondClass");
        files.add("packages/genericClasses/ThirdClass");
        files.add("packages/genericClasses/FourthClass");

        test(files, "packages/genericClasses/Result.uml");
    }

    @Test
    void ImplementsClasses() throws IOException {
        List<String> files = new ArrayList<>();
        files.add("packages/implementsClasses/FirstClass");
        files.add("packages/implementsClasses/SecondClassInterface");
        files.add("packages/implementsClasses/ThirdClass");
        files.add("packages/implementsClasses/FourthClassInterface");

        test(files, "packages/implementsClasses/Result.uml");
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