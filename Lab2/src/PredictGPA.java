/* @file PredictGPA.java
   @brief This program utilizes user input to predict the users GPA
   @author Olivia Caulfield
   @data September 15, 2020*/

import java.util.Scanner;

public class PredictGPA {
    public static void main (String [] args) {
        //Create Scanner
        Scanner scnr = new Scanner(System.in);

        //Variables
        int hrs1, hrs2, hrs3, hrs4;
        String grade1, grade2, grade3, grade4;
        double gradeNum1, gradeNum2, gradeNum3, gradeNum4, gpa;

        //Print heading
        System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester...");

        //Get course 1
        System.out.print("\nCourse 1: Number of hours? ");
        hrs1 = scnr.nextInt();
        System.out.print("Course 1: Expected grade? ");
        grade1 = scnr.next();

        //Get course 2
        System.out.print("\nCourse 2: Number of hours? ");
        hrs2 = scnr.nextInt();
        System.out.print("Course 2: Expected grade? ");
        grade2 = scnr.next();

        //Get course 3
        System.out.print("\nCourse 3: Number of hours? ");
        hrs3 = scnr.nextInt();
        System.out.print("Course 3: Expected grade? ");
        grade3 = scnr.next();

        //Get course 4
        System.out.print("\nCourse 4: Number of hours? ");
        hrs4 = scnr.nextInt();
        System.out.print("Course 4: Expected grade? ");
        grade4 = scnr.next();


        //Assign grade1 with a numerical value
        if (grade1.equalsIgnoreCase("A")){
            gradeNum1 = 4.0;
        }
        else if (grade1.equalsIgnoreCase("A-")) {
            gradeNum1 = 3.67;
        }
        else if (grade1.equalsIgnoreCase("B+")) {
            gradeNum1 = 3.33;
        }
        else if (grade1.equalsIgnoreCase("B")) {
            gradeNum1 = 3.0;
        }
        else if (grade1.equalsIgnoreCase("B-")) {
            gradeNum1 = 2.67;
        }
        else if (grade1.equalsIgnoreCase("C+")) {
            gradeNum1 = 2.33;
        }
        else if (grade1.equalsIgnoreCase("C")){
            gradeNum1 = 2.0;
        }
        else if (grade1.equalsIgnoreCase("C-")) {
            gradeNum1 = 1.67;
        }
        else if (grade1.equalsIgnoreCase("D+")) {
            gradeNum1 = 1.33;
        }
        else if (grade1.equalsIgnoreCase("D")){
            gradeNum1 = 1.0;
        }
        else if (grade1.equalsIgnoreCase("D-")) {
            gradeNum1 = 0.67;
        }
        else {
            gradeNum1 = 0;
        }


        //Assign grade2 with a numerical value
        if (grade2.equalsIgnoreCase("A")){
            gradeNum2 = 4.0;
        }
        else if (grade2.equalsIgnoreCase("A-")) {
            gradeNum2 = 3.67;
        }
        else if (grade2.equalsIgnoreCase("B+")) {
            gradeNum2 = 3.33;
        }
        else if (grade2.equalsIgnoreCase("B")) {
            gradeNum2 = 3.0;
        }
        else if (grade2.equalsIgnoreCase("B-")) {
            gradeNum2 = 2.67;
        }
        else if (grade2.equalsIgnoreCase("C+")) {
            gradeNum2 = 2.33;
        }
        else if (grade2.equalsIgnoreCase("C")){
            gradeNum2 = 2.0;
        }
        else if (grade2.equalsIgnoreCase("C-")) {
            gradeNum2 = 1.67;
        }
        else if (grade2.equalsIgnoreCase("D+")) {
            gradeNum2 = 1.33;
        }
        else if (grade2.equalsIgnoreCase("D")){
            gradeNum2 = 1.0;
        }
        else if (grade2.equalsIgnoreCase("D-")) {
            gradeNum2 = 0.67;
        }
        else {
            gradeNum2 = 0;
        }


        //Assign grade3 with a numerical value
        if (grade3.equalsIgnoreCase("A")){
            gradeNum3 = 4.0;
        }
        else if (grade3.equalsIgnoreCase("A-")) {
            gradeNum3 = 3.67;
        }
        else if (grade3.equalsIgnoreCase("B+")) {
            gradeNum3 = 3.33;
        }
        else if (grade3.equalsIgnoreCase("B")) {
            gradeNum3 = 3.0;
        }
        else if (grade3.equalsIgnoreCase("B-")) {
            gradeNum3 = 2.67;
        }
        else if (grade3.equalsIgnoreCase("C+")) {
            gradeNum3 = 2.33;
        }
        else if (grade3.equalsIgnoreCase("C")){
            gradeNum3 = 2.0;
        }
        else if (grade3.equalsIgnoreCase("C-")) {
            gradeNum3 = 1.67;
        }
        else if (grade3.equalsIgnoreCase("D+")) {
            gradeNum3 = 1.33;
        }
        else if (grade3.equalsIgnoreCase("D")){
            gradeNum3 = 1.0;
        }
        else if (grade3.equalsIgnoreCase("D-")) {
            gradeNum3 = 0.67;
        }
        else {
            gradeNum3 = 0;
        }

        //Assign grade4 with a numerical value
        if (grade4.equalsIgnoreCase("A")){
            gradeNum4 = 4.0;
        }
        else if (grade4.equalsIgnoreCase("A-")) {
            gradeNum4 = 3.67;
        }
        else if (grade4.equalsIgnoreCase("B+")) {
            gradeNum4 = 3.33;
        }
        else if (grade4.equalsIgnoreCase("B")) {
            gradeNum4 = 3.0;
        }
        else if (grade4.equalsIgnoreCase("B-")) {
            gradeNum4 = 2.67;
        }
        else if (grade4.equalsIgnoreCase("C+")) {
            gradeNum4 = 2.33;
        }
        else if (grade4.equalsIgnoreCase("C")){
            gradeNum4 = 2.0;
        }
        else if (grade4.equalsIgnoreCase("C-")) {
            gradeNum4 = 1.67;
        }
        else if (grade4.equalsIgnoreCase("D+")) {
            gradeNum4 = 1.33;
        }
        else if (grade4.equalsIgnoreCase("D")){
            gradeNum4 = 1.0;
        }
        else if (grade4.equalsIgnoreCase("D-")) {
            gradeNum4 = 0.67;
        }
        else {
            gradeNum4 = 0;
        }

        //GPA Calculation
        gpa = (((hrs1 * gradeNum1) + (hrs2 * gradeNum2) + (hrs3 * gradeNum3) + (hrs4 * gradeNum4))/(double)(hrs1 + hrs2 + hrs3 + hrs4));

        //GPA Print statement
        System.out.printf("\nYour semester GPA would be: %.4f\n", gpa);
    }
}
