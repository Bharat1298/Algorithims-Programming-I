/*
 * CPS 150 Programming Assignment 5: RPSLS (Rock, Paper, Scissors, Lizard, Spock)
 * Bharat Khadka, Khadkab2
 */

import static java.lang.Math.*;
import java.io.*;
import java.util.*;

public class Rock_Paper_Sissors_Lizard_Spock
{
    // global input/output variables
    public static Scanner scan = new Scanner(System.in);
    public static PrintStream output = System.out;
    public static PrintStream error = System.err;

    // global named constants for game choices
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int LIZARD = 4;
    public static final int SPOCK = 5;

    // global names constants for game outcomes
    public static final int PLAYER1_WINS = 11;
    public static final int PLAYER2_WINS = 12;
    public static final int DRAW = 3;

    // global named constant for error condition
    public static final int ERROR = -1;

    /**
     * 1. Get human player's choice
     * 2. Get computer player's (random) choice
     * 3. Check human player's choice
     * 4. Check computer player's choice
     * 5. Announce winner
     */
    public static void main(String[] args)
    {

        /*
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 5
		 *
		 * Description:
		 *    This program simulates the game Rock, Paper, Scissors, Lizard, Spock.
         *    It takes in user input and compares it to randomly chosen computer
         *    output. After the game has ended, the program asks the user if they
         *    want to continue playing
		 *
		 * Bug Report:
		 *    No known bugs
		 */

        // player choice variables
        int player1, player2;
        String input;

        // Introduces the program to user
        output.println("Welcome to the game of Rock Paper Scissors Lizard Spock\n");
        output.println("Here are the rules:");
        output.println("    Scissors cuts Paper");
        output.println("    Paper covers Rock");
        output.println("    Rock crushes Lizard");
        output.println("    Lizard poisons Spock");
        output.println("    Spock smashes Scissors");
        output.println("    Scissors decapitates Lizard");
        output.println("    Lizard eats Paper");
        output.println("    Paper disproves Spock");
        output.println("    Spock vaporizes Rock");
        output.println("    (and as it always has) Rock crushes scissors\n");
        output.println("Ready?  Then let's begin!\n");

        do {
            // get player 1 input rock, paper, scissors, lizard, or Spock
            output.println("Player 1, enter your choice ( rock, paper, scissors, lizard, Spock ): ");
            input = scan.next().toLowerCase();

            /*
            *** Validates that player1 has entered
                an integer between 1 and 5
                otherwise, ABORT the program
            */       
            while (!isValid(input)) {
                System.out.println("Invalid choice \"" + input + "\"; try again.");
                output.println("Player 1, enter your choice ( rock, paper, scissors, lizard, Spock ): ");
                input = scan.next().toLowerCase();
            }

            // converts user input to number and assigns value to player1
            player1 = textToNumber(input);

            // echo human player's choice
            output.print("OK, You chose ");
            switch (player1) {
                case ROCK:
                    output.println("rock");
                    break;
                case PAPER:
                    output.println("paper");
                    break;
                case SCISSORS:
                    output.println("scissors");
                    break;
                case LIZARD:
                    output.println("lizard");
                    break;
                case SPOCK:
                    output.println("Spock");
                    break;
            }

            // now computer picks one randomly

            output.print("Player 2 (computer) chooses ");

            /*
            *** Assigns player2 a random
                integer between 1 and 5
            */

            int max = 5;
            int min = 1;

            player2 = (int)((Math.random() * max) + min);

            
            /*
            *** Output the computer's choice
                as "rock", "paper", "scissors", "lizard", or "Spock"
            */

            switch (player2) {
                case ROCK:
                    System.out.println("rock");
                    break;
                case PAPER:
                    System.out.println("paper");
                    break;
                case SCISSORS:
                    System.out.println("scissors");
                    break;
                case LIZARD:
                    System.out.println("lizard");
                    break;
                case SPOCK:
                    System.out.println("Spock");
                    break;
                default:
                    System.exit(ERROR);
            }

            /*
                *** Compares player input against computer's choice:
                    
                    Declares an outcome integer variable and initializes it to 0
                    
                    if human player chose ROCK:
                        set the outcome variable to a call to rockChoice method with computer choice
                    otherwise, if human player chose PAPER:
                        set the outcome variable to a call to paperChoice method with computer choice
                    otherwise, if human player chose SCISSORS:
                        set the outcome variable to a call to scissorsChoice method with computer choice
                    otherwise, if human player chose LIZARD:
                        set the outcome variable to a call to lizardChoice method with computer choice
                    otherwise, if human player chose SPOCK:
                        set the outcome variable to a call to SpockChoice method with computer choice
                    otherwise:
                        output "Something went wrong..."
            */

            int var = 0;

            switch (player1) {
                case ROCK:
                    var = rockChoice(player2);
                    break;
                case PAPER:
                    var = paperChoice(player2);
                    break;
                case SCISSORS:
                    var = scissorsChoice(player2);
                    break;
                case LIZARD:
                    var = lizardChoice(player2);
                    break;
                case SPOCK:
                    var = SpockChoice(player2);
                    break;
                default:
                    System.out.println("Something went wrong..");
                    System.exit(ERROR);
            }

            /*
                *** Outputs the results from the last part:
                    
                    if the outcome variable is PLAYER1_WINS:
                        output "Congratulations, you won the game!"
                    otherwise, if the outcome variable is PLAYER2_WINS:
                        output "Sorry, I won this one.  Play again and see if you can beat me."
                    otherwise, if the outcome variable is DRAW:
                        output "A draw.  Play again and see if you can beat me."
                    otherwise:
                        output "Something went wrong..."
            */            

            if (var == PLAYER1_WINS) {
                output.println("Player 1 wins");
            } else if (var == PLAYER2_WINS) {
                output.println("Player 2 wins");
            } else if (var == DRAW) {
                output.println("It's a draw.");
            } else {
                output.println("Something went wrong...");
            }

            /*
                Offers the user the option to play again,
                keeping the game running for as long as
                the user wants to play
            */

            output.print("Play again (yes/no)? ");
            input = scan.next().toLowerCase();
        } while (input.equals("yes"));

        scan.close();
    } // end main

