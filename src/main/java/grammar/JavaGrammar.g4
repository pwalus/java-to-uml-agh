grammar JavaGrammar;

compilationUnit
  : packageDeclaration? importDeclaration* typeDeclaration* EOF
  ;

/*
 * From §6 (Names)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html
 */

typeName
 : Identifier
 | packageOrTypeName '.' Identifier
 ;

packageOrTypeName
 : Identifier
 | packageOrTypeName '.' Identifier
 ;

/*
 * From §7 (Packages)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html
 */

packageDeclaration
  : (WS|NEWLINE).*?
  | 'package' packageName ';'
  ;

packageName
 : Identifier
 | packageName '.' Identifier
 ;

importDeclaration
 : singleTypeImportDeclaration
 | singleStaticImportDeclaration
 | (WS|NEWLINE).*?
 ;

singleTypeImportDeclaration
 : 'import' typeName ';'
 ;

singleStaticImportDeclaration
 : 'import' 'static' typeName '.' Identifier ';'
 ;

/*
 * From §4 (Types, Values, and Variables)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html
 */

typeDeclaration
 : classDeclaration
 | interfaceDeclaration
 ;

primitiveType
 : numericType
 | 'boolean'
 ;

numericType
 : integralType
 | floatingPointType
 ;

integralType
 : 'byte'
 | 'short'
 | 'int'
 | 'long'
 | 'char'
 ;

floatingPointType
 : 'float'
 | 'double'
 ;

referenceType
 : classOrInterfaceType
 | arrayType
 ;

classOrInterfaceType
 : Identifier typeArguments?
 ;

typeVariable
 : Identifier
 ;

arrayType
 : primitiveType dims
 | classOrInterfaceType dims
 | typeVariable dims
 ;

dims
 : '[' ']' ('[' ']')*
 ;

typeParameter
 : Identifier typeBound?
 ;

typeBound
 : 'extends' typeVariable
 | 'extends' classOrInterfaceType
 ;

typeArguments
 : '<' typeArgumentList '>'
 ;

typeArgumentList
 : typeArgument (',' typeArgument)*
 ;

typeArgument
 : referenceType
 | wildcard
 ;

wildcard
 : '?'
 ;

/*
 * From §8 (Classes)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html
 */
classDeclaration
  : classModifier* 'class' Identifier typeArguments? superClass? superInterfaces? classBody
  ;

superClass
 : 'extends' classOrInterfaceType
 ;

superInterfaces
 : 'implements' interfaceTypeList
 ;

interfaceTypeList
 : classOrInterfaceType (',' classOrInterfaceType)*
 ;

classModifier
  : accessModifier
  | 'abstract'
  | 'static'
  | 'final'
  ;

classBody
  : '{}'
  | '{' (WS|NEWLINE).*? '}'
  | '{' classBodyDeclaration* '}'
  ;

classBodyDeclaration
  : classMemberDeclaration
  ;

classMemberDeclaration
  : (WS|NEWLINE).*?
  | fieldDeclaration
  | methodDeclaration
  ;

fieldDeclaration
  : fieldModifier* fieldHeader ';'
  ;

fieldModifier
  : 'public'
  | 'protected'
  | 'private'
  | 'static'
  ;

fieldHeader
  : unannType fieldDeclaratorId
  ;

fieldDeclaratorId
  : Identifier
  ;

/*
 * From §9 (Interfaces)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html
 */
interfaceDeclaration
  : interfaceModifier* 'interface' Identifier typeArguments? interfaceBody
  ;

interfaceModifier
  : 'public'
  | 'abstract'
  | 'static'
  ;

interfaceBody
  : '{}'
  | '{' (WS|NEWLINE).*? '}'
  | '{' interfaceMemberDeclaration* '}'
  ;

interfaceMemberDeclaration
  : (WS|NEWLINE).*?
  | interfaceMethodDeclaration
  ;

interfaceMethodDeclaration
  : interfaceMethodModifier* methodHeader methodBody
  ;

interfaceMethodModifier
 : 'public'
 | 'abstract'
 | 'static'
 ;

/*
 * From §8.4 (Method Declarations)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4
 */
methodDeclaration
  : methodModifier* methodHeader methodBody
  ;

methodModifier
 : accessModifier
 | 'abstract'
 | 'static'
 | 'final'
 ;

methodHeader
  : result methodDeclarator
  ;

methodDeclarator
  : Identifier '(' parameterList? ')'
  ;

parameterList
  : formalParameter (',' formalParameter)*
  ;

formalParameter
  : unannType variableDeclaratorId
  ;

variableDeclaratorId
  : Identifier
  ;

methodBody
  : block
  | ';'
  ;

result
  : unannType
  | 'void'
  ;

accessModifier
  : 'public'
  | 'protected'
  | 'private'
  ;

/*
 * From §14 (Blocks)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-Block
 */
block
  : '{}'
  | '{' ( ~('{' | '}') | block)* '}'
  ;

/*
 * From §8 (UnannType)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-UnannType
 */

unannType
 : primitiveType
 | referenceType
 ;

/*
 * From §3 ( Lexical Structure)
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-JavaLetter
 */
Identifier
 : Letter (Letter|JavaLetterOrDigit)*
 ;

fragment
Letter
  : '\u0024'
  | '\u0041'..'\u005a'
  | '\u005f'
  | '\u0061'..'\u007a'
  | '\u00c0'..'\u00d6'
  | '\u00d8'..'\u00f6'
  | '\u00f8'..'\u00ff'
  | '\u0100'..'\u1fff'
  | '\u3040'..'\u318f'
  | '\u3300'..'\u337f'
  | '\u3400'..'\u3d2d'
  | '\u4e00'..'\u9fff'
  | '\uf900'..'\ufaff'
  ;

fragment
JavaLetterOrDigit
  : '\u0030'..'\u0039'
  | '\u0660'..'\u0669'
  | '\u06f0'..'\u06f9'
  | '\u0966'..'\u096f'
  | '\u09e6'..'\u09ef'
  | '\u0a66'..'\u0a6f'
  | '\u0ae6'..'\u0aef'
  | '\u0b66'..'\u0b6f'
  | '\u0be7'..'\u0bef'
  | '\u0c66'..'\u0c6f'
  | '\u0ce6'..'\u0cef'
  | '\u0d66'..'\u0d6f'
  | '\u0e50'..'\u0e59'
  | '\u0ed0'..'\u0ed9'
  | '\u1040'..'\u1049'
  ;

NEWLINE
  :'\r'? '\n'
  ;

WS
  : [ \r\t\u000C\n]+ -> channel(HIDDEN)
  ;

ErrorCharacter
  : . -> channel(HIDDEN)
  ;