import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/** 
 * Represents a name of an HexagonalPrism object
 * and creates an Array List of HexagonalPrism objects. 
 */
public class HexagonalPrismList2 
{
   private String name;
   private HexagonalPrism[] list = new HexagonalPrism[100];
   private int numberOfHexagonalPrisms;
   
  /** 
   * Initializes a HexagonalPrism object given the name and an Array of 
   * HexagonalPrism objects. Also calculates the number, total surface area,
   * total volume, total base perimeter, totalbase area, average surface 
   * area, and average volume of the HexagonalPrism objects. Then prints 
   * them out using a toString method and summary method.
   *
   * @param nameIn of Hexagonal Prism object.
   * @param listIn of Hexagonal Prism objects.
   * @param numberOfHexagonalPrismsIn for the amount of objects in the array.
   */
   public HexagonalPrismList2(String nameIn, HexagonalPrism[] listIn, 
                        int numberOfHexagonalPrismsIn)
   {
      name = nameIn;
      list = listIn;
      numberOfHexagonalPrisms = numberOfHexagonalPrismsIn; 
   }
   
  /**
	* @return name given by the user.
	*/
   public String getName()
   {
      return name;
   }
   
  /** 
	* Returns the number of HexagonalPrism objects in 
   * the hexagonal prism list. If there are zero 
   * objects, it returns 0.
   * 
	* @return number of objects in the HexagonalPrismList.
	*/
   public int numberOfHexagonalPrisms()
   {
      if (numberOfHexagonalPrisms > 0)
      {
         return numberOfHexagonalPrisms;
      }
      else 
      {
         return 0;
      }
   }
   
  /** 
	* Computes the total surface area for all HexagonalPrism 
   * Array objects.
   * 
	* @return the total surface area.
	*/
   public double totalSurfaceArea()
   {
      int index = 0;
      double totalSurfaceArea = 0;
      while (index < numberOfHexagonalPrisms) 
      {
         totalSurfaceArea += list[index].surfaceArea();
         index++;
      }
      return totalSurfaceArea;     
   }
   
  /** 
	* Computes the total volume for all HexagonalPrism 
   * Array objects.
   * 
	* @return the total volume.
	*/
   public double totalVolume()
   {
      int index = 0;
      double totalVolume = 0;
      while (index < numberOfHexagonalPrisms) 
      {
         totalVolume += list[index].volume();
         index++;
      }
      return totalVolume;     
   }
   
  /** 
	* Computes the total base perimeter for all 
   * HexagonalPrism Array objects.
   * 
	* @return the total base perimeter.
	*/
   public double totalBasePerimeter()
   {
      int index = 0;
      double totalBasePerimeter = 0;
      while (index < numberOfHexagonalPrisms) 
      {
         totalBasePerimeter += list[index].basePerimeter();
         index++;
      }
      return totalBasePerimeter;     
   }
   
  /** 
	* Computes the total base area for all 
   * HexagonalPrism Array objects.
   * 
	* @return the total base area.
	*/
   public double totalBaseArea()
   {
      int index = 0;
      double totalBaseArea = 0;
      while (index < numberOfHexagonalPrisms) 
      {
         totalBaseArea += list[index].baseArea();
         index++;
      }
      return totalBaseArea;     
   }
   
  /** 
	* Computes the average surface area for all 
   * HexagonalPrism Array objects.
   * 
	* @return the average surface area.
	*/
   public double averageSurfaceArea()
   {
      if (numberOfHexagonalPrisms > 0)
      {
         return totalSurfaceArea() / numberOfHexagonalPrisms;
      }
      else 
      {
         return 0;
      }
   }  
   
  /** 
	* Computes the average volume for all HexagonalPrism 
   * Array objects.
   * 
	* @return the average volume.
	*/
   public double averageVolume()
   {
      if (numberOfHexagonalPrisms > 0)
      {
         return totalVolume() / numberOfHexagonalPrisms;
      }
      else 
      {
         return 0;
      }
   }
   
  /** 
	* Prints the toString method of the HesagonalPrism 
   * class for each object.
   * 
	* @return the toString method of the HexagonalPrism class.
	*/
   public String toString()
   {
      String result = "\n" + name + "\n";
      int index = 0;
      while (index < numberOfHexagonalPrisms) 
      {
         result += "\n" + list[index] + "\n"; 
         index++;  
      }   
      return result;
   } 
   
