/* @file Shapes.java
   @brief This program defines a Shapes object and creates methods to be implemented in ShapesTest.java
   @author Olivia Caulfield
   @data November 10, 2020
 */

import java.util.Scanner;
public class Shapes {
    //Creates scanner
    Scanner scnr = new Scanner(System.in);

    //private fields
    private String shape;
    private double perimeter;
    private double area;

    //Constructors
    //default constructor
    public Shapes() {
        shape = "unknown";
        perimeter = 0;
        area = 0;
    }
    //One parameter constructor
    public Shapes(String shape) {
        this.shape = shape;
        perimeter = 0;
        area = 0;
    }
    //All parameter constructor
    public Shapes(String shape, double perimeter, double area){
        this.shape = shape;
        this.perimeter = perimeter;
        this.area = area;
    }

    //Shape Mutator
    public void setShape(String shape){
        this.shape = shape;
    }

    //Accessors
    public String getShape(){
        return shape;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }

    //Arithmetic methods
    //perimeter arithmetic
    public void setPerimeter(Scanner scnr){
        System.out.println("Calculating perimeter...");
        //defines variables
        String whatShape = getShape();
        perimeter = 0;
        //sets perimeter if circle
        if(whatShape.equalsIgnoreCase("Circle")){
            System.out.print("Enter the circle's radius: ");
            double radius = scnr.nextDouble();
            perimeter = 2 * Math.PI * radius;
        }
        //sets perimeter if triangle
        if (whatShape.equalsIgnoreCase("Triangle")){
            System.out.print("Enter side length 1: ");
            double side1 = scnr.nextDouble();
            System.out.print("Enter side length 2: ");
            double side2 = scnr.nextDouble();
            System.out.print("Enter side length 3: ");
            double side3 = scnr.nextDouble();
            perimeter = side1 + side2 + side3;
        }
        //sets perimeter if square
        if (whatShape.equalsIgnoreCase("Square")){
            System.out.print("Enter side length: ");
            double side = scnr.nextDouble();
            perimeter = side * 4;
        }
        //sets perimeter if rectangle
        if (whatShape.equalsIgnoreCase("Rectangle")){
            System.out.print("Enter width: ");
            double width = scnr.nextDouble();
            System.out.print("Enter height: ");
            double height = scnr.nextDouble();
            perimeter = (width * 2) + (height * 2 );
        }
        //if shape is unknown
        if (whatShape.equalsIgnoreCase("unknown")){
            System.out.println("Must define a shape before a perimeter can be calculated.");
            perimeter = 0;
        }
    }

    //area Arithmetic
    public void setArea(Scanner scnr){
        System.out.println("Calculating area...");
        String whatShape = getShape();
        area = 0;
        //sets perimeter if circle
        if(whatShape.equalsIgnoreCase("Circle")){
            System.out.print("Enter the circle's radius: ");
            double radius = scnr.nextDouble();
            area = Math.PI * radius * radius;
        }
        //sets perimeter if triangle
        if (whatShape.equalsIgnoreCase("Triangle")){
            System.out.print("Enter side length 1: ");
            double side1 = scnr.nextDouble();
            System.out.print("Enter side length 2: ");
            double side2 = scnr.nextDouble();
            System.out.print("Enter side length 3: ");
            double side3 = scnr.nextDouble();
            double p = (side1 + side2 + side3) / 2.0;
            area = Math.sqrt((p)*(p-side1)*(p-side2)*(p-side3));
        }
        //sets perimeter if square
        if (whatShape.equalsIgnoreCase("Square")){
            System.out.print("Enter side length: ");
            double side = scnr.nextDouble();
            area = side * side;
        }
        //sets perimeter if rectangle
        if (whatShape.equalsIgnoreCase("Rectangle")){
            System.out.print("Enter width: ");
            double width = scnr.nextDouble();
            System.out.print("Enter height: ");
            double height = scnr.nextDouble();
            area = width * height;
        }
        //if shape is unknown
        if (whatShape.equalsIgnoreCase("unknown")){
            System.out.println("Must define a shape before an area can be calculated.");
            area = 0;
        }
    }

    //Creative Methods
    //.to3D() finds the volume if that shape was a 3D version
    public void to3D(Scanner scnr){
        String whatShape = getShape();
        double volume = 0;
        //gets 3D sphere volume
        if(whatShape.equalsIgnoreCase("Circle")){
            System.out.print("Enter a radius to find the volume if the circle was a 3D sphere: ");
            double radius = scnr.nextDouble();
            volume = (4.0/3.0) * Math.PI * radius * radius * radius;
            System.out.println("The sphere would have a volume of " + volume);
        }
        //gets 3D triangular prism volume
        if (whatShape.equalsIgnoreCase("Triangle")){
            System.out.print("Enter a height to find the volume if the triangle was a 3D triangular prism: ");
            double height = scnr.nextDouble();
            volume = getArea() * height;
            System.out.println("The triangular prism would have a volume of " + volume);
        }
        //gets 3D cube volume
        if (whatShape.equalsIgnoreCase("Square")){
            volume = getArea() * (Math.sqrt(getArea()));
            System.out.print("If the square was a 3D cube it would have a volume of " + volume);
        }
        //gets 3D rectangular prism
        if (whatShape.equalsIgnoreCase("Rectangle")){
            System.out.print("Enter a length to find the volume if the rectangle was a 3D rectangular prism: ");
            double length = scnr.nextDouble();
            volume = getArea() * length;
            System.out.print("If the rectangle was a rectangular prism it would have a volume of " + volume);
        }
        //if shape is unknown
        if (whatShape.equalsIgnoreCase("unknown")){
            System.out.println("Must define a shape before a 3D volume can be calculated.");
            volume = 0;
        }
    }

    //.printShape() prints information about the shape
    public void printShape(){
        System.out.print("This shape is a " + shape + " with a perimeter " + perimeter + " and an area " + area);
    }
}
