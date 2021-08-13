grammar xig;

@header {
package xi.parser;
import xi.expinterface.*;
import xi.enums.*;
import xi.operations.*;
import xi.literals.*;
import xi.expandstatements.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.AbstractMap;
import java.util.HashMap;
import java.io.*;
}

parse returns [Map<String, FunctionDef<?>> val = new HashMap<>()]
 : USE ID {
     //BufferedReader file = new BufferedReader(new FileReader("C:/Users/surya/Desktop/xi/test/" + $ID.text + ".ixi")); 
     //String line = file.readLine();
     //while(line != Double.valueOf(2.0))
     //{
     //    $val.put(.);
     //}
    }
 | (functiondef {$val.put($functiondef.val.getKey(), $functiondef.val.getValue());})* EOF
 ; 
type
    : INT
    | BOOL
    | type LBRACKET RBRACKET
    ;

functiondef returns [Map.Entry<String, FunctionDef<?>> val] locals [List<String> varnames = new LinkedList<>(), List<Expression<Void>> block = new LinkedList<>()]
    : funcname=ID LPAREN (argname=ID COLON type COMMA {$varnames.add($argname.text);})* RPAREN COLON type LBRACE (statement=exp SCOLON {$block.add(new TypeChecker<Void>($statement.val, Double.valueOf(2.0)).enforce());} )* RETURN ret=exp SCOLON RBRACE {$val = new AbstractMap.SimpleEntry<String, FunctionDef<?>>($funcname.text, new FunctionDef($varnames, new Block($block), $ret.val)); }
    ;

