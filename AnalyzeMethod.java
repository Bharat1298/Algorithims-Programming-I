/*
 * CPS 150, Algorithms & Programming I
 *
 * Lab Project: Analyze the Method
 * 
 * Program sums the values of two variables using a sum method
 * 
 * Name: Bharat Khadka
 */

public class AnalyzeMethod
{
   public static void main(String[] args)
   {
      int x = 5;
      int y = 3;
      System.out.println(x);
      System.out.println(y);
      System.out.println("CHANGE");
      int sum = sum(x, y);
      System.out.println(x);
      System.out.println(y);
      System.out.println("x:  " + x + " y:  " + y + " Sum:  " + sum);
   } // end main method
        
   /**
      Computes the sum of two arguments.
      @param a an int operand to be added
      @param b another int operand
      @return the sum of a and b 
   */
   public static int sum(int a, int b)
   {
      a = 5;
      b = 6;
      return a + b;
   } // end sum method
} // end AnalyzeMethod class