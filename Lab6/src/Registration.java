/* @file Registration.java
   @brief This program defines a Registration object and creates methods to be implemented in RegistrationTest.java
   @author Olivia Caulfield
   @data November 10, 2020
 */

import java.util.Random;
import java.util.Scanner;
public class Registration {
    //Field variables
    private String professor;
    private String department;
    private int classNumber;
    private String startTime;
    private String endTime;
    private String daysOfWeek;
    private int roomNumber;
    private String building;

    //default constructor
    public Registration() {
        professor = "unknown";
        department = "unknown";
        classNumber = 0;
        startTime = "unknown";
        endTime = "unknown";
        daysOfWeek = "unknown";
        roomNumber = 0;
        building = "unknown";
    }

    //constructor with all parameters
    public Registration(String professor, String department, int classNumber, String startTime, String endTime, String daysOfWeek, int roomNumber, String building) {
        this.professor = professor;
        this.department = department;
        this.classNumber = classNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.daysOfWeek = daysOfWeek;
        this.roomNumber = roomNumber;
        this.building = building;
    }

    //Mutators
    public void setProfessor(String professor1){
        professorAlert(professor1);
        professor = professor1;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setClassNumber(int classNumber){
        this.classNumber = classNumber;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public void setDaysOfWeek(String daysOfWeek){
        this.daysOfWeek = daysOfWeek;
    }
    public void setRoomNumber (int roomNumber){
        this.roomNumber = roomNumber;
    }
    public void setBuilding(String building) {
        this.building = building;
    }

    //Accessors
    public String getProfessor(){
        return professor;
    }
    public String getDepartment(){
        return department;
    }
    public int getClassNumber() {
        return classNumber;
    }
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
    public String getDaysOfWeek() {
        return daysOfWeek;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public String getBuilding(){
        return building;
    }

    //Member Methods
    //Print WFU
    public void printWFUinfo(){
        System.out.println(department + " " + classNumber + " is taught by Professor " + professor + " on " + daysOfWeek + " from " + startTime + " to " + endTime + " in " + building + " " + roomNumber);
    }
    //room update -- updates only room
    public void roomUpdate(String building1, int roomNumber1){
        roomAlert(building1, roomNumber1);
        building = building1;
        roomNumber = roomNumber1;
    }
    //room alert
    public void roomAlert(String building1, int roomNumber1){
        System.out.println("Alert! Your class " + department + " " + classNumber + " is no longer being taught at " + building + " " + roomNumber + " but has now been moved to " + building1 + " " + roomNumber1);
    }
    //professor alert
    public void professorAlert(String professor1){
        System.out.println("This is a notification to let you know that " + department + " " + classNumber + " is no longer being taught by Professor " + professor + " and is now being taught by Professor " + professor1);
    }

    //Creative methods
    //.perfectClass() allows user to create their perfect class
    public void perfectClass(Scanner scnr) {
        //set class name
        System.out.print("First, enter the department code: ");
        setDepartment(scnr.next());
        System.out.print("Which course in " + department + "? 134, 215, or 313? ");
        setClassNumber(scnr.nextInt());
        //set start and end time
        System.out.print(department + " " + classNumber + " is a great choice. Which start time 9:30AM or 3:00PM? ");
        setStartTime(scnr.next());
        while (!(startTime.equalsIgnoreCase("9:30AM")) && !(startTime.equalsIgnoreCase("3:00PM"))){
            System.out.print("hmm..." + startTime + " is not a valid start time... 9:30AM or 3:00PM? ");
            setStartTime(scnr.next());
        }
        if (startTime.equalsIgnoreCase("9:30AM")){
            setEndTime("11:00AM");
            setDaysOfWeek("TR");
            System.out.println("Okay, " + startTime + " is a Tuesday, Thursday class until " + endTime);
        }
        else{
            setEndTime("4:00PM");
            setDaysOfWeek("MWF");
            System.out.println("Okay, " + startTime + " is a Monday, Wednesday, Friday class until " + endTime);
        }
        System.out.print("Finally, what is the last name of the professor you choose to teach your perfect class? ");
        professor = scnr.next();

        setRoomNumber(201);
        setBuilding("Manchester");
    }

    //.rateProf() randomly selects a rating to give to the student about their professor
    public void rateProf(Random randNum){
       System.out.println("Here's what Rate My Professor has to say about Professor " + professor + ": ");
       int rand = randNum.nextInt(4);
       if(rand == 1){
           System.out.println("Professor " + professor + " is AMAZING!! Best " + department + " " + classNumber + " professor ever!");
       }
       else if(rand == 2){
           System.out.println("You HAVE to take " + department + " " + classNumber + " with Professor " + professor + ". They make the class so easy!");
       }
       else{
           System.out.println("Professor " + professor + " is a 10/10. I would take " + department + " " + classNumber + " a million times with them if I could!!");
       }
    }
}
