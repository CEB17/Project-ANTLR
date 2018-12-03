grammar inputoutput;

struktur:d_type VAR '(' parameter ')' '{' ret '}';

parameter: ((d_type '*'? VAR ('[' NUM? ']')? ','?)*) ;
d_type:('unsigned' | 'signed')?((('short' | ('long' 'long'?))? 'int') | 'char')| 'long'? 'double' | 'float' | 'void';
ret: 'return' VALUE ;

VAR: [a-zA-Z]+[a-zA-Z0-9]* ;
NUM: [0-9]+;
VALUE: [a-zA-Z0-9]+;
WS : [ \t\r\n]+ -> skip;
