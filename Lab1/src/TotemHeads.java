/*@file TotemHeads.java
  @brief This program uses the "System.out.println();" method to print three stacked totem heads
  @author Olivia Caulfield
  @data 9/8/2020*/

public class TotemHeads {
    public static void main (String [] args) {
        //tools
        String hair = "||||||||||||||||";
        String plain = "|              |";

        //Original Head
        //top to eyes
        System.out.println("   /||||||||||||\\\n  /              \\\n  " + plain + "\n  |   Q      Q   |");
        //eyes to chin
        System.out.println("  " + plain + "\n  |      C       |\n  " + plain + "\n  |   )______(   |\n  |       U      |\n  " + plain);

        //First Head
        //top to eyes
        System.out.println("  " + hair+ "\n  " + plain + "\n  " + plain + "\n  |   o      o   |");
        //eyes to mouth
        System.out.println(" _"+ plain + "_\n|_                _|\n  |  |________|  |");
        //mouth to hair
        System.out.println("  " + plain + "\n  " + plain + "\n  " + hair);

        //Second Head
        //top to eyes
        System.out.println("  |  __      __  |\n  | !  ! __ !  ! |\n  | !o !/  \\!o ! |");
        //eyes to mustache
        System.out.println("  | !__!    !__! |\n  " + plain + "\n  |    ///|\\\\\\   |");
        //mustache to chin
        System.out.println("   \\            /\n    \\     o    /\n     \\ _______/");
    }

}
