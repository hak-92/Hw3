import java.util.*;

     
public class Calculator {

 

 private static Scanner input;

public static void main ( String [] args)

  {
  input = new Scanner (System.in);
   
   float num1;
   float num2;
   float result;
   //String operation;
   
   
 //  System.out.println(" TO use this calculator application, enter your first number then enter operation, just the symbol, and finally enter the second number."); 


   num1 = input.nextFloat();
  
  
   System.out.println("Now input the desired operation");
   String operation = input.next();

  
    
   if (operation.equals ("+"))
   {
	   num2 = input.nextFloat();
    result = num1 + num2;
    System.out.print( result);
   }
   
   if (operation.equals ("-"))
   {
	  num2 = input.nextFloat();
    result = num1 - num2;
    System.out.print( result);
   }

   if (operation.equals ("*"))
   {
	num2 = input.nextFloat();
    result = num1 * num2;
    System.out.print( "hi" + result);
   }
   
   if (operation.equals ("/"))
   {
	 num2 = input.nextFloat();
    result = num1 / num2;
    System.out.print( result);
   }
   
   
   
  }
} 
   