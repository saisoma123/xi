package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class Println<T> implements Expression<Void>
{
   Expression<T[]> exp;
   
   public Println(Expression<T[]> exp)
   {
      this.exp = exp;
   }
   public Void interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      System.out.println(exp.interpret(varmap, funcmap));
      return null;
   }
}