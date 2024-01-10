// Array_Spinner.java

import java.io.*;
import java.util.*;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Rotating Java Arrays
 * 
 * Name: Bharat Khadka
 */

public class Array_Spinner
{
  // Complete the rotate method implementation here:
  public static double[] rotate(double[] values, int rotation)
  {
	  double[] y = new double[values.length];
	  
	  for (int i = 0; i < y.length; i++) {
		  y[i] = values[(i + rotation) % values.length];
	  }
	  
	  return y;
  } // end rotate method
  
  public static void main(String[] args)
  {
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
    
    System.out.println("Before rotation:  ==============================");
    
    for (int i = 0; i < x.length; i++)
    {
      System.out.println("x[" + i + "]:  " + x[i]);
    }
    
    x = rotate(x, 3);
    
    System.out.println("\nAfter rotation:  ==============================");   
       
    for (int i = 0; i < x.length; i++)
    {
      System.out.println("x[" + i + "]:  " + x[i]);
    }
  } // end main method
  
} // end class Array_Spinner
