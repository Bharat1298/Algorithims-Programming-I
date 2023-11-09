/*
 * Programming Assignment 1: Basic Java Programs
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class measurement {
	
	/*
	 *
	 * Name: Bharat
	 * User Name: Khadkab2
	 * Assignment: 1
	 *
	 * Description:
	 *    This program takes in a user input double as meters
	 *    and returns how many miles, feet, and inches the input would be.
	 *
	 * Bug Report:
	 *    There are floating 0's in the program output
	 *    due to inability to guess user input
	 *
	 */

	public static void main(String[] args) {
		double meterPerMile = 1609.34;
		float feetPerMeter = 3.28084f;
		int inchesPerFoot = 12;
		
		System.out.print("Enter a measurement in meters: ");
		Scanner user = new Scanner(System.in);
		double meter = user.nextDouble();
		
		
		System.out.printf("The measurement in miles is %f: \n", meter / meterPerMile);		
		System.out.printf("The measurement in feet is %f: \n", meter * feetPerMeter);		
		System.out.printf("The measurement in inches is %f: \n", (meter * feetPerMeter) * inchesPerFoot);		

	}

}
