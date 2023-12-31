import java.util.Scanner;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Input/Output in Java
 * 
 * Name: Bharat Khadka
 */

public class InputOutputLab
{
  public static void main(String[] args)
  {
    // 1. declare two integer variables
	  int a, b;
    // 2. declare and create a keyboard Scanner named 'scan'
	  Scanner scan = new Scanner(System.in);
    // 3. prompt the user to "Enter two integers separated by one or more spaces"
	  System.out.println("Enter two integers separated by one or more spaces");
    // 4. assign each integer variable to a user-input integer value
	  a = scan.nextInt();
	  b = scan.nextInt();
    // 5. output the larger (maximum) of the two variables (values) by calling the Math.max method
	  System.out.println(Math.max(a, b));
  } // end main method
} // end InputOutputLab class