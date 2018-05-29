import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/** 
 * Reads Hexagonal Prism objects from a file and populates an 
 * array with the objects. It then performs calculations using 
 * the methods from the HexagonalPrism and HexagonalPrismList classes. 
 *
 * @author William Hendrix 
 * @version 02-09-2016
 */
public class HexagonalPrismListApp 
{
  /**
   * Reads in a file, populates an array from the ArrayList class wiht 
   * objects from the HexagonalPrism class. Then performs methods from the 
   * the HexagonalPrism and HexagonalPrismList classes and prints the result. 
   * 
   * @param args - is not used.
   * @throws IOException from scanning input file.
   */

   public static void main(String[] args) throws IOException
   {
      ArrayList<HexagonalPrism> hexList = new ArrayList<HexagonalPrism>();
      String hexagonalPrismListName = "";
      String label1 = "";
      double side1 = 0;
      double height1 = 0;
      
      Scanner scan = new Scanner(System.in);      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner inFile = new Scanner(new File(fileName));
            
      hexagonalPrismListName = inFile.nextLine();     
            
      while (inFile.hasNext())
      {
         label1 = inFile.nextLine();
         side1 = Double.parseDouble(inFile.nextLine());
         height1 = Double.parseDouble(inFile.nextLine());
         
         HexagonalPrism hex = new HexagonalPrism(label1, side1, height1);
         hexList.add(hex);
      }
      
      HexagonalPrismList fileHexagonalPrismList = 
                        new HexagonalPrismList(hexagonalPrismListName, hexList);
      
      System.out.println(fileHexagonalPrismList);
      
      System.out.println(fileHexagonalPrismList.summaryInfo());
      
   }
}
