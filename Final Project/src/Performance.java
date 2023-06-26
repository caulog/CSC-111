/* @file Performance.java
   @brief This program is an extended class of LiveEntertainment.java
   @author Olivia Caulfield
   @data December 1, 2020
 */

//EXTENDED CLASS
import java.util.Random;
public class Performance extends LiveEntertainment{
    //FIELD VARIABLES
    private String performanceType;
    private String lead;
    private int minutes;

    //CONSTRUCTORS
    //1. default constructor
    public Performance(){
        performanceType = "";
        lead = "";
        minutes = 0;
    }

    //2. fully overloaded constructor
    public Performance(String performanceType, String lead, int minutes){
        this.performanceType = performanceType;
        this.lead = lead;
        this.minutes = minutes;
    }

    //MUTATORS
    public void setPerformanceType(String performanceType){
        this.performanceType = performanceType;
    }
    public void setLead(String lead){
        this.lead = lead;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    //ACCESSORS
    public String getPerformanceType(){
        return performanceType;
    }
    public String getLead(){
        return lead;
    }
    public int getMinutes(){
        return minutes;
    }

    //print method
    public void printInfo(){
        super.printInfo();
        System.out.println("\t" + getName() + " is a " + performanceType + " that is " + minutes + " minutes long and " + lead + " is the lead. ");
    }

    //ADDITIONAL METHODS
    //1. NOTIFICATION: lead change
    public void leadChange(String newLead){
        System.out.println("NOTIFICATION *The lead of " + getName() + " is no longer " + lead + " and is now " + newLead + "*");
        setLead(newLead);
    }

    //2. provides a rating USES SUPER
    public void rating(Random randNum){
        super.rating(randNum);
        int rand = randNum.nextInt(3);
        if(rand == 1){
        System.out.println(getName() + " is an amazing " + getPerformanceType() + ".");
        }
        else if(rand == 2){
            System.out.println(getLead() + " in " + getName() + " was unforgettable!");
        }
        else{
            System.out.println("The entire " + getMinutes() + " minutes I was totally engaged.");
        }
    }
}