  /**
	* Prints a summary of the objects in the HexagonalPrismList array.
   * The summary consists of the name, total surface area, total volume
   * total base perimeter, total base area, average surface area, and 
   * average volume of the HexagonalPrismList array.
   * 
	* @return the summaryInfo string.
	*/
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "\n----- " + getName() + " Summary -----"; 
      result += "\nNumber of Hexagonal Prisms: " + numberOfHexagonalPrisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nTotal Base Perimeter: "  + df.format(totalBasePerimeter());
      result += "\nTotal Base Area: "  + df.format(totalBaseArea());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume()) + "\n";
      
      return result;
   }
   
   //---------------------------PROJECT_06 METHODS----------------------------
   
  /**  
   * @return the array of HexagonalPrism objects.
   */
   public HexagonalPrism[] getList()
   {
      return list;
   }  
    
  /**  
   * Reads in HexagonalPrism data from a file and creates a 
   * HexagonalPrismList object.
   *
   * @param fileNameIn for fileName to read.
   * @return HexagonalPrismList.
   * @throws IOException for file reading.
   */   
   public HexagonalPrismList2 readFile(String fileNameIn) throws IOException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      HexagonalPrism[] myList = new HexagonalPrism[100];
      String label = "";
      double side = 0, height = 0;
      
      name = scanFile.nextLine();      
      while (scanFile.hasNext()) 
      {
         label = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism ht = new HexagonalPrism(label, side, height);
         myList[numberOfHexagonalPrisms] = ht;
         numberOfHexagonalPrisms++;           
      }
      
      HexagonalPrismList2 hexList = new HexagonalPrismList2(name, myList, 
                     numberOfHexagonalPrisms);
      
      return hexList;
   }
   
  /**  
   * Add a HexagonalPrism object to the list.
   * 
   * @param labelIn label entered by user.
   * @param sideIn side enterd by user.
   * @param heightIn height entered by user.
   */   
   public void addHexagonalPrism(String labelIn, 
                                    double sideIn, double heightIn) {
       
      HexagonalPrism h = new HexagonalPrism(labelIn, sideIn, heightIn);
      list[numberOfHexagonalPrisms] = h;
      numberOfHexagonalPrisms++;
   }
   
  /**
   * Deletes a HexagonalPrism object from the array.
   *   
   * @param labelIn entered by user.
   * @return true if the label entered is equal to a HexagonalPrism object.
   * label.
   */   
   public HexagonalPrism deleteHexagonalPrism(String labelIn)
   {
      int result = 0;
      
      for (int i = 0; i < numberOfHexagonalPrisms; i++) 
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) 
         { 
            for (int j = i; j < numberOfHexagonalPrisms - 1; j++) 
            {
               list[j] = list[j + 1];
            }
            
            list[numberOfHexagonalPrisms - 1] = null;
            numberOfHexagonalPrisms--;
            return list[result];
         }
      }
      return null;
   }
   
  /**
   * Returns the summary of a HexagonalPrism object.
   *   
   * @param labelIn entered by user.
   * @return true if the label entered is equal to a HexagonalPrism object
   * label, otherwise return null.
   */ 
   public HexagonalPrism findHexagonalPrism(String labelIn)
   {
      int index = 0;
      int result = 0;
      
      for (int i = 0; i < numberOfHexagonalPrisms; i++) 
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) 
         {
            return list[i];
         }
      }
      return null;
   }
   
  /**  
   * Edits a HexagonalPrism object in the array.
   * 
   * @param labelIn label entered by user.
   * @param sideIn side enterd by user.
   * @param heightIn height entered by user.
   * @return true if the label inputed is equal to a HexagonalPrism object, 
   * otherwise returns false.
   */  
   public boolean editHexagonalPrism(String labelIn, 
                                       double sideIn, double heightIn)
   {
      boolean result = false;
      
      for (int i = 0; i < numberOfHexagonalPrisms; i++) 
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) 
         {
            list[i] = new HexagonalPrism(labelIn, sideIn, heightIn);
            result = true;
         }
      }
      return result;
   }  
}