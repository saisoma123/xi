//import JavaImplementationofXi.Statements.FunctionDef;
package xi.expinterface;
import xi.expandstatements.Scope;
import java.util.*;
public interface Expression<E>
{
   //private E e;
   
   E interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap);//Used for execution of instructions
   
   //public Class<T> parse(); Have to make a parser object first for return type
   
   //public E typecheck(); typechecking can be done in parsing method, no need for separate method

//Used for giving constructs in language a type and for execution 



}