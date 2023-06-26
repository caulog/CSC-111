/* @file RegistrationTest.java
   @brief This program tests the Registration object and the methods defined in the Registration.java class
   @author Olivia Caulfield
   @data November 10, 2020
 */

import java.util.Random;
import java.util.Scanner;

public class RegistrationTest {
    public static void main (String [] args) {
        //Creates scanner
        Scanner scnr = new Scanner(System.in);

        //Creates random in
        Random randNum = new Random();

        //Creates registration objects
        //Creates perfect registration object using default constructor
        Registration newReg1 = new Registration();
        //Creates two "divisionals" using the fully overloaded constructor
        Registration divisional1 = new Registration("Fahrbach", "FYS", 100, "12:00PM", "1:30PM", "MWF", 202, "Greene" );
        Registration divisional2 = new Registration("Boyle", "WRI", 111, "12:00PM", "1:30PM", "MWF", 315, "Greene");


        //Welcome statement
        System.out.println("Welcome to Registration for Spring 2020!");
        System.out.println("For round one of registration you may register for two classes.\n");

        //Divisional choice
        System.out.println("Since you didn't take your FYS 100 or WRI 111 course yet, you MUST choose one of the following for spring:\n");
        divisional1.printWFUinfo();
        divisional2.printWFUinfo();
        System.out.print("\nType FYS or WRI to choose. ");
        String choice = scnr.next();
        while ( !(choice.equalsIgnoreCase("FYS")) && !(choice.equalsIgnoreCase("WRI"))){
            System.out.print("Invalid choice. Type FYS or WRI to choose. ");
            choice = scnr.next();
        }
        if (choice.equalsIgnoreCase("FYS")){
            System.out.println(divisional1.getDepartment() + " " + divisional1.getClassNumber() + " is a great class, you will love Professor " + divisional1.getProfessor());
        }
        else{
            System.out.println(divisional2.getDepartment() + " " + divisional2.getClassNumber() + " is a great class, you will love Professor " + divisional2.getProfessor());
        }

        //Perfect class choice
        System.out.println("\nFor your first choice you can create your perfect class");
        newReg1.perfectClass(scnr);
        System.out.println("\nGreat choices! Your perfect class is as follows: ");
        newReg1.printWFUinfo();
        System.out.println();

        //Update ROOM and PROFESSOR for chosen divisional
        if (choice.equalsIgnoreCase("FYS")) {
            divisional1.setProfessor("Puri");
            divisional1.roomUpdate("Salem", 114);
        }
        else {
            divisional2.setProfessor("Puri");
            divisional2.roomUpdate("Salem", 114);
        }

        //Thank you for registration print
        System.out.println("\nThank you for registering! Here is your summary: \n");
        if (choice.equalsIgnoreCase("FYS")) {
            divisional1.printWFUinfo();
            divisional1.rateProf(randNum);
        }
        else {
            divisional2.printWFUinfo();
            divisional2.rateProf(randNum);
        }
        System.out.println();
        newReg1.printWFUinfo();
        newReg1.rateProf(randNum);
        System.out.println("\nRemember to think ahead for round two of registration. You may register for up to 9 more credit hours then.\nSee you soon!");

    }
}
