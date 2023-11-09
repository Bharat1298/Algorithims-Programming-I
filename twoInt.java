/*
 * Programming Assignment 1: Basic Java Programs
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class twoInt {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 1
		 *
		 * Description:
		 *    This program takes in two user input integers and returns
		 *    the sum of the two numbers, difference of the two numbers,
		 *    product of the two numbers, average of the two numbers,
		 *    distance of the two numbers(how far apart they are), the
		 *    maximum number, and the minimum number.
		 *
		 * Bug Report:
		 *    There are floating 0's in the program output
		 *    due to inability to guess user input
		 *
		 */
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double one = user.nextDouble();
		double two = user.nextDouble();
		
		System.out.printf("Sum: %17f\n", one + two);
		System.out.printf("Difference: %10f\n", one - two);
		System.out.printf("Product: %14f\n", one * two);
		System.out.printf("Average: %13f\n", (one + two) / 2.0);
		System.out.printf("Distance: %11f\n", Math.abs(one - two));
		System.out.printf("Maximum: %13f\n", Math.max(one, two));
		System.out.printf("Minimum: %13f\n", Math.min(one, two));
	}

}
