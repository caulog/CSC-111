/*@file PredictGPAv2.java
  @brief This program utilizes methods in order to simplify the PredictGPA program from Lab2
  @author Olivia Caulfield
  @data 10/15/2020
 */


import java.util.Scanner;

public class PredictGPAv2 {
    public static void main (String [] args) {
        //Creates scanner
        Scanner scnr = new Scanner(System.in);

        //Creates variables
        String cont = "y";
        int count = 1;
        double gpa;

        //Creates arrays
        String[] courseTitle = new String[10];
        int[] hours = new int[10];
        String[] expectedGrades = new String[10];
        double[] grades = new double[10];

        //Prints title
        System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester...");

        while (cont.equalsIgnoreCase("y") && (count <= 10)){
            cont = "a";

            //Asks course title and stores in array
            System.out.print("\nCourse " + count + ": Course title? ");
            courseTitle[count-1] = scnr.nextLine();

            //Asks course hours and stores in array
            System.out.print("Course " + count + ": Number of hours? ");
            hours[count-1] = scnr.nextInt();

            //Asks expected grades and stores in array
            System.out.print("Course " + count + ": Expected grade? ");
            expectedGrades[count-1] = scnr.next();

            //Asks to continue
            while (!(cont.equalsIgnoreCase("y")) && !(cont.equalsIgnoreCase("n"))) {
                System.out.print("Continue (y/n)? ");
                cont = scnr.next();
            }
            scnr.nextLine();
            count = count + 1;
        }

        //fill grades array
        int arrCount = 0;
        while (hours[arrCount] != 0){
            String letter = expectedGrades[arrCount];
            grades[arrCount] = letterToNumberGrade(letter);
            arrCount = arrCount + 1;
        }

        //table format
        System.out.println("\nHere is your summary:");
        System.out.println("Title\t\thours\tgrade\n_________________________");

        for (int i = 0; i < arrCount; i++){
            if (i < arrCount -1) {
                System.out.println(courseTitle[i] + "\t\t" + hours[i] + "\t\t" + expectedGrades[i]);
            }
            else{
                System.out.println(courseTitle[i] + "\t\t" + hours[i] + "\t\t" + expectedGrades[i] + "\n_________________________");
            }
        }

        //get GPA
        gpa = getGPA(arrCount, hours, grades);

        //Print GPA
        System.out.printf("Your semester GPA would be: %.4f\n", gpa);

        //find min
        double min = grades[0];
        int courseNum = 0;
        for (int i = 0; i < arrCount; i++){
            if (grades[i] < min){
                min = grades[i];
                courseNum = i;
            }
        }

        //assign lowest grade with an A
        grades[courseNum] = 4.0;

        //recalculate GPA
        gpa = getGPA(arrCount, hours, grades);

        //Print new GPA
        System.out.print("\nIf you were to get an A in course "+ (courseNum + 1) + " your GPA would be ");
        System.out.printf("%.4f, just saying...", gpa);
    }

    //gets GPA
    public static double getGPA (int count, int[] hour, double[] numGrade){
        double hrsXgrade = 0;
        int totalHours = 0;
        for (int i = 0; i < count; i++){
            totalHours = totalHours + hour[i];
            hrsXgrade = hrsXgrade + (hour[i] * numGrade[i]);
        }
        return hrsXgrade / totalHours;
    }

    //converts letter grade to number grade
    public static double letterToNumberGrade(String letterGrade){
        double grade;
        if (letterGrade.equalsIgnoreCase("A")){
            grade = 4.0;
        }
        else if (letterGrade.equalsIgnoreCase("A-")) {
            grade = 3.67;
        }
        else if (letterGrade.equalsIgnoreCase("B+")) {
            grade = 3.33;
        }
        else if (letterGrade.equalsIgnoreCase("B")) {
            grade = 3.0;
        }
        else if (letterGrade.equalsIgnoreCase("B-")) {
            grade = 2.67;
        }
        else if (letterGrade.equalsIgnoreCase("C+")) {
            grade = 2.33;
        }
        else if (letterGrade.equalsIgnoreCase("C")){
            grade = 2.0;
        }
        else if (letterGrade.equalsIgnoreCase("C-")) {
            grade = 1.67;
        }
        else if (letterGrade.equalsIgnoreCase("D+")) {
            grade = 1.33;
        }
        else if (letterGrade.equalsIgnoreCase("D")){
            grade = 1.0;
        }
        else if (letterGrade.equalsIgnoreCase("D-")) {
            grade = 0.67;
        }
        else {
            grade = 0;
        }
        return grade;
    }

}
