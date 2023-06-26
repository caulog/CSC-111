/* @file BlackJack.java
   @brief This program implements if statements and for loops to play a simplified version
          of Black Jack, the card game
   @author Olivia Caulfield
   @data September 24, 2020
 */

import java.util.Scanner;
import java.lang.Math;

public class BlackJack {
    public static void main (String [] args) {
        //Creating scanner object
        Scanner scnr = new Scanner(System.in);

        //Creating variables
        String cont = "y";
        int playerWins = 0;
        int dealerWins = 0;

        //Black jack table print
        System.out.println("==================================================");
        System.out.println("Black Jack Table");
        System.out.println("==================================================");

        //Play again?
        while (cont.equalsIgnoreCase("Y")) {
            //Variables
            String again = "h";
            int cardNum;
            int playerTotal = 0;
            int dealerTotal = 0;

            //Player's turn
            System.out.println("\nPlayer's turn");

            while (again.equalsIgnoreCase("H")) {

                cardNum = (int) (Math.random() * 11) + 1;
                playerTotal = playerTotal + cardNum;

                System.out.println("card:\t" + cardNum + " Current score:\t" + playerTotal);

                //Hit?
                System.out.print("(h) hit me again! (d) I'm done : ");
                again = scnr.next();
            }
            //Print player final score
            System.out.println("Player's final score is " + playerTotal + "\n");

            //Dealer's turn
            System.out.println("Dealer's turn");
            while (dealerTotal <= 17) {

                cardNum = (int) (Math.random() * 11) + 1;
                dealerTotal = dealerTotal + cardNum;

                System.out.println("card:\t" + cardNum + " Current score:\t" + dealerTotal);
            }
            //Print dealer final score
            System.out.println("Dealer's final score is " + dealerTotal);

            //Prints who won
            if ((playerTotal > 21) && (dealerTotal > 21) || (playerTotal == dealerTotal)){
                System.out.println("It's a tie.");
            }
            else if ((playerTotal > dealerTotal) && (playerTotal <=21) || ((dealerTotal > 21) && (playerTotal <=21))){
                System.out.println("Player won!");
                playerWins = playerWins + 1;
            }
            else {
                System.out.println("Dealer won!");
                dealerWins = dealerWins + 1;
            }

            //Ask again
            System.out.print("\nPlay again? (y/n): ");
            cont = scnr.next();
        }
        //Prints Final scores
        System.out.print("Player won " + playerWins + " times.\nDealer won " + dealerWins + " times.");

    }
}
