/*
 * Programming Assignment 1: Basic Java Programs
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 1
		 *
		 * Description:
		 *    This program takes in a user input and returns
		 *    the input squared, cubed, and raised to the
		 *    power of 4.
		 *
		 * Bug Report:
		 *    There are floating 0's in the program output
		 *    due to inability to guess user input
		 *
		 */
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double input = user.nextDouble();
		double square = input * input;
		double cube = input * input * input;
		double fourth = Math.pow(input, 4.0);
		System.out.printf("The number %f squared is %f \nThe number %f cubed is %f \nThe number %f raised to the 4th power is %f \n", input, square, input, cube, input, fourth);
	}

}
