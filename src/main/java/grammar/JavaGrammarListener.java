// Generated from /Users/patrykwalus/IdeaProjects/semestr8/kompil/java-to-uml/src/main/java/grammar/JavaGrammar.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#superClass}.
	 * @param ctx the parse tree
	 */
	void enterSuperClass(JavaGrammarParser.SuperClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#superClass}.
	 * @param ctx the parse tree
	 */
	void exitSuperClass(JavaGrammarParser.SuperClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void enterFieldHeader(JavaGrammarParser.FieldHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void exitFieldHeader(JavaGrammarParser.FieldHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaratorId(JavaGrammarParser.FieldDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaratorId(JavaGrammarParser.FieldDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(JavaGrammarParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(JavaGrammarParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaGrammarParser.UnannTypeContext ctx);
}