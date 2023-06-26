/* @file LiveEntertainment.java
   @brief This program is my Wake Forest Theater Program
          which utilizes objects and methods of both the base
          class LiveEntertainment.java and its extended class
          Performance.java
   @author Olivia Caulfield
   @data December 1, 2020
 */

//PROGRAM CLASS
import java.util.Scanner;
import java.util.Random;
public class WakeForestTheater {
    public static void main (String [] args) {
        //creates scanner
        Scanner scnr = new Scanner(System.in);
        //creates random number generator
        Random randNum = new Random();

        //OBJECTS: LiveEntertainment
        //creates LiveEntertainment using fully overloaded constructor
        LiveEntertainment concert = new LiveEntertainment("Billy Joel", "December 3rd, at 7:30PM", 23, 102.53);
        //creates LiveEntertainment using the default constructor
        LiveEntertainment newLive = new LiveEntertainment();
        //creates LiveEntertainment using constructor with one parameter "name"
        LiveEntertainment upComing = new LiveEntertainment("John Mulaney");

        //OBJECTS: Performance
        //creates performance using default constructor
        Performance newPerformance = new Performance();
        //creates Nutcracker performance
        Performance theNutcracker = new Performance("Ballet", "Misty Copeland", 110);
        theNutcracker.setName("The Nutcracker");
        theNutcracker.setDateAndTime("December 6th, at 12:30PM");
        theNutcracker.setAvailableSeats(12);
        theNutcracker.setPrice(79.94);
        //creates Lion King Performance
        Performance lionKing = new Performance("Musical", "Jason Raize", 150);
        lionKing.setName("The Lion King");
        lionKing.setDateAndTime("December 5th, at 5:00PM");
        lionKing.setAvailableSeats(5);
        lionKing.setPrice(83.88);

        //variables
        String choice;

        //creates web format
        System.out.println("https://wakeforesttheater.com\n");

        //prints welcome statement
        System.out.println("Welcome to the Wake Forest Theater!\n");

        //asks if purchasing tickets or booking a show
        System.out.print("Would you like to purchase tickets (P) or book a show (B)? ");
        choice = scnr.next();
        //checks for valid input
        while (!(choice.equalsIgnoreCase("P")) && !(choice.equalsIgnoreCase("B"))){
            System.out.print("*INVALID OPTION*\nchoose P or B: ");
            choice = scnr.next();
        }

        //PURCHASING TICKETS while loop
        while(choice.equalsIgnoreCase("P")){
            String interest;
            int showNum;
            //prints the shows that are being shown at the theater this week
            System.out.println("\nIn the upcoming week, we are showing the following:");
            if (concert.getAvailableSeats() > 0) { concert.printInfo(); }
            if (theNutcracker.getAvailableSeats() > 0) { theNutcracker.printInfo(); }
            if (lionKing.getAvailableSeats() > 0) { lionKing.printInfo(); }
            //prints upcoming show
            System.out.println(upComing.getName() + " will be coming to the Wake Forest Theater in 2021!");
            System.out.println();

            //which show interests the user
            System.out.print("Do any of our shows interest you? (Y/N) ");
            interest = scnr.next();

            //if the user is interested
            if (interest.equalsIgnoreCase("Y")){
                //prints show choices
                System.out.println("Great! Choose one of the shows from the list below to learn more! (1/2/3)");
                System.out.println("1. " + concert.getName() + "\n2. " + theNutcracker.getName() + "\n3. " + lionKing.getName());
                showNum = scnr.nextInt();
                while ((showNum != 1) && (showNum != 2) && (showNum != 3)){
                    System.out.print("\"" + showNum + "\" is an invalid option. Choose 1, 2, or 3: ");
                    showNum = scnr.nextInt();
                }
                System.out.println();
                //CHOICE 1: Billy Joel
                if (showNum == 1){
                    theNutcracker.soldOut();
                    lionKing.leadChange("Donald Glover");
                    System.out.println();
                    purchase(concert, randNum, scnr);
                }
                //CHOICE 2: The Nutcracker
                else if (showNum == 2){
                    concert.soldOut();
                    lionKing.leadChange("Donald Glover");
                    System.out.println();
                    purchase(theNutcracker, randNum, scnr);
                }
                //CHOICE 3: The Lion Kind
                else{
                    concert.dateTimeChange("December 4th, at 7:30PM");
                    theNutcracker.soldOut();
                    System.out.println();
                    purchase(lionKing, randNum, scnr);
                }
            }

            //if the user is not interested
            else{
                System.out.println("If nothing interests you, come back next week to see what new shows we have." +
                        "\nThanks for stopping by!");
                choice = "exit";
                break;
            }

            //sets choice equal to null to leave the PURCHASE TICKETS while loop
            choice = "null";
        }

        //BOOKING A SHOW while loop
        while(choice.equalsIgnoreCase("B")){
            //creates variables for this while loop
            String type, name;

            //asks for type of performance
            System.out.print("Fantastic! Are you booking a concert, ballet, or musical today? ");
            type = scnr.next();
            while (!type.equalsIgnoreCase("concert") && !type.equalsIgnoreCase("ballet") && !type.equalsIgnoreCase("musical")){
                System.out.print("I'm sorry but we are not currently booking " + type + "s at this time. PLease choose a concert, ballet, or musical. ");
                type = scnr.next();
            }

            //clears scanner
            scnr.nextLine();

            //to book a concert
            if (type.equalsIgnoreCase("concert")){
                //asks for name of the concert
                System.out.print("What is the name of the singer or band? ");
                name = scnr.nextLine();
                newLive.setName(name);
                showSetUp(newLive, scnr);
                //booking confirmation
                System.out.println("\nGreat! Your booking is as follows: \n");
                newLive.printInfo();
                //user confirmation
                System.out.print("\nPress any letter key to confirm: ");
                scnr.next();
                System.out.println("Your booking for " + newLive.getDateAndTime() + " has been confirmed. ");
            }

            //to book a ballet
            else if (type.equalsIgnoreCase("ballet")){
                //sets performance type to ballet
                newPerformance.setPerformanceType("Ballet");
                //asks for name of the ballet
                System.out.print("What ballet will you be performing? ");
                name = scnr.nextLine();
                newPerformance.setName(name);
                showSetUp(newPerformance, scnr);
                performanceSetUp(newPerformance, scnr);
                //booking confirmation
                System.out.println("\nGreat! Your booking is as follows: \n");
                newPerformance.printInfo();
                //user confirmation
                System.out.print("\nPress any letter key to confirm: ");
                scnr.next();
                System.out.println("Your booking for " + newPerformance.getDateAndTime() + " has been confirmed. ");
            }

            //to book a musical
            else{
                //sets performance type to musical
                newPerformance.setPerformanceType("Musical");
                //asks for name of musical
                System.out.print("What musical will you be performing? ");
                name = scnr.nextLine();
                newPerformance.setName(name);
                showSetUp(newPerformance, scnr);
                performanceSetUp(newPerformance, scnr);
                //booking confirmation
                System.out.println("\nGreat! Your booking is as follows: \n");
                newPerformance.printInfo();
                //user confirmation
                System.out.print("\nPress any letter key to confirm: ");
                scnr.next();
                System.out.println("Your booking for " + newPerformance.getDateAndTime() + " has been confirmed. ");
            }


            //sets choice equal to null to leave the BOOKING A SHOW while loop
            choice = "null";
        }

        //EXIT STATEMENT FOR Wake Forest Theatre Website (Entire Program)
        System.out.println("\nYou have now left the Wake Forest Theater Website. Goodbye.");
    }


