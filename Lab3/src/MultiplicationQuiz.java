/* @file MultiplicationQuiz.java
   @brief This program utilizes math random, scanners, and for loops to create a multiplication
          quiz for the user
   @author Olivia Caulfield
   @data September 24, 2020
 */

import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
    public static void main (String [] args) {
        //Creating scanner object
        Scanner scnr = new Scanner(System.in);
        Random randNum = new Random();

        //Creating variables
        int problems, smallest, largest, firstNum, secondNum, range, correctAnswer, studentAnswer, percent;
        int numCorrect = 0;

        //Prints title
        System.out.println("Multiplication Quiz Wiz!");

        //Asks how many problems
        System.out.print("\nHow many problems do you want to work on? ");
        problems = scnr.nextInt();

        //Asks for smallest and largest integers
        System.out.print("What are the smallest and largest numbers to use? ");
        smallest = scnr.nextInt();
        largest = scnr.nextInt();

        //Calculates range
        range = (largest - smallest) + 1;
        for (int i = 1; i < problems + 1; i++){
            //Creates numbers
            firstNum = randNum.nextInt(range) + smallest;
            secondNum =randNum.nextInt(range) + smallest;

            //Correct answer
            correctAnswer = firstNum * secondNum;

            //Asks question
            System.out.print("\nQ" + i + ": What is " + firstNum + " x " + secondNum + " ? ");
            studentAnswer = scnr.nextInt();

            //Checks if answer is correct
            if (correctAnswer == studentAnswer){
                System.out.println("Correct!");
                numCorrect = numCorrect + 1;
            }
            else{
                System.out.println("Oops... It's " + correctAnswer);
            }
        }
        //Calculate amount correct
        percent = (numCorrect * 100)/problems;
        System.out.print("\nYou got " + numCorrect + " out of " + problems + " or " + percent + "%");
    }
}