    /*
        method validates user input
    */

    public static boolean isValid(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors") || choice.equals("lizard") || choice.equals("spock");
    }

    /*
        method takes user input(rock, paper, scissors, lizard, or spock)
        and converts it into usable values for the program(1, 2, 3, 4, or 5)
        returns an ERROR value if input is invalid
    */

    public static int textToNumber(String choice) {
        switch (choice) {
            case "rock":
                return ROCK;
            case "paper":
                return PAPER;
            case "scissors":
                return SCISSORS;
            case "lizard":
                return LIZARD;
            case "spock":
                return SPOCK;
            default:
                return ERROR;
        }
    }

    /**
     * rockChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER, SCISSORS, LIZARD, or SPOCK),
     *   assuming the human player has chosen ROCK
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: rockChoice(ROCK) -> DRAW
     * ex2: rockChoice(PAPER) -> PLAYER2_WINS
     * ex3: rockChoice(SCISSORS) -> PLAYER1_WINS
     * ex4: rockChoice(LIZARD) -> PLAYER1_WINS
     * ex5: rockChoice(SPOCK) -> PLAYER2_WINS
     * ex6: rockChoice(-1) -> ERROR
     */
    public static int rockChoice(int choice) {
        switch (choice) {
            case ROCK:
                return DRAW;
            case PAPER:
            	System.out.print("Paper covers rock; ");
                return PLAYER2_WINS;
            case SCISSORS:
            	System.out.print("Rock crushes scissors; ");
                return PLAYER1_WINS;
            case LIZARD:
            	System.out.print("Rock crushes lizard; ");
                return PLAYER1_WINS;
            case SPOCK:
            	System.out.print("Spock vaporizes rock; ");
                return PLAYER2_WINS;
            default:
                return ERROR;
        }
    } // end rockChoice

