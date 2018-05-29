import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Creates a menu using a HexagonalPrismList object loaded with HexagonalPrism 
 * objects, some being read from a file. 
 */
public class HexagonalPrismListMenuApp
{
  /**
   * Creates an HexagonalPrismList and loads it with HexagonalPrism objects from
   * a file. Then uses a swith statement to create a menu for the user to 
   * interact with using the HexagonalPrism methods.  
   * 
   * @param args - is not used.
   * @throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException
   {
      String hListName = "*** no list name assigned ***";
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList myHList = new HexagonalPrismList(hListName, myList);
      String fileName = "no file name";
      
      String labelIn;
      double sideIn, heightIn;   
      
      String code = "";
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Hexagonal Prism List System Menu\n"
                       + "R - Read File and Create Hexagonal Prism List\n"
                       + "P - Print Hexagonal Prism List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Hexagonal Prism\n"   
                       + "D - Delete Hexagonal Prism\n"   
                       + "F - Find Hexagonal Prism\n"
                       + "E - Edit Hexagonal Prism\n"
                       + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
                           
               myHList = myHList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Hexagonal Prism List created\n");
               break;
               
            case 'P':
               System.out.println(myHList);
               break;
               
            case 'S':
               System.out.println(myHList.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tSide: ");
               sideIn = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(scan.nextLine());
               
               myHList.addHexagonalPrism(labelIn, sideIn, heightIn);
               System.out.println("\t*** Hexagonal Prism added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
            
               if (myHList.deleteHexagonalPrism(labelIn) != null) {
                  System.out.println("\t\"" + labelIn + "\"" + " deleted");
               }
               else {
                  System.out.println("\t\"" + labelIn + "\"" + " not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               
               if (myHList.findHexagonalPrism(labelIn) == null)
               {
                  System.out.println("\t\"" + labelIn + "\"" + " not found\n");
               }
               else
               {
                  String out = myHList.findHexagonalPrism(labelIn).toString();
                  System.out.println(out + "\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tSide: ");
               sideIn = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(scan.nextLine());
               
               if (myHList.editHexagonalPrism(labelIn, sideIn, heightIn))
               {
                  System.out.println("\t\"" + labelIn + "\"" 
                                       + " successfully edited");
               }
               else
               {
                  System.out.println("\t\"" + labelIn + "\"" + " not found");
               }
               break;                  
               
            case 'Q': case 'q':
               break;
               
            default:
         }
      
      } while (!code.equalsIgnoreCase("Q"));
      
      
   }
}