    //method for "purchasing tickets"
    public static void purchase (LiveEntertainment show, Random randNum, Scanner scnr){
        //variables
        String buy;
        int num, tickets;
        double newPrice = 0;
        String[][] seatChart = new String[11][11];

        //CREATES SEATING CHART
        //creates row and col headers
        seatChart[0][0] = " ";
        for (int i = 1; i < seatChart.length; i++ ){
            seatChart[0][i] = (Integer.toString(i));
        }
        for (int i = 1; i < seatChart.length; i++ ){
            seatChart[i][0] = (Integer.toString(i));
        }
        //creates empty seats
        int empty = show.getAvailableSeats();
        while(empty > 0) {
            for (int i = 1; i < seatChart.length; i++) {
                for (int j = 1; j < seatChart[i].length; j++) {
                    num = randNum.nextInt(3);
                    if (num == 1) {
                        seatChart[i][j] = "O";
                        empty = empty - 1;
                        if (empty == 0) { break; }
                    }
                    else { seatChart[i][j] = "X"; }
                }
                if (empty == 0 ) { break; }
            }
        }
        //fills rest of seats
        for (int i = 1; i < seatChart.length; i++){
            for (int j = 1; j < seatChart[1].length; j++){
                if (seatChart[i][j] == null){
                    seatChart[i][j] = "X";
                }
            }
        }

        //prints the shows rating
        show.rating(randNum);

        //asks for purchase
        System.out.print("\nWould you like to purchase tickets for " + show.getName() + "? (Y/N) ");
        buy = scnr.next();
        //checks for valid input
        while (!buy.equalsIgnoreCase("Y") && !buy.equalsIgnoreCase("N")){
            System.out.print("\"" + buy + "\" is an invalid option. Choose Y or N: ");
            buy = scnr.next();
        }

        //if buy = Y
        if (buy.equalsIgnoreCase("Y")) {
            //prints available seats
            System.out.println("\nSee seating chart below for the " + show.getAvailableSeats() + " available seats (\"O\" represents an open seat):");
            for (int i = 0; i < seatChart.length; i++){
                for (int j = 0; j < seatChart[i].length; j++){
                    if ((i < 10) || (j > 0)){
                        System.out.print(seatChart[i][j] + "  ");
                    }
                    else{
                        System.out.print(seatChart[i][j] + " ");
                    }
                }
                System.out.println();
            }

            //asks which seats to purchase
            System.out.print("Since tickets for " + show.getName() + " are in such high demand, you may only purchase two at this time." +
                    "\nHow many tickets would you like, 1 or 2? ");
            tickets = scnr.nextInt();
            while (tickets != 1 && tickets != 2){
                System.out.print("I'm sorry but you may not buy " + tickets + " tickets at this time." +
                        "\nWould you like to buy 1 or 2 tickets? ");
                tickets = scnr.nextInt();
            }

            //if one ticket is purchased
            if (tickets == 1){
                //seat row and column variables
                int seat1R, seat1C;
                //asks user for what seat
                System.out.print("Look at the seating chart above and input the row and column of the open seat below:\nrow: ");
                seat1R = scnr.nextInt();
                System.out.print("column: ");
                seat1C = scnr.nextInt();

                //prints user seat choice and price
                newPrice = show.getPrice();
                System.out.println("You have now purchased the seat (" + seat1R + ", " + seat1C + ") for $" + show.getPrice() + ".");
            }

            //if two tickets are purchased
            if (tickets == 2){
                //seat row and column variables
                int seat1R, seat1C, seat2R, seat2C;
                //asks user for which seat
                //SEAT 1
                System.out.print("Look at the seating chart above and input the row and column of the open seat below:\nSeat 1:\nrow: ");
                seat1R = scnr.nextInt();
                System.out.print("column: ");
                seat1C = scnr.nextInt();
                //SEAT 2
                System.out.print("Seat 2:\nrow: ");
                seat2R = scnr.nextInt();
                System.out.print("column: ");
                seat2C = scnr.nextInt();
                //prints user seat choice and price
                newPrice = 2 * show.getPrice();
                System.out.print("You have now purchased two seats (" + seat1R + ", " + seat1C + ") and (" + seat2R + ", " + seat2C + ") for $");
                System.out.printf("%.2f.\n", newPrice);
            }

            //prints an exit statement
            System.out.print("\nThanks so much for purchasing tickets from the Wake Forest Theater! Here is your recipt: " +
                    "\n" + tickets + " tickets for " + show.getName() + " on " + show.getDateAndTime() + " " +
                    "\nTOTAL: $");
            System.out.printf("%.2f\n", newPrice);
        }

        //if buy = N
        else{
            System.out.println("Okay, not a problem. Come back soon!");
        }
    }