    /**
     * paperChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER, SCISSORS, LIZARD, or SPOCK),
     *   assuming the human player has chosen PAPER
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: paperChoice(ROCK) -> PLAYER1_WINS
     * ex2: paperChoice(PAPER) -> DRAW
     * ex3: paperChoice(SCISSORS) -> PLAYER2_WINS
     * ex4: paperChoice(LIZARD) -> PLAYER2_WINS
     * ex5: paperChoice(SPOCK) -> PLAYER1_WINS
     * ex6: paperChoice(-1) -> ERROR
     */
    public static int paperChoice(int choice) {
        switch (choice) {
            case ROCK:
            	System.out.print("Paper covers rock; ");
                return PLAYER1_WINS;
            case PAPER:
                return DRAW;
            case SCISSORS:
            	System.out.print("Scissors cuts paper; ");
                return PLAYER2_WINS;
            case LIZARD:
            	System.out.print("Lizard eats paper; ");
                return PLAYER2_WINS;
            case SPOCK:
            	System.out.print("Paper disproves Spock; ");
                return PLAYER1_WINS;
            default:
                return ERROR;
        }
    } // end paperChoice

    /**
     * scissorsChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER, SCISSORS, LIZARD, or SPOCK),
     *   assuming the human player has chosen SCISSORS
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: scissorsChoice(ROCK) -> PLAYER2_WINS
     * ex2: scissorsChoice(PAPER) -> PLAYER1_WINS
     * ex3: scissorsChoice(SCISSORS) -> DRAW
     * ex4: scissorsChoice(LIZARD) -> PLAYER1_WINS
     * ex5: scissorsChoice(SPOCK) -> PLAYER2_WINS
     * ex6: scissorsChoice(-1) -> ERROR
     */
    public static int scissorsChoice(int choice) {
        switch (choice) {
            case ROCK:
            	System.out.print("Rock crushes scissors; ");
                return PLAYER2_WINS;
            case PAPER:
            	System.out.print("Scissors cuts paper; ");
                return PLAYER1_WINS;
            case SCISSORS:
                return DRAW;
            case LIZARD:
            	System.out.print("Scissors decapitates lizard; ");
                return PLAYER1_WINS;
            case SPOCK:
            	System.out.print("Spock smashes scissors; ");
                return PLAYER2_WINS;
            default:
                return ERROR;
        }
    } // end scissorsChoice

    /**
     * lizardChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER, SCISSORS, LIZARD, or SPOCK),
     *   assuming the human player has chosen LIZARD
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: lizardChoice(ROCK) -> PLAYER2_WINS
     * ex2: lizardChoice(PAPER) -> PLAYER1_WINS
     * ex3: lizardChoice(SCISSORS) -> PLAYER2_WINS
     * ex4: lizardChoice(LIZARD) -> DRAW
     * ex5: lizardChoice(SPOCK) -> PLAYER1_WINS
     * ex6: lizardChoice(-1) -> ERROR
     */
    public static int lizardChoice(int choice) {
        switch (choice) {
            case ROCK:
            	System.out.print("Rock crushes lizard; ");
                return PLAYER2_WINS;
            case PAPER:
            	System.out.print("Lizard eats paper; ");
                return PLAYER1_WINS;
            case SCISSORS:
            	System.out.print("Scissors decapitates lizard; ");
                return PLAYER2_WINS;
            case LIZARD:
                return DRAW;
            case SPOCK:
            	System.out.print("Lizard poisons Spock; ");
                return PLAYER1_WINS;
            default:
                return ERROR;
        }
    } // end lizardChoice

    /**
     * RPS Lab Part 8
     * 
     * SpockChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER, SCISSORS, LIZARD, or SPOCK),
     *   assuming the human player has chosen SPOCK
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: SpockChoice(ROCK) -> PLAYER1_WINS
     * ex2: SpockChoice(PAPER) -> PLAYER2_WINS
     * ex3: SpockChoice(SCISSORS) -> PLAYER1_WINS
     * ex4: SpockChoice(LIZARD) -> PLAYER2_WINS
     * ex5: SpockChoice(SPOCK) -> DRAW
     * ex6: SpockChoice(-1) -> ERROR
     */
    public static int SpockChoice(int choice) {
        switch (choice) {
            case ROCK:
            	System.out.print("Spock vaporizes rock; ");
                return PLAYER1_WINS;
            case PAPER:
            	System.out.print("Paper disproves Spock; ");
                return PLAYER2_WINS;
            case SCISSORS:
            	System.out.print("Spock smashes scissors; ");
                return PLAYER1_WINS;
            case LIZARD:
            	System.out.print("Lizard poisons Spock; ");
                return PLAYER2_WINS;
            case SPOCK:
                return DRAW;
            default:
                return ERROR;
        }
    } // end SpockChoice
} // end program