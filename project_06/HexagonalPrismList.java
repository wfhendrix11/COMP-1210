import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/** 
 * Represents a name of an HexagonalPrism object
 * and creates an Array List of HexagonalPrism objects. 
 */
public class HexagonalPrismList 
{
   private String name;
   private ArrayList<HexagonalPrism> list;
   
  /** 
   * Initializes a HexagonalPrism object given the name and an ArrayList of 
   * HexagonalPrism objects. Also calculates the number, total surface area,
   * total volume, total base perimeter, totalbase area, average surface 
   * area, and average volume of the HexagonalPrism objects. Then prints 
   * them out using a toString method and summary method.
   *
   * @param nameIn of Hexagonal Prism object.
   * @param listIn of Hexagonal Prism objects.
   */
   public HexagonalPrismList(String nameIn, ArrayList<HexagonalPrism> listIn)
   {
      name = nameIn;
      list = listIn; 
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
      if (list.size() > 0)
      {
         return list.size();
      }
      else 
      {
         return 0;
      }
   }
   
  /** 
	* Computes the total surface area for all HexagonalPrism 
   * ArrayList objects.
   * 
	* @return the total surface area.
	*/
   public double totalSurfaceArea()
   {
      int index = 0;
      double totalSurfaceArea = 0;
      while (index < list.size()) 
      {
         HexagonalPrism hx = list.get(index);
         totalSurfaceArea += hx.surfaceArea();
         index++;
      }
      return totalSurfaceArea;     
   }
   
  /** 
	* Computes the total volume for all HexagonalPrism 
   * ArrayList objects.
   * 
	* @return the total volume.
	*/
   public double totalVolume()
   {
      int index = 0;
      double totalVolume = 0;
      while (index < list.size()) 
      {
         HexagonalPrism hx = list.get(index);
         totalVolume += hx.volume();
         index++;
      }
      return totalVolume;     
   }
   
  /** 
	* Computes the total base perimeter for all 
   * HexagonalPrism ArrayList objects.
   * 
	* @return the total base perimeter.
	*/
   public double totalBasePerimeter()
   {
      int index = 0;
      double totalBasePerimeter = 0;
      while (index < list.size()) 
      {
         HexagonalPrism hx = list.get(index);
         totalBasePerimeter += hx.basePerimeter();
         index++;
      }
      return totalBasePerimeter;     
   }
   
  /** 
	* Computes the total base area for all 
   * HexagonalPrism ArrayList objects.
   * 
	* @return the total base area.
	*/
   public double totalBaseArea()
   {
      int index = 0;
      double totalBaseArea = 0;
      while (index < list.size()) 
      {
         HexagonalPrism hx = list.get(index);
         totalBaseArea += hx.baseArea();
         index++;
      }
      return totalBaseArea;     
   }
   
  /** 
	* Computes the average surface area for all 
   * HexagonalPrism ArrayList objects.
   * 
	* @return the average surface area.
	*/
   public double averageSurfaceArea()
   {
      if (list.size() > 0)
      {
         return totalSurfaceArea() / list.size();
      }
      else 
      {
         return 0;
      }
   }  
   
  /** 
	* Computes the average volume for all HexagonalPrism 
   * ArrayList objects.
   * 
	* @return the average volume.
	*/
   public double averageVolume()
   {
      if (list.size() > 0)
      {
         return totalVolume() / list.size();
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
      while (index < list.size()) 
      {
         result += "\n" + list.get(index) + "\n"; 
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
   * @return the array list of HexagonalPrism objects.
   */
   public ArrayList<HexagonalPrism> getList()
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
   public HexagonalPrismList readFile(String fileNameIn) throws IOException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      String tListName = "";
      String label = "";
      double side = 0, height = 0;
      
      name = scanFile.nextLine();      
      while (scanFile.hasNext()) 
      {
         label = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism h = new HexagonalPrism(label, side, height);
         myList.add(h);           
      }
      
      HexagonalPrismList hpList = new HexagonalPrismList(name, myList);
      
      return hpList;
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
      
      list.add(h);
   }
   
  /**
   * Deletes a HexagonalPrism object from the list.
   *   
   * @param labelIn entered by user.
   * @return true if the label entered is equal to a HexagonalPrism object.
   * label.
   */   
   public HexagonalPrism deleteHexagonalPrism(String labelIn)
   {
      int index = 0;
      
      for (HexagonalPrism h : list)
      {
         if (h.getLabel().equalsIgnoreCase(labelIn))
         {
            list.remove(index);
            return list.get(index);
         }
         else
         {
            index++;
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
      
      for (HexagonalPrism h : list)
      {
         if (h.getLabel().equalsIgnoreCase(labelIn))
         {
            return list.get(index);
         }
         else
         {
            index++;
         }
      }   
      return null;
   }
   
  /**  
   * Edits a HexagonalPrism object in the list.
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
      
      for (HexagonalPrism h : list)
      {
         if (h.getLabel().equalsIgnoreCase(labelIn))
         {
            deleteHexagonalPrism(labelIn);
            addHexagonalPrism(labelIn, sideIn, heightIn);
            return true;
         }
      }
      return result;
   }  
}