grammar ExpressionGrammar;

@lexer::header {
package antlr4;
}

@parser::header {
 package antlr4;
}

prog
	: expression
    ;

expression
    :   INT  #numExp
    |   HANDLE #handle
    | 	ADD OPENING expression COMMA expression ENDING # addExp
    |	SUB OPENING expression COMMA expression ENDING #subExp
    |	MULT OPENING expression COMMA expression ENDING #multExp
    |	DIV OPENING expression COMMA expression ENDING #divExp
    | 	LET OPENING HANDLE COMMA expression COMMA expression ENDING #letExp
    ;
                  
                  
OPENING : '(';
COMMA : ',';
ENDING : ')';
ADD : 'add';
SUB : 'sub';
MULT : 'mult';
DIV : 'div';
LET : 'let';

HANDLE  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '-'?'0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r') -> skip;