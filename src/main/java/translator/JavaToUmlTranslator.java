package translator;

import grammar.JavaGrammarLexer;
import grammar.JavaGrammarParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JavaToUmlTranslator {

    public String translate(List<Path> absolutePaths) throws IOException {
        UmlListener umlListener = new UmlListener();

        for (Path path : absolutePaths) {
            CharStream input = CharStreams.fromString(content(path));

            JavaGrammarLexer lexer = new JavaGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaGrammarParser parser = new JavaGrammarParser(tokens);
            ParseTree tree = parser.compilationUnit();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(umlListener, tree);
        }

        return umlListener.umlClass();
    }

    private String content(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

}
