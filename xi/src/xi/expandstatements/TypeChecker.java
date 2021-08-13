package xi.expandstatements;
import xi.expinterface.*;
import xi.enums.*;
import xi.operations.*;
import xi.literals.*;
public class TypeChecker<T> 
{
   Expression<?> val;
   Object type;
   public TypeChecker(Expression<?> val, Object type)
   {
      this.val = val;
      this.type = type;
   }
   public Expression<T> enforce()
   {         
      if(type instanceof Integer)
      {      
         if(val instanceof IntegerLiteral)
         {
            return (Expression<T>) val;
         }
         else if(val instanceof ReadVariable)
         {
            return (Expression<T>) val;
         }  
         else if(val instanceof ReadArrIndex)
         {
            return (Expression<T>) val;
         }    
         /*
         else if(val instanceof ArrayLiteral)
         {
         return (Expression<T>) val;
         }  
         */
         else if(val instanceof BasicOp)
         {
            BasicOp newval = (BasicOp) val;
            new TypeChecker(newval.getA(), type).enforce();
            new TypeChecker(newval.getB(), type).enforce();
            return (Expression<T>) val;
         }
         else if(val instanceof CompareOp)
         {
            CompareOp newval = (CompareOp) val;
            new TypeChecker(newval.getA(), type).enforce();
            new TypeChecker(newval.getB(), type).enforce();
            return (Expression<T>) val;
         }
         else if(val instanceof UnparseInt)
         {
            return (Expression<T>) val;
         }
         else
         {
            throw new IllegalArgumentException("The type was wrong!");
         }
      }
      else if(type instanceof Boolean)
      {
         if(val instanceof BooleanLiteral)
         {
            return (Expression<T>) val;
         }
         else if(val instanceof ReadVariable)
         {
            return (Expression<T>) val;
         }
         else if(val instanceof ReadArrIndex)
         {
            return (Expression<T>) val;
         }    
         else if(val instanceof Bool)
         {
            Bool newval = (Bool) val;
            new TypeChecker(newval.getA(), type).enforce();
            new TypeChecker(newval.getB(), type).enforce();
            return (Expression<T>) val;
         }
         else if(val instanceof NotOp)
         {
            return (Expression<T>) val;
         }
         else if(val instanceof CompareOp)
         {
            CompareOp newval = (CompareOp) val;
            new TypeChecker(newval.getA(), Integer.valueOf(0)).enforce();
            new TypeChecker(newval.getB(), Integer.valueOf(0)).enforce();
            return (Expression<T>) val;
         }
         else
         {
            throw new IllegalArgumentException("The type was wrong!");
         }
      }  
      else if(type instanceof Double)
      {
         return (Expression<T>) val;
      }
      return null;
      
   }
   


}
