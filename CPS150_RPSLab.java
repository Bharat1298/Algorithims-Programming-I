/*
 * CPS150_RPSLab.java
 */
import static java.lang.Math.*; // so you can call Math methods without the 'Math.' prefix

import java.io.*;
import java.util.*;

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Rock, Paper, Scissors
 *
 * @author *** Bharat Khadka ***
 */
public class CPS150_RPSLab
{
    // global input/output variables
    public static Scanner scan = new Scanner(System.in);
    public static PrintStream output = System.out;
    public static PrintStream error = System.err;

    // global named constants for game choices
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    
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
        // player choice variables
        int player1, player2;

        // get player 1 input as 1 (rock), 2 (paper or 3 (scissors)
        output.print("Choose 1 (rock), 2 (paper), or 3 (scissors): ");
        player1 = scan.nextInt();

        /*
            RPS Lab Part 1
            
            *** Add code here to validate that player1 has entered
                    an integer between 1 and 3
                otherwise, ABORT the program
         */
        
        if (player1 < ROCK || player1 > SCISSORS){
        	System.out.println("Error: Unknown Choice");
        	System.exit(1);
        }
        
        
        // echo human player's choice
        output.print(" You chose ");
        if (player1 == ROCK) {       System.out.println("rock"); }
        else if (player1 == PAPER) { System.out.println("paper"); }
        else {                       System.out.println("scissors"); }

        // now computer picks one randomly

        output.println("Now I choose one ...");
        
        /*
            RPS Lab Part 2
            
            *** Add code here to assign player2 a random
                integer between 1 and 3
         */
        
        int max = 3;
        int min = 1;
        
        player2 = (int)((Math.random() * max) + min);        
        
        System.out.print(" I choose ");
       
        /*
            RPS Lab Part 3
        
            *** Add code here to output the computer's choice
                as "rock", "paper" or "scissors"
         */
        
        switch(player2){
        	case ROCK:
        		System.out.println("rock");
        		break;
        	case PAPER:
        		System.out.println("paper");
        		break;
        	case SCISSORS:
        		System.out.println("scissors");
        		break;
        	default:
        		System.exit(ERROR);
        		
        }
        	
        
        
        /*
            RPS Lab Part 4
            
            *** Add code below to compare player input against computer's choice:
                
                declare an outcome integer variable and initialize it to 0
                
                if human player chose ROCK:
                    set the outcome variable to a call to rockChoice method with computer choice
                otherwise, if human player chose PAPER:
                    set the outcome variable to a call to paperChoice method with computer choice
                otherwise, if human player chose SCISSORS:
                    set the outcome variable to a call to scissorsChoice method with computer choice
                otherwise:
                    output "Something went wrong..."
         */
        
        int var = 0;
        
        switch(player1){
    		case ROCK:
    			var = rockChoice(player2);
    			break;
    		case PAPER:
    			var = paperChoice(player2);
    			break;
    		case SCISSORS:
    			var = scissorsChoice(player2);
    			break;
    		default:
    			System.out.println("Something went wrong..");
    			System.exit(ERROR);
    }                        
        
        /*
            RPS Lab Part 5
            
            *** Add code below to output the results from the last part:
                
                if the outcome variable is PLAYER1_WINS:
                    output "Congratulations, you won the game!"
                otherwise, if the outcome variable is PLAYER2_WINS:
                    output "Sorry, I won this one.  Play again and see if you can beat me."
                otherwise, if the outcome variable is DRAW:
                    output "A draw.  Play again and see if you can beat me."
                otherwise:
                    output "Something went wrong..."
         */
        
        if(var == PLAYER1_WINS) {
			System.out.println("Congratulations, you won the game!");
        }else if(var == PLAYER2_WINS){
			System.out.println("Sorry, I won this one.  Play again and see if you can beat me.");
        }else if(var == DRAW){
			System.out.println("A draw.  Play again and see if you can beat me.");
        }else{
			System.out.println("Something went wrong...");
        }
        
        
    } // end main
    
    /**
     * RPS Lab Part 6
     * 
     * rockChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen ROCK
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: rockChoice(ROCK) -> DRAW
     * ex2: rockChoice(PAPER) -> PLAYER2_WINS
     * ex3: rockChoice(SCISSORS) -> PLAYER1_WINS
     * ex4: rockChoice(0) -> ERROR
     * ex5: rockChoice(-1) -> ERROR
     * ex6: rockChoice(4) -> ERROR
     */
    public static int rockChoice(int choice)
    {
        switch(choice){
        	case ROCK:
        		return DRAW;
        	case PAPER:
        		return PLAYER2_WINS;
        	case SCISSORS:
        		return PLAYER1_WINS;
        	default:
        		return ERROR;
        		
        }
    } // end rockChoice
    
    /**
     * RPS Lab Part 7
     * 
     * paperChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen PAPER
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: paperChoice(ROCK) -> PLAYER1_WINS
     * ex2: paperChoice(PAPER) -> DRAW
     * ex3: paperChoice(SCISSORS) -> PLAYER2_WINS
     * ex4: paperChoice(0) -> ERROR
     * ex5: paperChoice(-1) -> ERROR
     * ex6: paperChoice(4) -> ERROR
     */
    public static int paperChoice(int choice)
    {
        // *** ADD METHOD CODE ***
        switch(choice){
    		case PAPER:
    			return DRAW;
    		case SCISSORS:
    			return PLAYER2_WINS;
    		case ROCK:
    			return PLAYER1_WINS;
    		default:
    			return ERROR;
        }
    } // end paperChoice
    
    /**
     * RPS Lab Part 8
     * 
     * scissorsChoice(int) -> int
     * 
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen SCISSORS
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     * 
     * ex1: scissorsChoice(ROCK) -> PLAYER2_WINS
     * ex2: scissorsChoice(PAPER) -> PLAYER1_WINS
     * ex3: scissorsChoice(SCISSORS) -> DRAW
     * ex4: scissorsChoice(0) -> ERROR
     * ex5: scissorsChoice(-1) -> ERROR
     * ex6: scissorsChoice(4) -> ERROR
     */
    public static int scissorsChoice(int choice)
    {
        // *** ADD METHOD CODE ***
        switch(choice){
    	case SCISSORS:
    		return DRAW;
    	case ROCK:
    		return PLAYER2_WINS;
    	case PAPER:
    		return PLAYER1_WINS;
    	default:
    		return ERROR;
        }
    } // end scissorsChoice
    
} // end class CPS150_RPSLab
