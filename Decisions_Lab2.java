/*
 * Decisions_Lab2.java
 */

import java.util.Scanner;

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: An introduction to the if/else statement
 *
 * @author *** Replace with your name ***
 */
public class Decisions_Lab2

{
  public static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args)
  {
	  
	System.out.println("Enter a value for w:");
	int w = scan.nextInt();
	    
    System.out.println("Enter a value for x:");
    int x = scan.nextInt();
    
    System.out.println("Enter a value for y:");
    int y = scan.nextInt();
    
    System.out.println("Enter a value for z:");
    int z = scan.nextInt();
    
    int minimum;
    
    if (w < x && w < y && w < z)
    {
        minimum = w;
    }
    else if (x < w && x < y && x < z)
    {
        minimum = x;
    }
    else if(y < w && y < x && y < z)
    {
    	minimum = y;
    }
    else{
    	minimum = z;
    }
    
    System.out.println("The smallest value is " + minimum);
    
  } // end main method
  
} // end class Decisions_Lab2

