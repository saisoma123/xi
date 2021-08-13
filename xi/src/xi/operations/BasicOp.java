package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.enums.ArithOp;
import xi.expandstatements.Scope;
import java.util.Map;

public class BasicOp implements Expression<Integer>
{

   ArithOp op;
   Expression<Integer> a, b;
   public BasicOp(ArithOp op, Expression<Integer> a, Expression<Integer> b) //Allows for combining two numbers and compound expressions
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
	public Integer interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap) //uses switch case based on ArithOp name 
	{
		Integer x = 0;
      switch(op)
      {
         case ADD:
            x = a.interpret(varmap, funcmap) + b.interpret(varmap, funcmap);
            break;
            
         case SUBTRACT:
            x = a.interpret(varmap, funcmap) - b.interpret(varmap, funcmap);
            break;
         
         case MULTIPLY:
            x = a.interpret(varmap, funcmap) * b.interpret(varmap, funcmap);
            break;
            
         case DIVIDE:
            x = a.interpret(varmap, funcmap) / b.interpret(varmap, funcmap);
            break;
            
         /*
         case EXPONENT:
            x = (Integer)Math.pow(a.interpret(), b.interpret());
            break;
         */
         
         case MODULO:
            x = a.interpret(varmap, funcmap) % b.interpret(varmap, funcmap);
            break;
         case HIGHMULTIPLY:
            x = a.interpret(varmap, funcmap) >> b.interpret(varmap, funcmap);
            break;
      }
      return x;
	}
}