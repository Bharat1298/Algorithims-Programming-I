/*
 * Programming Assignment 4: A Four-Function Java Calculator)
 * Bharat Khadka, Khadkab2
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
		/*
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 4
		 *
		 * Description:
		 *    This program works as a calculator and prompts the user for a
		 *    mathematical function. WHen the user selects one of the four 
		 *    pre-existing functions, the program prompts the user for two 
		 *    numbers and returns either the sum, difference, product, 
		 *    or difference of the two numbers if the numbers are valid.
		 *
		 * Bug Report: No known errors
		 *    
		 */
    	
        System.out.println("Four-Function Calculator\n");
        int choice = getOption();
        if (choice != -1) {
            double operand1 = getOperand("Enter the 1st number: ");
            if (operand1 != Double.MIN_VALUE) {
                double operand2 = getOperand("Enter the 2nd number: ");
                if (operand2 != Double.MIN_VALUE) {
                	System.out.println();
                    switch (choice) {
                        case 1:
                            add(operand1, operand2);
                            break;
                        case 2:
                            subtract(operand1, operand2);
                            break;
                        case 3:
                            multiply(operand1, operand2);
                            break;
                        case 4:
                            divide(operand1, operand2);
                            break;
                        default:
                            System.out.println("Unknown operation");
                    }
                }
            }
        }
        scanner.close();
    }

    public static int getOption() {
        System.out.println("Make a selection:\n" +
                "        1: Add 2 numbers\n" +
                "        2: Subtract 2 numbers\n" +
                "        3: Multiply 2 numbers\n" +
                "        4: Divide 2 numbers\n");
        System.out.print("Enter your choice: ");
        try {
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Unknown operation");
                return -1;
            }
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            return -1;
        }
    }

    public static double getOperand(String prompt) {
    	System.out.println();
        System.out.print(prompt);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            return Double.MIN_VALUE;
        }
    }

    public static void add(double opnd1, double opnd2) {
        System.out.println(opnd1 + " + " + opnd2 + " = " + (opnd1 + opnd2));
    }

    public static void subtract(double opnd1, double opnd2) {
        System.out.println(opnd1 + " - " + opnd2 + " = " + (opnd1 - opnd2));
    }

    public static void multiply(double opnd1, double opnd2) {
        System.out.println(opnd1 + " * " + opnd2 + " = " + (opnd1 * opnd2));
    }

    public static void divide(double opnd1, double opnd2) {
        if (opnd2 == 0) {
            System.out.println("You cannot divide by zero");
        } else {
            System.out.println(opnd1 + " / " + opnd2 + " = " + (opnd1 / opnd2));
        }
    }
}
