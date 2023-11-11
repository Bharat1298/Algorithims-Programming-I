/*
 * Programming Assignment 6: The Game of Pig
 * Bharat Khadka, Khadkab2
 */

import java.util.Random;
import java.util.Scanner;

public class GameOfPig {
	
    public static int humanTotalScore = 0;
    public static int computerTotalScore = 0;

    public static void main(String[] args) {
    	
		/*
		 *
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 6
		 *
		 * Description:
		 * 
		 *    This program simulates The Game of Pig. Each turn of the game, players take turn
		 *    rolling a six-sided die. If the player rolls 2 through 6, then he or she can either roll again or
		 *    stop rolling, after stopping, the sum of all rolls is added to the player’s score and it becomes the other player’s turn.
		 *	  If the player rolls a 1, then the player gets no new points and it becomes the other player’s turn.
		 *	  
		 *	  The game ends once a player reaches 100 points or higher.
		 *
		 * Bug Report:
		 * 
		 *    The game only works as long as the user provides proper input, otherwise, the program instructs the user on what sort of input to provide and terminates. 
		 *
		 */
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        // Introduces the player to the game
        System.out.println("Welcome to the game of Pig!\n");
        System.out.println("The game of Pig is a simple two-player dice game in which the first player to reach 100 or more points wins. Players take turns. On each turn, a player rolls a six-sided die:");
        System.out.println("If the player rolls a 1, then the player gets no new points and it becomes the other player’s turn.");
        System.out.println("If the player rolls 2 through 6, then he or she can either");
        System.out.println("	ROLL AGAIN or");
        System.out.println("	HOLD/STOP.  At this point, the sum of all rolls is added to the player’s score and it becomes the other player’s turn.");

        // Loop that runs the game until the end conditions are met.
        while (true) {
        	
            // Player's turn
            System.out.println("\nYour turn.");
            int humanTurnScore = takeTurn(scanner, random);
            if (humanTurnScore == -1) {
            	System.out.println("Invalid input. Please enter either an s or an r");
                break;
            }
            humanTotalScore += humanTurnScore;
            
            System.out.println("Your score is " + humanTotalScore);

            // Check if the human won
            if (humanTotalScore >= 100) {
                System.out.println("\n\nCongratulations! You win!");
                break;
            }

            // Computer's turn
            int computerTurnScore = computerTurn(random);
            computerTotalScore += computerTurnScore;
            System.out.println("The computer's score is " + computerTotalScore + ".");


            // Check if the computer won
            if (computerTotalScore >= 100) {
                System.out.println("\n\nTHE COMPUTER WINS!");
                break;
            }
        }

        scanner.close();
    }

    // Simulates the player's turn by prompting the player to roll or stop
    private static int takeTurn(Scanner scanner, Random random) {
        int turnScore = 0;

        while (true) {
            int roll = rollDie(random);
            System.out.println("You rolled: " + roll);

            if (roll == 1) {
                System.out.println("You lose your turn!");
                return 0;
            } else {
                turnScore += roll;
                System.out.println("Your turn score is " + turnScore + " and your total score is " + humanTotalScore);
                System.out.println("If you hold, you will have " + (humanTotalScore + turnScore) + " points.");
                System.out.println("Enter 'r' to roll again, 's' to stop: ");
                String choice = scanner.next();

                if (choice.equals("s")) {
                    return turnScore;
                }else if(!choice.equals("r")){
                	return -1;
                }
            }
        }
    }

    // Simulates the computer's turn by rolling until the computer's turnScore reaches 20
    // If the computer wins or rolls a 1, the turn ends
    private static int computerTurn(Random random) {
        int turnScore = 0;

        System.out.println("\nIt is the computer's turn.");

        while (true) {
            int roll = rollDie(random);
            System.out.println("The computer rolled: " + roll);

            if (roll == 1 || turnScore >= 20) {
                System.out.println("The computer holds.");
                return turnScore;
            } else {
                turnScore += roll;
            }
        }
    }
    
    // Simulates the rolling of a six-sided die
    private static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }
}
