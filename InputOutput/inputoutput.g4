grammar inputoutput;

struktur:d_type variable '(' parameter ')' '{' ret ';' '}'
        | 'void' variable '(' parameter ')' '{' '}'
        | input
        | output
        ;

parameter: (((d_type | 'void') '*'? variable (arr|empty_arr)? ','?)*) ;
d_type:('unsigned' | 'signed')?((('short' | ('long' 'long'?))? 'int') | 'char')| 'long'? 'double' | 'float';
ret     : 'return' (variable|NUM);
input : 'scanf''(' '"' input_d '"' ',' '&'variable ')' ';' ;
output :( 'printf' '(' '"' (variable|format|sign)* '"' ')' ';'
        | 'printf''(''"' (sign | variable | format | '%'(INPUT_DATA|OUTPUT_DATA))* '"' ',' variable (',' variable)* ')' ';'
        )+        
        ;  
input_d : ('%'(INPUT_DATA | empty_arr | '%'))+;
format  : OUTPUT_FORMAT;
variable: ((CHAR|INPUT_DATA|OUTPUT_DATA)+(NUM)*)+;
sign    : (SYMBOL|'&'|'*'|'('|')'|'-'|'_'|'='|'+'|'|'|'\\'|':'|';'|'\''|'"'|','|'.'|'<'|'>'|'/'|'?'|'['|']'|empty_arr)+;
empty_arr   : '[]';
arr     : '['(NUM|'\''(CHAR|INPUT_DATA|OUTPUT_DATA)'\'')?']';

INPUT_DATA  : [cdefginopsux];
OUTPUT_DATA : [EGX];
OUTPUT_FORMAT : '\\'[bfnrt0vaN'"?] ;
CHAR         : [a-zA-Z]+;
NUM         : [0-9]+;
SYMBOL      : [`~!@#$%^]+;


WS          : [ \t\r\n]+ -> skip;
