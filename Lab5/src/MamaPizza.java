import java.util.Scanner;

public class MamaPizza {
    public static void main (String [] args) {
        //Creates scanner
        Scanner scnr = new Scanner(System.in);

        //Creates variables
        String fName, lName;
        String size = "N/A";
        String type = "N/A";
        String dining = "N/A";
        int time;

        //Prints welcome statement
        System.out.println("Welcome to Mama's Pizza! ");

        //Asks for name
        System.out.print("\nFirst Name: ");
        fName = scnr.next();
        System.out.print("Last Name: ");
        lName = scnr.next();

        //Asks for Pizza Size
        while (!(size.equalsIgnoreCase("S")) && !(size.equalsIgnoreCase("M")) && !(size.equalsIgnoreCase("L"))){
            System.out.print("Size of Pizza [L]arge, [M]edium, [S]mall? [L/M/S]: ");
            size = scnr.next();
        }

        //Asks for Pizza Type
        while (!(type.equalsIgnoreCase("M")) && !(type.equalsIgnoreCase("V"))){
            System.out.print("[M]eat-lovers or [V]eggie Pizza? [M/V]: ");
            type = scnr.next();
        }

        //Asks for carry out or delivery
        while (!(dining.equalsIgnoreCase("C")) && !(dining.equalsIgnoreCase("D"))){
            System.out.print("[C]arry-out or [D]elivery? [C/D]: ");
            dining = scnr.next();
        }

        //Gets time
        if (dining.equalsIgnoreCase("C")){
            time = 15;
        }
        else{
            time = 30;
        }

        //Prints thank you statement
        System.out.println("\n" + fName + " " + lName + ",");
        System.out.printf("Your total is $%.2f, ",(Total(size, type, dining) + Tax(size, type, dining)));
        System.out.println("and your pizza will be ready in " + time + "-minutes!");
        System.out.print("Thank you,\nMama's Pizza!");
    }

    public static double Total(String size, String type, String dining){
        //declares variables
        double total = 0;

        //sets price for size
        if (size.equalsIgnoreCase("L")){
            total = total + 10.0;
        }
        else if (size.equalsIgnoreCase("M")){
            total = total + 7.0;
        }
        else{
            total = total + 5.0;
        }

        //adds price for meat/veggie
        if (type.equalsIgnoreCase("M")){
            total = total + 3.0;
        }
        else{
            total = total + 2.0;
        }

        //adds price if delivery
        if (dining.equalsIgnoreCase("D")){
            total = total + 3.0;
        }

        return total;
    }

    public static double Tax(String size, String type, String dining){
        double tax;
        tax = (Total(size, type, dining) * .0825);
        return tax;
    }
}
