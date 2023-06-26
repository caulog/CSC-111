/* @file LiveEntertainment.java
   @brief This program is a base class for my Wake Forest Theater Program
          which utilizes objects and methods of this class
   @author Olivia Caulfield
   @data December 1, 2020
 */

//BASE CLASS
import java.util.Random;
public class LiveEntertainment {
    //FIELD VARIABLES
    private String name;
    private String dateAndTime;
    private int availableSeats;
    private double price;

    //CONSTRUCTORS
    //1. default constructor
    public LiveEntertainment(){
        name = "";
        dateAndTime = "00:00";
        availableSeats = 100;
        price = 0.00;
    }

    //2. constructor with one parameter "name"
    public LiveEntertainment(String entertainmentName){
        name = entertainmentName;
    }

    //3. fully overloaded constructor
    public LiveEntertainment(String name, String dateAndTime, int availableSeats, double price){
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    //MUTATORS
    public void setName(String name){
        this.name = name;
    }
    public void setDateAndTime(String dateAndTime){
        this.dateAndTime = dateAndTime;
    }
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //ACCESSORS
    public String getName(){
        return name;
    }
    public String getDateAndTime(){
        return dateAndTime;
    }
    public int getAvailableSeats(){
        return availableSeats;
    }
    public double getPrice(){
        return price;
    }

    //print method
    public void printInfo(){
        System.out.println(name + " will be performing on " + dateAndTime + ".\n\tThere are " + availableSeats +
                " seats available and tickets are selling at $" + price + ".");
    }

    //ADDITIONAL METHODS
    //1. NOTIFICATION: time change CALLS: setDateAndTime method
    public void dateTimeChange(String newDateTime){
        System.out.println("NOTIFICATION *" + name + " is no longer on " + dateAndTime + " and is now on " + newDateTime + "*");
        setDateAndTime(newDateTime);
    }
    //2. NOTIFICATION: sold out CALLS: setAvailableSeats
    public void soldOut(){
        System.out.println("NOTIFICATION *" + name + " is now sold out for " + getDateAndTime() + "*");
        setAvailableSeats(0);
    }
    //3. provides a rating
    public void rating(Random randNum) {
        System.out.println("Here is what the critics have to say about " + getName() + ": ");
        int rand = randNum.nextInt(3);
        if (rand == 1) {
            System.out.println(getName() + " is the best live entertainment that I have seen in ages! This is a must see. ");
        } else if (rand == 2) {
            System.out.println(getName() + " was phenomenal.\nAt $" + getPrice() + " this show is a steal! ");
        } else {
            System.out.println("I saw " + getName() + " in November and it was incredible.\nYou must buy tickets for " + getDateAndTime() + " before they sell out! ");
        }
    }
}
