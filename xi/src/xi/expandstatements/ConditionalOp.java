package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Block;
import xi.expandstatements.Scope;
import java.util.*;
public class ConditionalOp implements Expression<Void>
{
   Expression<Boolean> condition;
   Expression<Void> conseq, alt;
   public ConditionalOp(Expression<Boolean> condition, Expression<Void> conseq, Expression<Void> alt)
   {
      this.condition = condition;
      this.conseq = conseq;
      this.alt = alt;

   }
   public Void interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap) //Have to add scope mechanism
   {
      return (condition.interpret(varmap, funcmap) ? conseq : alt).interpret(varmap, funcmap);
   }
}
//If true then execute conseq, else execute alt, works on single lines and blocks