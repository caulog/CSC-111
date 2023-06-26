/* @file CreativeAssignment.java
   @brief This program utilizes what I have learned so far in the course to tell the user about my hometown in different seasons
   @author Olivia Caulfield
   @data September 15, 2020
 */

import java.util.Scanner;

public class CreativeAssignment {
    public static void main (String [] args) {
        //Create Scanner
        Scanner scnr = new Scanner(System.in);

        //Variables
        boolean cont;
        int count = 0;
        String name, goneNY, seasonChoice;
        String seasonNY = "Winter Spring Summer Fall";


        //Chat about living in New York
        System.out.println("Hey! I'm Liv, whats your name?");
        name = scnr.nextLine();
        System.out.println("So nice to meet you " + name + "! Have you ever been to New York?");
        goneNY = scnr.next();

        //if yes/no there is a different answer printed
        if (goneNY.equalsIgnoreCase("YES")){
            System.out.print("Super cool!! I grew up on Long Island, NY.");
        }
        else {
            System.out.print("Aw, you definitely have to come some time!");
        }

        //continues conversation after yes/no answer is printed
        System.out.println(" There is always so much to do in New York, want to hear about it?");
        cont = (scnr.next()).equalsIgnoreCase("YES");

        //Talks about the seasons
        while (cont && ((count >= 0) && (count < 4))){
            //Asks for which season
            System.out.println("Which season do you want to hear about? " + seasonNY + "?");
            seasonChoice = scnr.next();

            //If winter is chosen print about winter and remove it from the choices
            if (seasonChoice.equalsIgnoreCase("Winter")){
                seasonNY = seasonNY.replace("Winter ","");
                System.out.println("WOW winter is an amazing time of year in New York, especially in the city." +
                        "\nIn December my friends and I go to Rockefeller Center to see the big christmas tree." +
                        "\nIt is also so much fun to spend time in Bryant Park at the Winter Village they set up!" +
                        "\nPS if you ever go to the Winter Village make sure to go to the fresh crepe store on the west side. They are so good! ");
                count = count + 1;

            }
            //If spring is chosen print about spring and remove it from choices
            else if (seasonChoice.equalsIgnoreCase("Spring")){
                seasonNY = seasonNY.replace("Spring ","");
                System.out.println("Spring is such a beautiful time of year in my hometown, Northport, NY." +
                        "\nIn spring I love to walk to my favorite bakery in the village called Copenhagen." +
                        "\nMy go to order is a fried egg and american cheese on a croissant with a side of breakfast potatoes." +
                        "\nAfter I eat, I usually sit on the pier and read. Northport is so pretty in the spring when" +
                        "\neverything is blossoming. I definitely recommend taking a trip to Northport in the spring.");
                count = count + 1;

            }
            //If summer is chosen print about summer and remove it from choices
            else if (seasonChoice.equalsIgnoreCase("Summer")){
                seasonNY = seasonNY.replace("Summer ","");
                System.out.println("In the summer everyone in New York loves to travel to the beaches.\n" +
                        "Many people travel out to the Hamptons or Montauk, but my favorite beach is" +
                        "\nFire Island. Fire island is a small barrier island that borders Long Island's " +
                        "\nsouth shore. Me and my friends love to rent houses and stay on the beach for a few weeks." +
                        "\nGoing to fire island is a really great break because there are no cars on the island and" +
                        "\nonly a few markets and restaurants. If you ever get the chance to go to Fire Island, go to" +
                        "\nthe town of Ocean Beach and get ice cream at Scoops, its the best!");
                count = count + 1;
            }
            //If fall is chosen print about fall and remove it from choices
            else if (seasonChoice.equalsIgnoreCase("Fall")){
                seasonNY = seasonNY.replace("Fall","");
                System.out.println("In fall New York offers many possibilities. For me, I love to hike in the" +
                        "\nfall so I often will drive up to the Catskill Mountains and hike one of the many trails." +
                        "\nAlso, in the fall my family loves to drive out east for pumpkin and apple piking." +
                        "\nAnywhere you go in New York in the fall, you will surely not be disappointed.");
                count = count + 1;
            }
            //Wrong season chosen
            else{
                System.out.print("Hmm I'm not sure if I know that season...");
            }

            //ask again
            if (count < 4){
                System.out.println("\nIs there another season you would like to hear about, yes or no? ");
                cont = (scnr.next()).equalsIgnoreCase("YES");
            }
        }

        //If I spoke about all the seasons I say goodbye
        if (count == 4) {
            System.out.println("\nWell now that I have told you about New York in all the seasons, there isn't much left to say.\n" +
                    "It was really nice meeting you, " + name + ", I hope we can talk again soon!");
        }
        //Always say it was nice to meet you
        else {
            System.out.println("Okay, it was really nice meeting you, " + name + ", I hope we can talk again soon!");
        }

    }
}