    public static void showSetUp (LiveEntertainment booking, Scanner scnr){
        //sets variables
        int time;
        double price;

        //chooses a time for the performance
        System.out.println("\nGreat! We can book " + booking.getName() + " this upcoming week for one of the following times.\nPlease choose a time from the list below (1/2/3):" +
                "\n1. December 2nd, at 8:00PM\n2. December 5th, at 12:30PM\n3. December 6th, at 5:00PM");
        time = scnr.nextInt();
        while (time != 1 && time != 2 && time != 3){
            System.out.print("\"" + time + "\" is not a valid choice. Please choose 1, 2, or 3. ");
            time = scnr.nextInt();
        }
        //if choice 1
        if (time == 1){ booking.setDateAndTime("December 2nd, at 8:00PM"); }
        //if choice 2
        if (time == 2){ booking.setDateAndTime("December 5th, at 12:30PM"); }
        //if choice 3
        if (time == 3){ booking.setDateAndTime("December 6th, at 5:00PM"); }

        //asks to set price
        System.out.print("\nHow much will you be charging for " + booking.getName() + " on " + booking.getDateAndTime() + "? ");
        price = scnr.nextDouble();
        while (price > 150.0){
            System.out.print("Whoa!! $" + price + " for " + booking.getName() + "?? People won't buy that." +
                    "\nPlease make the ticket price less than $150. ");
            price = scnr.nextDouble();
        }
        booking.setPrice(price);
    }

    public static void performanceSetUp(Performance booking, Scanner scnr){
        scnr.nextLine();
        //variables
        String lead;
        int time;

        //sets lead
        System.out.print("\nWho is the lead of " + booking.getName() + "? ");
        lead = scnr.nextLine();
        booking.setLead(lead);

        //sets time
        System.out.print("\nHow many minutes long is " + booking.getName() + "? ");
        time = scnr.nextInt();
        while (time > 150){
            System.out.print("Entertainment must be at most 150 minutes long. " +
                    "\nHow many minutes long is " + booking.getName() + "? ");
            time = scnr.nextInt();
        }
        booking.setMinutes(time);
    }
}

