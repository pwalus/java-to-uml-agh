package translator;

import grammar.JavaGrammarParser.MethodHeaderContext;
import grammar.JavaGrammarParser.ParameterListContext;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

public class UmlListenerHelper {

    static boolean isAbstract(List<? extends ParserRuleContext> modifier) {
        List<String> data = modifier.stream()
            .map(RuleContext::getText)
            .collect(Collectors.toList());

        return data.contains("abstract");
    }

    static boolean isStatic(List<? extends ParserRuleContext> modifier) {
        List<String> data = modifier.stream()
            .map(RuleContext::getText)
            .collect(Collectors.toList());

        return data.contains("static");
    }

    static String getUmlModifier(List<? extends ParserRuleContext> modifier) {
        List<String> data = modifier.stream()
            .map(RuleContext::getText)
            .collect(Collectors.toList());

        String umlModifier = "~";

        if (data.contains("public")) {
            umlModifier = "+";
        } else if (data.contains("protected")) {
            umlModifier = "#";
        } else if (data.contains("private")) {
            umlModifier = "-";
        }

        return umlModifier;
    }

    static String getMethod(MethodHeaderContext ctx) {
        String method = ctx.methodDeclarator().Identifier().getText();
        String params = "";
        ParameterListContext parameterListContext = ctx.methodDeclarator().parameterList();
        if (parameterListContext != null) {
            params = parameterListContext.formalParameter().stream().map(parameter ->
                parameter.unannType().getText() + " " + parameter.variableDeclaratorId().getText()
            ).collect(Collectors.joining(", "));
        }

        return method + "(" + params + ")";
    }

}
