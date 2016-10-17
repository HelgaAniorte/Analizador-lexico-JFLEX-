package a_lexico;
import static a_lexico.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"//" {/*Ignore*/}
"="  {return ASIGNAR;}
"==" {return IGUAL;}
"!=" {return DIFERENTE;}
"+"  {return SUMA;}
"*"  {return MUL;}
"-"  {return RESTA;}
"/"  {return DIV;}
"'"  {return COMILLA;}
"("  {return PARENTESIS_ABIERTO;}
")"  {return PARENTESIS_CERRADO;}
">"  {return MAYOR;}
"<"  {return MENOR;}
"["  {return CORCHETE_ABIERTO;}
"]"  {return CORCHETE_CERRADO;}
"{"  {return LLAVE_ABIERTA;}
"}"  {return LLAVE_CERRADA;}
";"  {return PUNTO_Y_COMA;}
"mientras" {return PALABRA_RESERVADA;}
"si" {return PALABRA_RESERVADA;}
"para" {return PALABRA_RESERVADA;}
"principal" {return PALABRA_RESERVADA;}
"imprime"   {return PALABRA_RESERVADA;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}