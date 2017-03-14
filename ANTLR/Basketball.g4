grammar Basketball;

start   :
        list 'EOF' ;

list    : expr ';' list
        | ;

expr    : term terms;

terms   : '+' term terms
        | '-' term terms
        | ;

term : factor factors;

factors : '*' factor factors
        | '/' factor factors
        | mod factor factors
        | ;

factor : '(' expr ')'
        | id
        | NUM ;

mod : 'MOD';

id : LETTER ( LETTER | NUM )*;

NUM : '0'..'9'+;

LETTER : 'A'..'Z'
       | 'a'..'z';

WS : [ \r\t\n] -> skip ;
