grammar TestA;

@header{
  package antlr;
}

/*r : (condition operator?)*|(kh operator?)*|near*;*/
r :r SYMBOL r ('ALSO')?
  | WORD;


condition: key symbol value;
key: (WORD)+ ;
value: (WORD)+ ;
symbol: SYMBOL;
operator: OPERATOR;
kh: (ZKH* (condition operator?)+ YKH*);
near:key NEAR value;
after:key AFTER value;


OPERATOR: [aA][nN][dD]
|[Oo][Rr]
|[Nn][Oo][Tt]
|[Nn][Ee][Aa][Rr];
SYMBOL: [>=<];
WORD: [a-zA-Z0-9\u4e00-\u9fa5]+ ;
ZKH:[(];
YKH:[)];
AFTER: [aA][fF][tT][eE][rR];
NEAR: [nN][eE][aA][rR];

WS : [ \t\n]+ -> skip ; // skip spaces, tabs, newlines

