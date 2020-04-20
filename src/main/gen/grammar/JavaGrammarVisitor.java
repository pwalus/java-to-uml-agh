// Generated from /Users/patrykwalus/IdeaProjects/semestr8/kompil/java-to-uml/src/main/java/grammar/JavaGrammar.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#superClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClass(JavaGrammarParser.SuperClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldHeader(JavaGrammarParser.FieldHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaratorId(JavaGrammarParser.FieldDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(JavaGrammarParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(JavaGrammarParser.UnannTypeContext ctx);
}