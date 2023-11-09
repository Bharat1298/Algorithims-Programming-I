/*
 * Programming Assignment 2: Basic Java Programs 2
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class numReader {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 2
		 *
		 * Description:
		 *    This program reads a number between 1,000 and 999,999 from the user
		 *    and prints the number without a comma separating the thousands.
		 *
		 * Bug Report:
		 *    This program will only work if the user provides a valid input
		 *    without commas.
		 *
		 */
		
		Scanner numberReader = new Scanner(System.in);
		
		System.out.println("Enter a number between 1,000 and 999,999");
		String number = numberReader.nextLine();
		number = number.replace(",","");
		System.out.println(number);

	}

}
