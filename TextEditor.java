/*
 * Final Project: Text Editor
 * Bharat Khadka, Khadkab2
 * Nikhil Acharya, Acharyan1
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class TextEditor {

    // Initializes a list of strings and an empty file to be used by the program
    private List<String> lines;
    private File file;

    // Creates an object, TextEditor, as an ArrayList that can store user entries
    public TextEditor() {
        this.lines = new ArrayList<>();
    }

    // Uses the JFileChooser to open up a document selection GUI
    public void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { // Checks if the user has selected a file
            this.file = fileChooser.getSelectedFile(); // Sets the file variable to the user selected file
            readFromFile(); // Reads contents of the file and saves it to lines
        }
    }

    // Reads all of the lines from opened file
    private void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // Try function to make sure file is valid, uses BufferReader to read file line by line
            String line; // "temp" variable line records current line
            while ((line = reader.readLine()) != null) { // Adds lines while file has content
                lines.add(line);
            }
        } catch (IOException e) { // Exception handling
            e.printStackTrace();
        }
    }

    // Saves current file
    public void saveFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) { // BufferedWriter to write contents to file line by line
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) { // Exception handling
            e.printStackTrace();
        }
    }

    // Displays all of the content in the current file
    public void displayDocument() {
        for (String line : lines) { // For each loop to display document contents to user using print statements
            System.out.println(line);
        }
    }

    // Displays a specified line from the file
    public void displayLine(int lineNumber) {
        if (lineNumber >= 1 && lineNumber <= lines.size()) { // Checks if lineNumber provided is valid
            System.out.println(lines.get(lineNumber - 1));
        } else {
            System.out.println("Invalid line number.");
        }
    }

    // Adds a line to the file
    public void addLine(String newLine) {
        lines.add(newLine);
    }

    // Inserts a line in a specified location
    public void insertLine(int lineNumber, String newLine) {
        if (lineNumber >= 1 && lineNumber <= lines.size() + 1) { // Checks if lineNumber provided is valid
            lines.add(lineNumber - 1, newLine);
        } else {
            System.out.println("Invalid line number.");
        }
    }

    // Replaces a line from the file
    public void changeLine(int lineNumber, String newLine) {
        if (lineNumber >= 1 && lineNumber <= lines.size()) { // Checks if lineNumber provided is valid
            lines.set(lineNumber - 1, newLine); // Uses .set method to replace entry in List
        } else {
            System.out.println("Invalid line number.");
        }
    }

    // Deletes a line from the file
    public void deleteLine(int lineNumber) {
        if (lineNumber >= 1 && lineNumber <= lines.size()) {
            lines.remove(lineNumber - 1);
        } else {
            System.out.println("Invalid line number.");
        }
    }

    public static void main(String[] args) {

		/*
		 *
		 * Name: Bharat, Nikhil
		 * User Name: Khadkab2, Acharyan1
		 * Final Project
		 *
		 * Description:
		 * 
		 *    This Java program simulates a simple, yet effective, command-line text editor. 
         *    The text editor has nine built in functions: 
         *      Open a text document
         *      Save a text document
         *      Display the document
         *      Display a line in the document at a given line number
         *      Add a new line to the end of the document
         *      Insert a new line prior to a line at a given line number
         *      Change a line at a given line number to new text
         *      Delete a line at a given line number
         *      End the program
         *    
         *    At the start of the program, the user is introduced to the text editor,
         *    the user can then operate the program much like a regualr text editor.
         *    The program will run until the user selects the Exit option
		 *
		 * Bug Report:
		 * 
		 *    No known bugs
		 *
		 */
    	
    	System.out.println("Welcome to our Text Editor");
    	System.out.println("To get started, select one of the options below by typing a number, to end the program select option 9");

        // Make the text editor using the TextEditor class
        TextEditor editor = new TextEditor();
        // Initialize a scanner to recieve user input and a variable that records the user input
        Scanner scanner = new Scanner(System.in);
        int option;

        // Set a conditions that runs the program until exit condition is met
        do {
            // Introduce the program to the user
            System.out.println("1. Open file");
            System.out.println("2. Save file");
            System.out.println("3. Display document");
            System.out.println("4. Display line");
            System.out.println("5. Add line");
            System.out.println("6. Insert line");
            System.out.println("7. Change line");
            System.out.println("8. Delete line");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            // Set variable option to user input
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Switch statement that efficiently handles operations based on user input
            switch (option) {
                // Opens a new file
                case 1:
                    editor.openFile();
                    break;
                // Saves the current file into a text document
                case 2:
                    editor.saveFile();
                    break;
                // Displays all of the content of the current file
                case 3:
                    editor.displayDocument();
                    break;
                // Displays a specified line from the current file
                case 4:
                    System.out.print("Enter line number: ");
                    int lineNumberDisplay = scanner.nextInt();
                    editor.displayLine(lineNumberDisplay);
                    break;
                // Adds a new line to the end of the file
                case 5:
                    System.out.print("Enter new line: ");
                    String newLineToAdd = scanner.nextLine();
                    editor.addLine(newLineToAdd);
                    break;
                // Adds a new line to a user specified location in the file
                case 6:
                    System.out.print("Enter line number: ");
                    int lineNumberInsert = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new line: ");
                    String newLineToInsert = scanner.nextLine();
                    editor.insertLine(lineNumberInsert, newLineToInsert);
                    break;
                // Replaces a line in the file, line number and replacement text specified by user 
                case 7:
                    System.out.print("Enter line number: ");
                    int lineNumberChange = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new line: ");
                    String newLineToChange = scanner.nextLine();
                    editor.changeLine(lineNumberChange, newLineToChange);
                    break;
                // Deletes a line from the file
                case 8:
                    System.out.print("Enter line number: ");
                    int lineNumberDelete = scanner.nextInt();
                    editor.deleteLine(lineNumberDelete);
                    break;
                // Ends the program
                case 9:
                    System.out.println("Exiting program.");
                    break;
                // Validates user input
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option != 9); // End condition

        scanner.close(); // Closes Scanner
    }
}