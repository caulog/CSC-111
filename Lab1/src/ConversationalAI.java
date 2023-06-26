/*@file ConversationalAI.java
  @brief This program utilizes the scanner and "System.out.print();" to have a conversation
  @author Olivia Caulfield
  @data 9/8/2020*/
import java.util.Scanner;

public class ConversationalAI {
    public static void main (String [] args) {
        //Create Scanner
        Scanner scnr = new Scanner(System.in);

        //Variables
        String firstName;
        int yearBorn;
        int fortuneNum;
        char lastLetter;
        double money;
        double change;

        //Get name
        System.out.println("Hey! I'm Mary the Magnificent! What's your first name? ");
        firstName = scnr.next();
        System.out.print("So nice to meet you " + firstName + ". " );

        //Guess
        System.out.println("Do you know why they call me Mary the Magnificent, yes or no? ");
        scnr.next();
        System.out.print("Because I am a fortune teller! ");

        //Fortune #1
        System.out.println("Tell me the year you were born and I will tell you your fortune.");
        yearBorn = scnr.nextInt();
        fortuneNum = yearBorn%3;

        //Print fortune #1
        System.out.print("Okay " + yearBorn + "... I am seeing that you will ");

        if (fortuneNum == 0){
            System.out.println("have a lot of success in the next few weeks.");
        }
        else if (fortuneNum == 1){
            System.out.println("meet the love of your life very soon.");
        }
        else {
            System.out.println("find $35,000 on the floor of Chick-fil-a.");
        }

        //Fortune #2
        System.out.println("Lets do another fortune, okay?!");
        scnr.next();

        System.out.println("What is your last name? ");
        lastLetter = scnr.next().charAt(1);

        System.out.println("How much change do you have in your wallet?");
        change = scnr.nextDouble();

        money = (((double)(lastLetter/3))*(120673.45726)) + change;

        //Print fortune #2 and goodbye.
        System.out.print("The second letter of your last name, '" + lastLetter + "', and the " + change + " cents in your wallet tells me that you will earn $");
        System.out.printf("%1.2f", money);
        System.out.println(" in the next three months! How exciting.\nWell, thank you for coming to get your fortune told.\nIt was nice meeting you " + firstName + ", I hope to see you again soon.");
    }
}
