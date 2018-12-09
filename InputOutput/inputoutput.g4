grammar inputoutput;

struktur:d_type VAR '(' parameter ')' '{' ret ';' '}'
        | 'void' VAR '(' parameter ')' '{' '}'
        | input
        | output
        ;

parameter: (((d_type | 'void') '*'? VAR ('[' NUM? ']')? ','?)*) ;
d_type:('unsigned' | 'signed')?((('short' | ('long' 'long'?))? 'int') | 'char')| 'long'? 'double' | 'float';
ret     : 'return' (VAR|NUM);
input : 'scanf''(' '"' input_d '"' ',' '&' VAR ')' ';' ;
output : 'printf' '(' '"' (VAR | OUTPUT_FORMAT)+ '"' ')' ';'
        | 'printf''(''"' (VAR | OUTPUT_DATA | '%'(OUTPUT_DATA|'%'))+ '"' ',' VAR (',' VAR)* ')' ';'
        ;
input_d : '%'(INPUT_DATA |'[]'|'%');



INPUT_DATA  : [cdefginopsux];
OUTPUT_DATA : [cdeEfgGinopsuxX];
OUTPUT_FORMAT : '\\'[bfnrt0vaN'"?\\] ;

VAR         : [a-zA-Z]+[a-zA-Z0-9]*;
NUM         : [0-9]+;


WS          : [ \t\r\n]+ -> skip;
