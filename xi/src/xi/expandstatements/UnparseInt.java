package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class UnparseInt implements Expression<String>
{
   Expression<Integer> ret;

   public UnparseInt(Expression<Integer> ret)
   {
      this.ret = ret;
   }
   
   public String interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      return String.valueOf(ret.interpret(varmap, funcmap));
      
   }


}
