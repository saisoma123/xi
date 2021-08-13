package xi.expinterface;
import xi.expandstatements.Block;
import xi.expandstatements.Scope;
import java.util.*;
import java.lang.reflect.*;
import xi.expandstatements.Scope;
public class FunctionDef<T>
{
   List<String> argnames;
   Expression<Scope> body;
   Expression<T> ret;

   public FunctionDef(List<String> argnames, Expression<Scope> body, Expression<T> ret)
   {
      this.argnames = argnames;
      this.body = body;
      this.ret = ret;
   }
   
   public T invoke(List<?> args, Map<String, FunctionDef<?>> funcmap)
   {
      Scope argscope = new Scope(null);
      int i = 0;
      for(String entry: argnames)
      {
         argscope.putNew(entry, args.get(i));
         i++;
      }
      Scope blockscope = body.interpret(argscope, funcmap);
      return ret.interpret(blockscope, funcmap);
   
   } 
//Creates argument scope, then block scope is created using vars from argscope and itself (its own scope). The return expression is then interpreted with vars defined in blockscope as well as argscope (the parent scope)



}