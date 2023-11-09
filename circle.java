/*
 * Programming Assignment 1: Basic Java Programs
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 1
		 *
		 * Description:
		 *    This program takes in a radius as user input and 
		 *    returns the area and circumference of a circle with the
		 *    given radius, as well as the volume and surface area of
		 *    a sphere with the given radius
		 *
		 * Bug Report:
		 *    There are floating 0's in the program output
		 *    due to inability to guess user input
		 *
		 */
		
		System.out.print("Enter a radius: ");
		Scanner user = new Scanner(System.in);
		double radius = user.nextDouble();
		
		
		System.out.printf("The area of a circle with a radius %f is %f: \n", radius, Math.pow(radius, 2) * Math.PI);		
		System.out.printf("The circumference of a circle with a radius %f is %f: \n", radius, 2 * radius * Math.PI);		
		System.out.printf("The volume of a sphere with a radius %f is %f: \n", radius, Math.pow(radius, 3) * Math.PI * (4.0/3.0));
		System.out.printf("The surface area of a sphere with a radius %f is %f: \n", radius, Math.pow(radius, 2) * Math.PI * 4);		

	}

}
