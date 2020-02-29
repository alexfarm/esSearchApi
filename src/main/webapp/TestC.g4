grammar TestC;

@header{
  package antlr;
}
expression
 : op=role atom                                    #roleExpression
 | atom op=logic atom                              #logicExpression
 | atom op=logic atom                              #logicExpression
 | atom op=logic atom COMMA atom                   #logicExpression
 | LPAREN expression RPAREN                        #parenExpression
 | op=not expression                               #notExpression
 | atom op=comparator atom                         #comparatorExpression
 | left=expression op=binary right=expression      #binaryExpression
 | atom                                            #atomExpression
 ;

atom
 : IDENTIFIER
 | DECIMAL
 | INT
 ;

comparator
 : GT | GE | LT | LE | EQ
 ;

binary
 : AND | OR
 ;

logic
 : AFTER | NEAR | FREQ | OFFSET
 ;

role
 : ROLEA | ROLEB;

not
 : NOT;

AND        : 'AND' ;
OR         : 'OR' ;
NEAR       : 'NEAR' ;
AFTER      : 'AFTER' ;
NOT        : 'NOT';
FREQ       : 'freq';
OFFSET     : 'offset';
GT         : '>' ;
GE         : '>=' ;
LT         : '<' ;
LE         : '<=' ;
EQ         : '=' ;
LPAREN     : '(' ;
RPAREN     : ')' ;
COMMA      : ',' ;
DECIMAL    : '-'? [0-9]+ ( '.' [0-9]+ )? ;
ROLEA      : 'A-' ;
ROLEB      : 'B-' ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* ;
INT        : [0-9] ;
WS         : [ \r\t\u000C\n]+ -> skip;