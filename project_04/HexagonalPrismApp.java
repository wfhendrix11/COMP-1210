import java.util.Scanner;

/** 
 * Reads in a label, side 
 * and height and creates a
 * new object of the Hexagonal
 * Prism class. 
 *
 * @author William Hendrix 
 * @version 02-09-2016
 */
public class HexagonalPrismApp
{
  /** 
   * Creates a new Hexagonal prism object with 
   * called input1 with the label, side, and 
   * height entered by the user.
   *
   * @param args Command line arguments (not used). 
  */
   public static void main(String[] args)
   { 
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter label, side, and height" 
                           + " for a hexagonal prism.");
      System.out.print("\tlabel: ");
      String inputLabel = sc.nextLine();
      System.out.print("\tside: ");
      double inputSide = sc.nextDouble();
      System.out.print("\theight: ");
      double inputHeight = sc.nextDouble();
      
      HexagonalPrism input1 = new HexagonalPrism(inputLabel, inputSide,
                                                    inputHeight);
      input1.setLabel(inputLabel);
      input1.setSide(inputSide);
      input1.setHeight(inputHeight);
      
      System.out.println(input1);
   }
}