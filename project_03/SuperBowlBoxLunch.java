import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

/** 
 * Calculates the total for a 
 * food order from a set menu. 
 *
 * @author William Hendrix 
 * @version 02-03-2016
 */
public class SuperBowlBoxLunch 
{
   /**
    * Reads in a string and returns the 
    * name, amount of adult meals and price, 
    * the amount of child meals and price, 
    * the total price, the theme and a random 
    * nuber. 
    *
    * @param args Command line arguments (not used).
    */ 
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
      Random rdm = new Random();
      
      System.out.print("Enter order code: ");
      String code = userInput.nextLine();
      String codeTrim = code.trim();
      
      System.out.println();
      if (codeTrim.length() < 13) 
      {
         System.out.println("***Invalid Order Code***\n" 
            + "Order code must have at least 13 characters.");
         return;
      }
      
      //parse up string 
      String theme = codeTrim.substring(0, 1);
      String adultMeals = codeTrim.substring(1, 3);
      String adultMealsPrice = codeTrim.substring(3, 7);
      String childMeals = codeTrim.substring(7, 9);
      String childMealsPrice = codeTrim.substring(9, 13);
      String name = codeTrim.substring(13, codeTrim.length());
      
      //format adult meals 
      if (adultMeals.contains("0"))
      {
         adultMeals = codeTrim.substring(2, 3);
      } 
      
      //format child meals 
      if (childMeals.contains("0"))
      {
         childMeals = codeTrim.substring(8, 9);
      } 
      
      //compute adult meals price 
      double adultMealsPriceDouble = Double.parseDouble(adultMealsPrice);
      adultMealsPriceDouble = (adultMealsPriceDouble / 100);
      
      //compute child meals price 
      double childMealsPriceDouble = Double.parseDouble(childMealsPrice);
      childMealsPriceDouble = (childMealsPriceDouble / 100);

      //compute total 
      double adultMealsDouble = Double.parseDouble(adultMeals);
      double childMealsDouble = Double.parseDouble(childMeals);
      double total = (adultMealsDouble * adultMealsPriceDouble) 
         + (childMealsDouble * childMealsPriceDouble);
            
      //compute theme  
      int themeInt = Integer.parseInt(theme);
      if (themeInt == 0) 
      {
         theme = "Broncos";
      }
      else if (themeInt == 1)
      {
         theme = "Panthers";
      }
      else 
      {
         theme = "Broncos and Panthers";
      }
      
      //compute lucky number 
      double luckyNumber = Math.random() * 10000;
      DecimalFormat luckyNumForm = new DecimalFormat("0000");
      String luckyNumberFormat = luckyNumForm.format(luckyNumber);
      
      //print out all 
      System.out.println("\nName: " + name);
      System.out.println("Adult meals: " + adultMeals + " at " 
         + currencyFmt.format(adultMealsPriceDouble));
      System.out.println("Child meals: " + childMeals + " at " 
         + currencyFmt.format(childMealsPriceDouble));
      System.out.println("Total: " + currencyFmt.format(total));
      System.out.println("Theme: " + theme);
      System.out.println("Lucky Number: " + luckyNumberFormat); 
          
   }
}

      //input: 1091895020695Sam Jones