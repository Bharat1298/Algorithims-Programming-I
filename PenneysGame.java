/*
 * Programming Assignment 7: Penney's Game
 * Bharat Khadka, Khadkab2
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PenneysGame {

    public static void main(String[] args) {
    	
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 7
		 *
		 * Description:
		 * 
		 *    This Java program simulates Penney's Game, a sequential coin-flipping game between the user and the computer.
		 *    The program prompts the user for a sequence and then generates it's own sequence that is different from the user's.
		 *    The program then flips coins until a sequence is found and provides a winner. 
		 *	  
		 *
		 * Bug Report:
		 * 
		 *    No known bugs
		 *
		 */
    	
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to Penney's Game\n");
        System.out.println("First, enter the number of coins (n) you and I each choose.");
        System.out.println("Then, enter your n coin choices, and I'll do the same.");
        System.out.println("Then, we keep flipping until one of our sequences comes up, and that player wins.");
        System.out.println("Ready? Then let's go!\n");

        // Get the number of coins to play with
        int n = getValidInput(scanner);

        // Get user's coin sequence and generate a random sequence for the computer
        char[] userSequence = getUserSequence(scanner, n);
        char[] computerSequence = generateRandomSequence(userSequence, n);

        // Show the chosen sequences
        System.out.println("You chose: " + Arrays.toString(userSequence));
        System.out.println("I chose: " + Arrays.toString(computerSequence));

        // Simulate fair coin tosses
        int[] fairCoinTosses = new int[10000];
        int numberOfTosses = n;

        System.out.print("The flipping starts: ");

        // Perform coin tosses until one sequence matches
        while (numberOfTosses <= 10000 - n) {
            fairCoinTosses[numberOfTosses] = tossCoin();
            numberOfTosses++;

            // Show the fair coin tosses
            if (numberOfTosses <= 10000) {
                if (fairCoinTosses[numberOfTosses - 1] == 1) {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }

            // Exit loop if one of the sequences is seen
            if (isGameDone(userSequence, computerSequence, fairCoinTosses, numberOfTosses, n)) {
                break;
            }
        }

        // Display the result of the game
        displayResult(userSequence, computerSequence, fairCoinTosses, numberOfTosses, n);

        scanner.close();
    }

    // Get valid input (positive integer) from the user
    private static int getValidInput(Scanner scanner) {
        int n;
        while (true) {
            System.out.print("Enter the number of coins (> 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input; try again: ");
                System.out.print("Enter the number of coins (> 0): ");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
            System.out.println("Invalid input; try again: ");
        }
        return n;
    }

    // Get the user's coin sequence
    private static char[] getUserSequence(Scanner scanner, int n) {
        System.out.println("Enter your sequence of " + n + " coins (H for heads, T for tails): ");
        char[] sequence = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter coin " + (i + 1) + ": ('h' for heads, 't' for tails): ");
            String input;
            do {
                input = scanner.next().toLowerCase();
            } while (!input.equals("h") && !input.equals("t"));
            sequence[i] = input.toUpperCase().charAt(0);
        }
        return sequence;
    }

    // Generate the computer's random coin sequence without matching the user's sequence
    private static char[] generateRandomSequence(char[] userSeq, int n) {
        Random random = new Random();
        char[] sequence = new char[n];
        boolean match;
        do {
            match = false;
            for (int i = 0; i < n; i++) {
                sequence[i] = random.nextBoolean() ? 'H' : 'T';
            }
            if (Arrays.equals(sequence, userSeq)) {
                match = true;
            }
        } while (match);
        return sequence;
    }

    // Simulate a coin toss (returns 1 for heads, 0 for tails)
    private static int tossCoin() {
        Random random = new Random();
        return random.nextInt(2); // Generates 0 or 1 for tails or heads respectively
    }

    // Check if the game is done based on the last tosses
    private static boolean isGameDone(char[] userSeq, char[] compSeq, int[] fairTosses, int numOfTosses, int n) {
        if (numOfTosses < n) {
            return false;
        }

        char[] lastFairTosses = new char[n];
        for (int i = 0; i < n; i++) {
            if (fairTosses[numOfTosses - n + i] == 1) {
                lastFairTosses[i] = 'H';
            } else {
                lastFairTosses[i] = 'T';
            }
        }

        boolean userWins = Arrays.equals(lastFairTosses, userSeq);
        boolean compWins = Arrays.equals(lastFairTosses, compSeq);

        return userWins || compWins;
    }

    // Display the result of the game
    private static void displayResult(char[] userSeq, char[] compSeq, int[] fairTosses, int numOfTosses, int n) {
        char[] lastFairTosses = new char[n];
        for (int i = 0; i < n; i++) {
            if (fairTosses[numOfTosses - n + i] == 1) {
                lastFairTosses[i] = 'H';
            } else {
                lastFairTosses[i] = 'T';
            }
        }

        if (Arrays.equals(lastFairTosses, userSeq)) {
            System.out.println("\nYou won! But I'll win next time...");
        } else if (Arrays.equals(lastFairTosses, compSeq)) {
            System.out.println("\nI won! Beat me next time (if you can)!");
        } else {
            System.out.println("\nIt's a draw!");
        }
    }
}
