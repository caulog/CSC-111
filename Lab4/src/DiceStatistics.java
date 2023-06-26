/* @file DiceStatistics.java
   @brief This lab implements one dimensional and two dimensional arrays to find
   simulated probabilities of the two dice rolling game
   @author Olivia Caulfield
   @data October 8, 2020
 */
import java.util.Random;

public class DiceStatistics {
    public static void main (String [] args) {
        //Creates variables
        int trys = 1000;
        int loops = 100;

        //Creates arrays
        int[][] diceSum = new int[2][11];
        double[] simulated = new double[11];

        //Creates random number generator
        Random randGen = new Random();

        //Creates Roll Dice table
        System.out.println("RollDice Table ====================");
        System.out.println("Summation:\t\t   2\t   3\t   4\t    5\t    6\t    7\t    8\t    9\t  10\t  11\t  12");
        System.out.println("Theoretical(%):\t2.78\t5.56\t8.33\t11.11\t13.89\t16.67\t13.98\t11.11\t8.33\t5.56\t2.78");

        //How many "games" are played
        for (int j = 0; j < loops; j++){

            //fills array
            for (int x = 0; x < diceSum[0].length; x++) {
                diceSum[0][x] = x + 2;
                diceSum[1][x] = 0;
            }

            //creates probability array
            double[] probSum = new double[11];

            //how many times dice are rolled in each game
            for (int i = 0; i < trys; i++) {

                //rolls two dice
                int diceOne = randGen.nextInt(6) + 1;
                int diceTwo = randGen.nextInt(6) + 1;

                //sums dice
                int sum = diceOne + diceTwo;

                //checks to see which sum and stores in correct place
                for (int k = 0; k < diceSum[0].length; k++) {
                    if (sum == diceSum[0][k]) {
                        diceSum[1][k] = diceSum[1][k] + 1;
                    }
                }
            }

            //stores probability of each in probSum array
            for (int i = 0; i < probSum.length; i++) {
                probSum[i] = ((double) diceSum[1][i] / trys) * 100.0;
            }

            //adds all the probabilities of each "loop"
            for (int i = 0; i < simulated.length; i++){
                simulated[i] = simulated[i] + probSum[i];
            }
        }

        //formats
        System.out.print("Simulated(%):\t");

        //Creates simulated probability and prints
        for (int i = 0; i < simulated.length; i++){
            simulated[i] = simulated[i] / loops; //FIX
            System.out.printf("%.2f\t" , simulated[i]);
        }

    }

}
