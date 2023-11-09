/*
 * Programming Assignment 2: Basic Java Programs 2
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class numWithoutSysout {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 2
		 *
		 * Description:
		 *    This program reads a number between 1000 and 999999 from the user
		 *    and prints the number with a comma separating the thousands.
		 *
		 * Bug Report:
		 *    This program will only work if the user provides a valid input
		 *    without commas.
		 *
		 */
		
		Scanner numberReader = new Scanner(System.in);
		
		System.out.println("Enter a number between 1000 and 999999");
		
		String number = numberReader.nextLine();
		
		int length = number.length();
		
		switch(length){
			case 6:
				number = number.substring(0, 3) + ',' + number.substring(3, length);
				break;
			case 5:
				number = number.substring(0, 2) + ',' + number.substring(2, length);
				break;
			case 4:
				number = number.substring(0, 1) + ',' + number.substring(1, length);
				break;
			default:
				break;
		}


		System.out.println(number);

	}

}
