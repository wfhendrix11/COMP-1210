import java.util.Scanner;

/** 
 * Will calculate the integral number of units 
 * (acres, square yards, and square feet) in a 
 * specified number of square inches input by 
 * the user.  
 *
 * @author William Hendrix 
 * @version 01-25-2016
 */
public class SquareInches 
{
   /**
    * Computes and prints acres, square yards, 
    * square feet, and square inches.  
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter the area in square inches: "); 
      int sqInches = userInput.nextInt();
      
      // check if less than 1 million 
      if (sqInches > 1000000000)
      {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
         return;
      }
      
      // square acres
      int sqAcresMod = sqInches % 6_272_640;
      int sqAcresRem = sqInches - sqAcresMod;
      int sqAcres = sqAcresRem / 6_272_640;
      
      // square yards 
      int sqYardsMod = sqAcresMod % 1_296;
      int sqYardsRem = sqAcresMod - sqYardsMod;
      int sqYards = sqYardsRem / 1_296;
      
      // square feet 
      int sqFeetMod = sqYardsMod % 144;
      int sqFeetRem = sqYardsMod - sqFeetMod;
      int sqFeet = sqFeetRem / 144;
      
      // prints out all 
      System.out.println("Number of Units:");
      System.out.println("\tAcres: " + sqAcres);
      System.out.println("\tSquare Yards: " + sqYards);
      System.out.println("\tSquare Feet: " + sqFeet);
      System.out.println("\tSquare Inches: " + sqFeetMod);
      
   }
}