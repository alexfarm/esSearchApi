grammar TestB;

expr : expr '*' expr
     | expr '+' expr
     | INT
     ;

INT: [0-9]+;

WS         : [ \r\t\u000C\n]+ -> skip;