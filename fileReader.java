/*
 * Programming Assignment 2: Basic Java Programs 2
 * Bharat Khadka, Khadkab2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class fileReader {

	public static void main(String[] args) {
		
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 2
		 *
		 * Description:
		 *    This program takes in a user specified text file, in this case
		 *    mary.txt, and outputs a user specified text file of the same
		 *    content preceded by line numbers.
		 *
		 * Bug Report:
		 *    No known bugs.
		 *
		 */
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the output file: ");
        String name = scanner.nextLine();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mary.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String formattedLine = lineNumber + ": " + line;
                writer.write(formattedLine);
                writer.newLine();
                lineNumber++;
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
	}

}
