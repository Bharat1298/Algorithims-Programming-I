import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Intro to Java Arrays (Part 1)
 * 
 * Name: Bharat Khadka
 */

public class JavaArrays_Part1
{
  public static void main(String[] args)
  {
  	// a)
    double[] x = new double[20];
    
    Random random = new Random();
    
    for (int i = 0; i < 20; i++) {
        x[i] = 1.0 + 99.0 * random.nextDouble();
    }
  
    // b)
    System.out.println("Number of items in the array: " + x.length);

    // c)
    System.out.println("First array item: " + x[0]);

    // d)
    System.out.println("Last array item: " + x[x.length - 1]);

    // e) The value is the same because the last element is accessed using the length of the array - 1 because the array
    //    because the array indexes from 0, not 1
    System.out.println("Value of x[x.length – 1]: " + x[x.length - 1]);

    // f)
    System.out.println("Printing all values in the array without labels:");
    
    for (int i = 0; i < x.length; i++) {
        System.out.println(x[i]);
    }

    // g)
    System.out.println("Printing all values in the array with labels:");
    
    for (int i = 0; i < x.length; i++) {
        System.out.println("x[" + i + "]: " + x[i]);
    }

    // h)
    System.out.println("Printing all values in the array in reverse order with labels:");
    
    for (int i = x.length - 1; i >= 0; i--) {
        System.out.println("x[" + i + "]: " + x[i]);
    }
  } // end main method
} // end class JavaArrays_Part1
