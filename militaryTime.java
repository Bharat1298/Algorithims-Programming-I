/*
 * Programming Assignment 2: Basic Java Programs 2
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class militaryTime {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 2
		 *
		 * Description:
		 *    This program takes in two user specified times in military
		 *    time and returns the number of hours and minutes
		 *    between the two times.
		 *
		 * Bug Report:
		 *    No known bugs.
		 *
		 */
		
		Scanner numberReader = new Scanner(System.in);
		
		System.out.println("Please enter the first time: ");
		String number1 = numberReader.nextLine();
		System.out.println("Please enter the second time: ");
		String number2 = numberReader.nextLine();
		
		int num1Hrs = Integer.parseInt(number1.substring(0 , 2));
		int num1Min = Integer.parseInt(number1.substring(2 , 4));
		int num2Hrs = Integer.parseInt(number2.substring(0 , 2));
		int num2Min = Integer.parseInt(number2.substring(2 , 4));
		
		
		System.out.printf("%d hours %d minutes", Math.abs(num2Hrs - num1Hrs), Math.abs(num2Min - num1Min));

	}

}
