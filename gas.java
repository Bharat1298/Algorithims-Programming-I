/*
 * Programming Assignment 1: Basic Java Programs
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class gas {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 1
		 *
		 * Description:
		 *    This program takes in user input as how many gallons a 
		 *    car can hold, the fuel efficiency of the car, and the 
		 *    price per gallon, and returns how much it costs to drive
		 *    100 miles and the maximum distance the car can drive.
		 *
		 * Bug Report:
		 *    There are floating 0's in the program output
		 *    due to inability to guess user input
		 *
		 */
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("The number of gallons of gas in the tank: ");
		double gallons = user.nextDouble();
		
		System.out.println("The fuel efficiency in miles per gallon: ");
		double mph = user.nextDouble();
		
		System.out.println("The price of gas per gallon: ");
		double price = user.nextDouble();
		
		System.out.printf("To drive 100 miles, it will cost $%.2f.\n" , (100.00 / mph) * price);
		System.out.printf("The car can currently drive a maximum of %f miles.\n", gallons * mph);

	}

}
