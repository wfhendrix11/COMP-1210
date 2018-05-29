import java.util.ArrayList;
import java.text.DecimalFormat;

/** 
 * Represents a name of an HexagonalPrism object
 * and creates an Array List of HexagonalPrism objects. 
 */
public class HexagonalPrismList 
{
   private String name;
   private ArrayList<HexagonalPrism> list = new ArrayList<HexagonalPrism>();
   
  /** 
   * Initializes a HexagonalPrism object given the name
   * and an ArrayList of HexagonalPrism objects. Also calculates the
   * number, total surface area, total volume, total base perimeter, total
   * base area, average surface area, and average volume of the HexagonalPrism 
   * objects. Then prints them out using a toString method and summary method.
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
      while (index < list.size()) {
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
      result += "----- " + getName() + " Summary -----"; 
      result += "\nNumber of Hexagonal Prisms: " + numberOfHexagonalPrisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nTotal Base Perimeter: "  + df.format(totalBasePerimeter());
      result += "\nTotal Base Area: "  + df.format(totalBaseArea());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      
      return result;
   }    
   
    
  
   

   




}