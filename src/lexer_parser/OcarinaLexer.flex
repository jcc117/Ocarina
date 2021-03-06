package lexer_parser;
import java_cup.runtime.*;
import java.math.*;

%%

%public
%class OcarinaLexer
%extends sym
/*
%class OcarinaLexerTokenizer
%implements TokenizerTypes
*/
%cup
%line
%column

%eofval{
	return symbol(EOF);
%eofval}

%{
	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
    }

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
%}

DecimalLiteral = [1-9][0-9]*
HexLiteral = 0(x | X)[0-9a-fA-F]+
OctalLiteral = 0[0-7]+
FloatLiteral = ([0-9]*[.])?[0-9]+
Identifier = [a-zA-Z_][a-zA-Z0-9_?]*
LineComment = #[^\n]*\n?
BlockComment = "'''" [^*] ~"'''"
WhiteSpace = [\t\n\r]+
String = \"[^\"]*\" | \'[^\']*\'

%%

/*Keywords*/
"start" {return symbol(START);}
"end"	{return symbol(END);}
"class"	{return symbol(CLASS);}
"extends"	{return symbol(EXTENDS);}
//"mock"	{return symbol(MOCK);}
//"stub"	{return symbol(STUB);}
"void"	{return symbol(VOID);}
"int"	{return symbol(INT);}
"decimal"	{return symbol(FLOAT);}
"boolean"	{return symbol(BOOLEAN);}
"string"	{return symbol(STRING);}
"begin"	{return symbol(BEGIN);}
"if"	{return symbol(IF);}
"rather"	{return symbol(RATHER);}
"else"	{return symbol(ELSE);}
"while"	{return symbol(WHILE);}
"return"	{return symbol(RETURN);}
"and"	{return symbol(AND);}
"or"	{return symbol(OR);}
"nand"	{return symbol(NAND);}
"nor"	{return symbol(NOR);}
"true"	{return symbol(TRUE);}
"false"	{return symbol(FALSE);}
"equals"	{return symbol(EQUALS);}
"this"	{return symbol(THIS);}
"nil"	{return symbol(NIL);}
"assert"	{return symbol(ASSERT);}
"new"	{return symbol(NEW);}
"exit"		{return symbol(EXIT);}
"print" 	{return symbol(PRINT);}
"debug" 	{return symbol(DEBUG);}
"break"		{return symbol(BREAK);}
"continue"	{return symbol(CONTINUE);}
"sage"	{return symbol(SAGE);}
"for"	{return symbol(FOR);}
"foreach"	{return symbol(FOREACH);}
"in"	{return symbol(IN);}
"do"	{return symbol(DO);}
"using"	{return symbol(USING);}
"public"	{return symbol(PUBLIC); }
"private"	{return symbol(PRIVATE); }
"protected" {return symbol(PROTECTED);}
"constructor" {return symbol(CONSTRUCTOR); }
"exec"	{return symbol(EXEC); }
"super" {return symbol(SUPER); }
"until"	{return symbol(UNTIL); }
"unless"	{return symbol(UNLESS); }
"var"	{return symbol(VAR);}
"static"	{return symbol(STATIC); }
"const"	{return symbol(CONST); }
"typeof"	{return symbol(TYPEOF); }
"differs"	{return symbol(DIFFERS); }
"try"	{return symbol(TRY); }
"catch"	{return symbol(CATCH); }
"finally"	{return symbol(FINALLY); }
"throw"	{return symbol(THROW); }
"delegate"	{return symbol(DELEGATE); }

/*Identifiers and numbers*/
{String}	{return symbol(STRINGLITERAL, yytext());}
{Identifier}	{return symbol(IDENTIFIER, yytext());}
{HexLiteral}	{return symbol(INTLITERAL, new BigInteger(yytext().substring(2), 16));}
{DecimalLiteral}	{return symbol(INTLITERAL, new BigInteger(yytext()));}
{OctalLiteral}	{return symbol(INTLITERAL, new BigInteger(yytext(), 8));}
{FloatLiteral}	{return symbol(FLOATLITERAL, new BigDecimal(yytext()));}

/*Operators*/
"++"	{return symbol(INCREMENT);}
"--"	{return symbol(DECREMENT);}
"=>"	{return symbol(POINTER);}
"&&"	{return symbol(AND);}
"||"	{return symbol(OR);}
"&!"	{return symbol(NAND);}
"|!"	{return symbol(NOR);}
"=="	{return symbol(EQUALS);}
"!="	{return symbol(DIFFERS);}
"!"	{return symbol(BANG);}
"+"	{return symbol(PLUS);}
"-"	{return symbol(MINUS);}
"*"	{return symbol(MULT);}
"^"	{return symbol(POWER);}
"/"	{return symbol(DIV);}
">="	{return symbol(GTHANE);}
"<="	{return symbol(LTHANE);}
"<"	{return symbol(LTHAN);}
">"	{return symbol(GTHAN);}
"="	{return symbol(EQUAL);}
"["	{return symbol(LBRACKET);}
"]"	{return symbol(RBRACKET);}
"{"	{return symbol(LBRACE);}
"}"	{return symbol(RBRACE);}
"("	{return symbol(LPAREN);}
")"	{return symbol(RPAREN);}
"."	{return symbol(DOT);}
";"	{return symbol(SEMICOLON);}
":"	{return symbol(COLON);}
"@"	{return symbol(AT);}
"," {return symbol(COMMA);}
"%" {return symbol(MOD);}

/*To be ignored*/
{LineComment}	{/*Do nothing*/}
{BlockComment}	{/*Do nothing*/}
{WhiteSpace}	{/*Do nothing*/}

[^]	{/*Return an error message*/}