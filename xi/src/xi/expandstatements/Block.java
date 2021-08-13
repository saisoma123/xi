package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
public class Block implements Expression<Scope>
{
   List<Expression<Void>> statements;
   public Block(List<Expression<Void>> statements)
   {
      this.statements = statements;
   }
   public Scope interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      Scope child = new Scope(varmap);
      for(Expression<Void> exp: statements)
      {
         //HashMap<String, Object> newvarmap = new HashMap<String, Object>();
         exp.interpret(child, funcmap);
      }
      return child;
   }
}
//Creates new scope from argscope, and interprets expressions in function block and adds new vars to child scope.
//All statements are basically void, DeclareVar, SetLocation, WhileLoop, ConditionalOp