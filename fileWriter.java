/*
 * Programming Assignment 2: Basic Java Programs 2
 * Bharat Khadka, Khadkab2
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriter {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 2
		 *
		 * Description:
		 *    This program takes in a user specified text file,
		 *    writes a user specified message into the file,
		 *    reads the contents of the file, and then outputs
		 *    the content as a string.
		 *
		 * Bug Report:
		 *    No known bugs.
		 *
		 */
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the name of the file: ");
	        String name = scanner.nextLine();
	
	        try {
	            FileWriter writer = new FileWriter(name);
	            System.out.print("Enter the message to write to the file: ");
	            String message = scanner.nextLine();
	            writer.write(message);
	            System.out.println("Wrote the message into the file.");
	            writer.close();
	        } catch (IOException e) {
	            System.err.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	            return;
	        }
	
	        try {
	            FileReader reader = new FileReader(name);
	            StringBuilder messageBuilder = new StringBuilder();
	            int character;
	            while ((character = reader.read()) != -1) {
	                messageBuilder.append((char) character);
	            }
	            reader.close();
	            System.out.printf("Message read from the file: %s ", messageBuilder.toString() );
	        } catch (IOException e) {
	            System.err.println("An error occurred while reading from the file.");
	            e.printStackTrace();
	     }
	}

}
