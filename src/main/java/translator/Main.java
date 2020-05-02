package translator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Absolute path needed!");
            System.exit(-1);
        }

        File file = new File(args[0]);
        if (!file.isDirectory()) {
            System.out.println("File is not directory!");
            System.exit(-1);
        }

        List<Path> pathList = new DirectoryList(file).getList();
        JavaToUmlTranslator javaToUmlTranslator = new JavaToUmlTranslator();
        System.out.println(javaToUmlTranslator.translate(pathList));
    }
}
