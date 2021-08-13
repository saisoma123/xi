package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expinterface.Location;
import xi.expandstatements.Scope;
import java.util.Map;
public class ReadArrIndex<T> implements Expression<T>, Location<T>
{
   
   //String indexname;
   Expression<T[]> arr;
   Expression<Integer> i;
   public ReadArrIndex(Expression<T[]> arr, Expression<Integer> i)
   {
      this.arr = arr;
      this.i = i;
   }
   
   public T interpret(Scope varmap,  Map<String, FunctionDef<?>> funcmap)
   {
   
      return arr.interpret(varmap,funcmap)[i.interpret(varmap, funcmap)];
   }
   
   public Void set(Scope varmap, Map<String, FunctionDef<?>> funcmap, Expression<T> value)
   {
      arr.interpret(varmap, funcmap)[i.interpret(varmap, funcmap)] = value.interpret(varmap, funcmap);
      return null;  
   }

//When interpreted, returns value from array index, when set, interprets array, integer index, and value. Uses ReadVar in most cases or whatever type.
//Changes array in memory thats already in the scope
}