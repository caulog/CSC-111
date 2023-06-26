/* @file ShapesTest.java
   @brief This program tests the Shapes object and the methods defined in the Shapes.java class
   @author Olivia Caulfield
   @data November 10, 2020
 */

import java.util.Scanner;
public class ShapesTest {
    public static void main (String [] args) {
        //Creates scanner
        Scanner scnr = new Scanner(System.in);

        //TEST 1
        System.out.println("Test 1: Using Default Constructor");
        //Creates a shape using a default constructor
        Shapes shape1 = new Shapes();
        //uses .printShape() method
        shape1.printShape();
        System.out.println("\n");

        //TEST 2
        System.out.println("Test 2: Using Shape Constructor");
        //Creates a shape using "shape" constructor
        Shapes shape2 = new Shapes("circle");
        //uses .printShape() method
        shape2.printShape();
        System.out.println("\n");

        //TEST 3
        System.out.println("Test 3: Using Fully Overloaded Constructor");
        //Creates a shape using fully overloaded constructor
        Shapes shape3 = new Shapes("triangle", 15, 9.92);
        //uses .printShape() method
        shape3.printShape();
        System.out.println("\n");

        //TEST 4
        System.out.println("Test 4: CIRCLE Using .setShape(), .setPerimeter(), and .setArea()");
        //Creates a shape using default constructor
        Shapes shape4 = new Shapes();
        //Sets shape using .setShape() method
        shape4.setShape("circle");
        //Sets perimeter using set perimeter method
        shape4.setPerimeter(scnr);
        //Sets area using set area method
        shape4.setArea(scnr);
        //uses .printShape() method
        shape4.printShape();
        System.out.println();
        //uses .to3D() method
        shape4.to3D(scnr);
        System.out.println();


        //TEST 5
        System.out.println("Test 5: TRIANGLE Using .setShape(), .setPerimeter(), and .setArea()");
        //Creates shape using default constructor
        Shapes shape5 = new Shapes();
        //Sets shape using .setShape() method
        shape5.setShape("triangle");
        //Sets perimeter using .setPerimeter() method
        shape5.setPerimeter(scnr);
        //Sets area using .setArea() method
        shape5.setArea(scnr);
        //uses .printShape() method
        shape5.printShape();
        System.out.println();
        //uses .to3D() method
        shape5.to3D(scnr);
        System.out.println("\n");

        //TEST 6
        System.out.println("Test 6: SQUARE Using .setShape(), .setPerimeter(), and .setArea()");
        //Creates shape using default constructor
        Shapes shape6 = new Shapes();
        //Sets shape using .setShape() method
        shape6.setShape("square");
        //Sets perimeter using .setPerimeter() method
        shape6.setPerimeter(scnr);
        //Sets area using .setArea() method
        shape6.setArea(scnr);
        //uses .printShape() method
        shape6.printShape();
        System.out.println();
        //uses .to3D() method
        shape6.to3D(scnr);
        System.out.println("\n");

        //TEST 7
        System.out.println("TEST 7: RECTANGLE Using .setShape(), .setPerimeter(), and .setArea()");
        //creates shape using default constructor
        Shapes shape7 = new Shapes();
        //Sets shape using .setShape() method
        shape7.setShape("rectangle");
        //Sets perimeter using .setPerimeter() method
        shape7.setPerimeter(scnr);
        //Sets area using .setArea() method
        shape7.setArea(scnr);
        //uses .printShape() method
        shape7.printShape();
        System.out.println();
        //uses .to3D() method
        shape7.to3D(scnr);
        System.out.println("\n");

        //TEST 8
        System.out.println("TEST 8: UNKNOWN test for .setPerimeter() and .setArea()");
        //creates shape using default constructor
        Shapes shape8 = new Shapes();
        //Uses .setPerimeter()
        shape8.setPerimeter(scnr);
        //Uses .setArea();
        shape8.setArea(scnr);
        //uses .printShape()
        shape8.printShape();
        System.out.println();
        //uses .to3D()
        shape8.to3D(scnr);
    }
}
