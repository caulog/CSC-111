/* @file OrderedIntegers.java
   @brief This program utilizes user input and if statements to order 3 integers
   @author Olivia Caulfield
   @data September 15, 2020
 */

import java.util.Scanner;

public class OrderedIntegers {
    public static void main (String [] args) {
        //Create Scanner
        Scanner scnr = new Scanner(System.in);

        //Declare variables
        int num1, num2, num3;
        String ordered;

        //Ask for integers
        System.out.println("Order Three Integers ========");
        System.out.print("Enter three integers: ");
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        //First if/else if/else finds greatest integer
        //Nested if/else finds 2nd and 3rd greatest integers
        if((num1 >= num2) && (num1 >= num3)) {
            if(num2 >= num3){
                ordered = num1 + " " + num2 + " " + num3;
            }
            else{
                ordered = num1 + " " + num3 + " " + num2;
            }
        }
        else if ((num2 >= num1) && (num2 >= num3)){
            if(num1 >= num3){
                ordered = num2 + " " + num1 + " " + num3;
            }
            else{
                ordered = num2 + " " + num3 + " " + num1;
            }
        }
        else{
            if(num1 >= num2){
                ordered = num3 + " " + num1 + " " + num2;
            }
            else{
                ordered = num3 + " " + num2 + " " + num1;
            }
        }

        //Prints the integers in decreasing order to user
        System.out.print("The integers in decreasing order are: " + ordered);
        
    }
}
