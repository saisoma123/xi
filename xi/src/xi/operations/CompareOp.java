package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.enums.Compare;
import xi.expandstatements.Scope;
import java.util.Map;
public class CompareOp implements Expression<Boolean>
{
   Compare op;
   Expression<Integer> a, b;
   
   public CompareOp(Compare op, Expression<Integer> a, Expression<Integer> b)
   {
      this.op = op;
      this.a = a;
      this.b = b;
   }
   public Expression<Integer> getA()
   {
      return a;
   }
   public Expression<Integer> getB()
   {
      return b;
   }
   public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
		Boolean x = true;
      switch(op)
      {
            
         case GREATER_THAN:
            x = a.interpret(varmap, funcmap) > b.interpret(varmap, funcmap);
            break;
         
         case GREATER_THAN_OR_EQUAL_TO:
            x = a.interpret(varmap, funcmap) >= b.interpret(varmap, funcmap);
            break;
            
         case LESS_THAN:
            //System.out.println(a.interpret(varmap, funcmap));
            x = a.interpret(varmap, funcmap) < b.interpret(varmap, funcmap);
            break;
            
         case LESS_THAN_OR_EQUAL_TO:
            x = a.interpret(varmap, funcmap) <= b.interpret(varmap, funcmap);
            break;
         
      }
      return x;
   
   
   }


}