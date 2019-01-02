grammar inputoutput;

struktur: function                                              //Fungsi dan tipe data
        | input                                                 //Fungsi scanf()
        | output                                                //Fungsi printf()
        ;

function : d_type variable '(' parameter ')' '{' (input|output)*  ret ';' '}'
         | 'void' variable '(' parameter ')' '{' (input|output)* '}'
         ;
//Parameter fungsi
parameter: (((d_type | 'void') '*'? variable (arr|empty_arr)? ','?)*) ; 

//Tipe data
d_type:('unsigned' | 'signed')?((('short' | ('long' 'long'?))? 'int') | 'char')| 'long'? 'double' | 'float';

//Return
ret     : 'return' (variable|NUM);

//scanf()
input : 'scanf''(' '"' input_d '"' ',' '&'variable ')' ';'
      ;

//printf()
output :( 'printf' '(' '"' (variable|format|sign)* '"' ')' ';'
        | 'printf''(''"' (sign | variable | format | '%'(INPUT_DATA|OUTPUT_DATA))* '"' ',' variable (',' variable)* ')' ';'
        )+
        ;

//tipe data input  
input_d : ('%'(INPUT_DATA | empty_arr | '%'))+;

//Format print
format  : OUTPUT_FORMAT;

//Variabel
variable: ((CHAR|INPUT_DATA|OUTPUT_DATA)+(NUM)*)+;

//Symbol
sign    : (SYMBOL|'&'|'*'|'('|')'|'-'|'_'|'='|'+'|'|'|'\\'|':'|';'|'\''|'"'|','|'.'|'<'|'>'|'/'|'?'|'['|']'|empty_arr)+;

//Empty Array
empty_arr   : '[]';

//Array
arr     : '['(NUM|'\''(CHAR|INPUT_DATA|OUTPUT_DATA)'\'')?']';


INPUT_DATA  : [cdefginopsux];
OUTPUT_DATA : [EGX];
OUTPUT_FORMAT : '\\'[bfnrt0vaN'"?] ;
CHAR         : [a-zA-Z]+;
NUM         : [0-9]+;
SYMBOL      : [`~!@#$%^]+;


WS          : [ \t\r\n]+ -> skip;
