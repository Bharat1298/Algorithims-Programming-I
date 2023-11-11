import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Intro to Java Arrays (Part 2)
 * 
 * Name: Bharat Khadka
 */

public class JavaArrays_Part2
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
    double total = 0;
    
    for (int i = 0; i < x.length; i++) {
        total += x[i];
    }
    
    System.out.println("Total of all elements in array x: " + total);

    // c)
    double smallest = x[0];
    
    for (int i = 1; i < x.length; i++) {
        if (x[i] < smallest) {
            smallest = x[i];
        }
    }
    
    System.out.println("Minimum value in x: " + smallest);

    // d)
    double smallestWithIndex = x[0];
    
    int smallestIndex = 0;
    
    for (int i = 1; i < x.length; i++) {
        if (x[i] < smallestWithIndex) {
            smallestWithIndex = x[i];
            smallestIndex = i;
        }
    }
    
    System.out.println("Minimum value in x: " + smallestWithIndex);
    System.out.println("Index of the minimum value: " + smallestIndex);
  } // end main method
} // end class JavaArrays_Part2
