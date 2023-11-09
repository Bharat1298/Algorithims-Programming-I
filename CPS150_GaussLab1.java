import java.util.Scanner;

/*
 * CPS150_GaussLab1.java
 */

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: A childish sum
 *
 *@author *** Bharat Khadka ***
 */

public class CPS150_GaussLab1
{
  /*
   * gaussSum(int) -> int
   * 
   * method is passed a positive integer n
   * method returns the sum from 1 to n
   * 
   * ex: gaussSum(10) -> 55
   * 
   * *** ADD METHOD IMPLEMENTATION AFTER NEXT LINE ***
   */
  public static int gaussSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
  
  /*
   * main method:
   *   1. gets a positive integer as user input
   *   2. calls the gaussSum method to calculate
   *      the sum from 1 to n
   *   3. outputs the results
   */
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    if (in.hasNextInt())
    {
      int number = in.nextInt();
      if (number > 0)
      {
        int sum = gaussSum(number);
        System.out.printf("\nThe sum from 1 to %d is %d.\n",
                          number, sum);
      }
      else
      {
        System.out.println("Not a positive integer");
      }
    }
    else
    {
      System.out.println("Not an integer");
    }
  } // end main method
} // end class CPS150_GaussLab1
