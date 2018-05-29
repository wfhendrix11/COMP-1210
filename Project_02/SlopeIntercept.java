import java.util.Scanner;

/** 
 * Computes and prints the slope, and X and 
 * Y intercepts of a line, using the given X 
 * and Y coordinates for two points on 
 * the line.  
 *
 * @author William Hendrix 
 * @version 01-25-2016
 */
public class SlopeIntercept 
{
   /**
    * Computes and prints the slope, and X and 
    * Y intercepts of a line. 
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      // enter starting point
      System.out.println("Enter the x and y coordinates of the first point");
      System.out.print("\tx1 = ");
      double x1 = userInput.nextDouble();
      
      System.out.print("\ty1 = ");
      double y1 = userInput.nextDouble();
      
      // enter ending point
      System.out.println("Enter the x and y coordinates of the second point");
      System.out.print("\tx2 = ");
      double x2 = userInput.nextDouble();
      
      System.out.print("\ty2 = ");
      double y2 = userInput.nextDouble();
      
      // compute slope and print 
      double slope = 0; 
      
      if (x1 == x2) 
      {
         System.out.println("Slope: \"undefined\"");
         return; 
      }
      else 
      {
         slope =  (y2 - y1) / (x2 - x1);
         System.out.println("Slope: " + slope);
      }
      
      // compute y intercept and print  
      double yInter = y1 - (slope * x1);
      System.out.println("Y intercept: " + yInter);

      
      // compute x intercept and print
      if (y1 == y2) 
      {
         System.out.println("X intercept: \"undefined\"");
         return; 
      }
      else 
      {
         double xInter = (yInter / slope) * -1;
         System.out.println("X intercept: " + xInter);      
      }
      
   }
}