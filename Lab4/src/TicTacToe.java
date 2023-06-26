/* @file TicTacToe.java
   @brief This program utilizes user input, for loops and while loops, and two dimensional
   arrays in order to play a tic-tac-toe game between the computer and the user. I also used
   the method structure learned in chapter 6 to simplify the code. When I first started
   writing this program I thought tic tac toe would be a short simple piece of code but then
   I realized that there is a lot of checking involved in each game, therefore, it was much
   longer than anticipated. In this code, I assume that the player is going to be nice and always
   give the number of a row or column that exists, but I do account for the fact that the user
   may try to place their X at a spot that is already being used.
   @author Olivia Caulfield
   @data October 8, 2020
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main (String [] args) {
        //declare variables
        String cont = "yes";

        //Creates random number generator
        Random randGen = new Random();

        //Creates Scanner
        Scanner scnr = new Scanner(System.in);

        //Creates tic-tac-toe board
        String[][] board = new String[3][3];

        System.out.println("Let's play tic-tac-toe!");

        //Game loop
            while (cont.equalsIgnoreCase("YES")) {

                //declares variable
                boolean win = false;
                int count = 0;

                //Makes empty board
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        board[i][j] = "_";
                    }
                }

                //checks who goes first
                System.out.println("\nI'll flip a coin to see who goes first. Heads you win, tails I win.");
                int coin = randGen.nextInt(2);

                //IF player goes first
                if (coin == 0) {
                    System.out.println("Its heads, you go first.");
                    System.out.println("You can be X... I'll be O.\n");
                    printBoard(board);

                    //Game starts with player
                    while (win != true && count < 9) {
                        boolean fairComp = false;
                        boolean fairPlayer = false;

                        //player turn
                        while (fairPlayer != true) {
                            int userRow = userTurnRow();
                            int userCol = userTurnCol();
                            if (board[userRow][userCol].equals("_")) {
                                board[userRow][userCol] = "X";
                                fairPlayer = true;
                            }
                            else {
                                System.out.println("That space is full. Try again.");
                            }
                        }

                        //increments
                        count = count + 1;
                        System.out.println("\nBoard after your turn:");
                        printBoard(board);

                        //checks for player win
                        if (winner(board)) {
                            win = winner(board);
                            System.out.println("\nNice job!! You won!");
                            break;
                        }

                        if (count == 9){
                            break;
                        }

                        //computer turn
                        while (fairComp != true) {
                            int compRow = randGen.nextInt(3);
                            int compCol = randGen.nextInt(3);
                            if (board[compRow][compCol].equals("_")) {
                                board[compRow][compCol] = "O";
                                fairComp = true;
                            }
                        }

                        //increments
                        count = count + 1;
                        System.out.println("\nBoard after my turn:");
                        printBoard(board);

                        //checks for computer win
                        if (winner(board)) {
                            win = winner(board);
                            System.out.println("\nNice, I won!!");
                            break;
                        }

                        if (count == 9){
                            break;
                        }
                    }
                }

                // ELSE computer goes first
                else {
                    System.out.println("Its tails, I go first.");
                    System.out.println("You can be X... I'll be O.\n");
                    printBoard(board);

                    //Game starts with computer
                    while (win != true && count < 9) {
                        boolean fairComp = false;
                        boolean fairPlayer = false;

                        //computer turn
                        while (fairComp != true) {
                            int compRow = randGen.nextInt(3);
                            int compCol = randGen.nextInt(3);
                            if (board[compRow][compCol].equals("_")) {
                                board[compRow][compCol] = "O";
                                fairComp = true;
                            }
                        }

                        //increments
                        count = count + 1;
                        System.out.println("\nBoard after my turn:");
                        printBoard(board);

                        //checks for computer win
                        if (winner(board)) {
                            win = winner(board);
                            System.out.println("\nNice, I won!!");
                            break;
                        }

                        if (count == 9){
                            break;
                        }

                        //player turn
                        while (fairPlayer != true) {
                            int userRow = userTurnRow();
                            int userCol = userTurnCol();
                            if (board[userRow][userCol].equals("_")) {
                                board[userRow][userCol] = "X";
                                fairPlayer = true;
                            }
                            else {
                                System.out.println("That space is full. Try again.");
                            }
                        }

                        //increments
                        count = count + 1;
                        System.out.println("\nBoard after your turn:");
                        printBoard(board);

                        //checks for player win
                        if (winner(board)) {
                            win = winner(board);
                            System.out.println("\nNice job!! You won!");
                            break;
                        }

                        if (count == 9){
                            break;
                        }
                    }

                }

                //checks for tie
                if ((count == 9) && !(win)) {
                    System.out.println("\nIts a tie!");
                }

                System.out.println("Would you like to play again? yes or no.");
                cont = scnr.next();
            }

            System.out.println("Thanks for playing! Come back soon.");

        }


        //Prints board
        public static void printBoard(String[][] arr){
            System.out.println("\t0\t1\t2");
            for(int i = 0; i < arr.length; i++){
                System.out.print(i + "\t");
                for (int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }

        //Gets users row turn
        public static int userTurnRow(){
            int row;
            Scanner scnr = new Scanner(System.in);
            System.out.println("\nAt what row would you like to place your X?");
            row = scnr.nextInt();
            return row;
        }

        //Gets users column turn
        public static int userTurnCol(){
            int col;
            Scanner scnr = new Scanner(System.in);
            System.out.println("At what column would you like to place your X?");
            col = scnr.nextInt();
            return col;
        }

        //checks wins
        public static boolean winner(String[][] arr){
            boolean win = false;

            //Row win
            for(int i = 0; i < arr.length; i++){
                if (arr[i][0].equals(arr[i][1]) && arr[i][1].equals(arr[i][2]) && !(arr[i][0].equals("_"))){
                    win = true;
                }
            }

            //column win
            for (int i = 0; i < arr[0].length; i++){
                if (arr[0][i].equals(arr[1][i]) && arr[1][i].equals(arr[2][i]) && !(arr[0][i].equals("_"))){
                    win = true;
                }
            }

            //diagonal win
            if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2]) && !(arr[1][1].equals("_"))) {
                win = true;
            }
            if (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0]) && !(arr[1][1].equals("_"))){
                win = true;
            }
            return win;
        }
}