exp returns [Expression<?> val] locals [List<Expression<?>> expList = new LinkedList<>(), List<Expression<Void>> statements = new LinkedList<>();]
    : COMMENT 
    | ID {$val = new ReadVariable($ID.text);}
    | array=exp LBRACKET value=exp RBRACKET {$val = new ReadArrIndex($array.val, $value.val);}
    | LPAREN exp RPAREN { $val = $exp.val;}
    | MINUS expr=exp { $val = new BasicOp(ArithOp.SUBTRACT, new IntegerLiteral(0), new TypeChecker<Integer>($expr.val, Integer.valueOf(0)).enforce()); }
    | NOT expr=exp { $val = new NotOp(BoolOp.NOT, new TypeChecker<Boolean>($expr.val, Boolean.valueOf(true)).enforce()); }
    | left=exp MULT right=exp { $val = new BasicOp(ArithOp.MULTIPLY, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp HIGHMULT right=exp { $val = new BasicOp(ArithOp.HIGHMULTIPLY, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp DIV right=exp { $val = new BasicOp(ArithOp.DIVIDE, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp MODULO right=exp { $val = new BasicOp(ArithOp.MODULO, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    ///
    | left=exp PLUS right=exp { 
        $val = new BasicOp(ArithOp.ADD, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce());
        
    }
    | left=exp MINUS right=exp { $val = new BasicOp(ArithOp.SUBTRACT, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    ///
    | left=exp LESS right=exp { $val = new CompareOp(Compare.LESS_THAN, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp LESSEQ right=exp { $val = new CompareOp(Compare.LESS_THAN_OR_EQUAL_TO, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp GREATEQ right=exp { $val = new CompareOp(Compare.GREATER_THAN_OR_EQUAL_TO, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    | left=exp GREAT right=exp { $val = new CompareOp(Compare.GREATER_THAN, new TypeChecker<Integer>($left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>($right.val, Integer.valueOf(0)).enforce()); }
    ///
    | left=exp EQ right=exp { $val = new GenEqOperation(EqualityOp.EQUAL, $left.val, $right.val); }
    | left=exp NOTEQ right=exp { $val = new GenEqOperation(EqualityOp.NOTEQUAL, $left.val, $right.val); }
    ///
    | left=exp AND right=exp { $val = new Bool(BoolOp.AND, new TypeChecker<Boolean>($left.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Boolean>($right.val, Boolean.valueOf(true)).enforce()); }
    | left=exp OR right=exp { $val = new Bool(BoolOp.OR, new TypeChecker<Boolean>($left.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Boolean>($right.val, Boolean.valueOf(true)).enforce()); }
    //
    | NUMBER { $val = new IntegerLiteral(Integer.parseInt($NUMBER.text)); } 
    | TRUE { $val = new BooleanLiteral(true); }
    | FALSE { $val = new BooleanLiteral(false); }
    | LBRACE (exp COMMA { $expList.add($exp.val); })* RBRACE { $val = new ArrayLiteral($expList.toArray(new Expression<?>[0])); }
    | QUOTE alpha=(MIX|ID|NUMBER) QUOTE {
        IntegerLiteral[] newarr = new IntegerLiteral[$alpha.text.length()];
        for(int i = 0; i < newarr.length; i++)
        {  
            newarr[i] = new IntegerLiteral((int)($alpha.text.toCharArray()[i]));
        }
        $val = new ArrayLiteral(newarr);
    }
    ///
    | ID COLON type { $val = new DeclareVar($ID.text); }
    | ID COLON type ASSIGN r=exp {
        $val = new DeclareVar($ID.text, $r.val);
     }
    | ID ASSIGN rhs=exp { $val = new SetLocation(new ReadVariable($ID.text), $rhs.val); }
    | array=exp LBRACKET index=exp RBRACKET ASSIGN rhs=exp { $val = new SetLocation(new ReadArrIndex($array.val, $index.val), $rhs.val); }
    ///
    | LBRACE (exp SCOLON { $statements.add(new TypeChecker<Void>($exp.val, Double.valueOf(2.0)).enforce()); })* RBRACE { $val = new Block($statements); }
    | WHILE guard=exp body=exp {$val = new WhileLoop(new TypeChecker<Boolean>($guard.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Void>($body.val, Double.valueOf(2.0)).enforce()); }
    | IF condition=exp conseq=exp ELSE alt=exp {$val = new ConditionalOp(new TypeChecker<Boolean>($condition.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Void>($conseq.val, Double.valueOf(2.0)).enforce(), new TypeChecker<Void>($alt.val, Double.valueOf(2.0)).enforce()); } 
    | ID LPAREN (arg=exp COMMA {$expList.add($arg.val);})* RPAREN {$val = new FunctionCall($ID.text, $expList); }
    | PRINT LPAREN exp RPAREN { $val = new Print((Expression<Object[]>)$exp.val); }
    | PRINTLN LPAREN exp RPAREN { $val = new Print((Expression<Object[]>)$exp.val); }
    | GETCHAR LPAREN RPAREN {$val = new Getchar();}
    | READLN LPAREN RPAREN { $val = new Readln(); }
    | EO LPAREN RPAREN {$val = new Eof(); }
    | PARSEINT LPAREN exp RPAREN {$val = new ParseInt((Expression<Object[]>)$exp.val);}
    | UNPARSEINT LPAREN exp RPAREN {$val = new UnparseInt(new TypeChecker<Integer>($exp.val, Integer.valueOf(0)).enforce());}
    ;

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MODULO : '%';
HIGHMULT : '>>';

ASSIGN : '=';
EO: 'eof';

EQ : '==';
NOTEQ : '!=';
GREATEQ : '>=';
LESSEQ : '<=';
GREAT : '>';
LESS : '<';

NOT: '!';
AND: '&';
OR: '|';

INT: 'int';
//ARR: '';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'FALSE';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
RETURN: 'return';
LENGTH: 'length';
PRINT: 'print';
PRINTLN: 'println';
GETCHAR: 'getchar';
PARSEINT: 'parseint';
UNPARSEINT: 'unparseint';
READLN: 'readln';
COMMENT: '//' ~[\r\n]* -> skip;

ID: [a-zA-Z] [a-zA-Z0-9]*;
NUMBER: [0-9]+;
MIX: NUMBER ID;

USCORE: '_';
QUOTE: '"';
SQUOTE: '\'';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';

COLON: ':';
SCOLON: ';';
COMMA: ',';


USE: 'use';
EXT: '.ixi';

WHITESPACE: [\t\r\n]+ -> skip;
SPACE : ' '+ -> skip;