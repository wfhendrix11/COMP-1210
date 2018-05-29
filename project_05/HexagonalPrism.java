import java.text.DecimalFormat;

/** 
 * Calculates and prints the base perimeter,
 * base area, suraface area and volume of
 * a hexagonal prism. 
 *
 * @author William Hendrix 
 * @version 02-09-2016
 */
public class HexagonalPrism 
{ 
   private String label;
   private double side;
   private double height;
   
  /** 
   * Creates a new Hexagonal prism object with 
   * a given labelIn, sideIn, and heightIn.
   * 
   * @param labelIn for label
   * @param sideIn for side
   * @param heightIn for height
  */ 
   public HexagonalPrism(String labelIn, double sideIn, 
                           double heightIn)
   {
      label = labelIn.trim();
      side = sideIn;
      height = heightIn;
   }
   
  /**  
   * @return label entered by user.
   */
   public String getLabel() 
   {
      return label;
   }
    
  /**
   * If label is null, return false. Else sets 
   * label to trimmed labelIn and returns true.
   *  
   * @param labelIn for label.
   * @return boolean.
   */
   public boolean setLabel(String labelIn)
   {
      if (labelIn == null)
      {
         return false;
      }
      else 
      {
         label = labelIn.trim();
         return true;
      }
   }
    
  /**  
   * @return side entered by user. 
   */
   public double getSide()
   {
      return side;
   }
    
  /**  
   * @param sideIn for side.
   */
   public void setSide(double sideIn)
   {
      side = sideIn; 
   }
    
  /**  
   * @return height entered by user.
   */
   public double getHeight()
   {
      return height;
   }
    
  /**  
   * @param heightIn for height.
   */
   public void setHeight(double heightIn)
   {
      height = heightIn;
   }
    
  /** 
   * Multiplies the side and the height to get
   * the base perimeter. 
   * 
   * @return base perimeter.
   */
   public double basePerimeter()
   {
      return side * 6;
   }
    
  /**  
   * Multipies 3 and the square root of three.
   * Then multiplies the answer to the side
   * squared divided by 2.
   *
   * @return base area.
   */
   public double baseArea()
   {
      return 3 * Math.sqrt(3) * (Math.pow(side, 2) / 2);   
   }
    
  /**
   * Multiplies 6 by the side and the height plus
   * three. Then multiplies the answer by the 
   * square root of three times the side squared. 
   *   
   * @return surface area.
   */
   public double surfaceArea()
   {
      return 6 * side * height + 3 * (Math.sqrt(3) * Math.pow(side, 2));
   }
    
  /** 
   * Multiplies 3 by the square root of three divided
   * by 2. Then multiplies the answer by the side
   * squared multiplied by the height. 
   *
   *  @return volume.
   */
   public double volume()
   {
      return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2) * height;
   }
    
  /**
   * Returns a String representation of the object,
   * including label, side, height, base perimeter,
   * base area, surface area and volume.
   *  
   *  @return String representation of Hexagonal Prism object.
   */
   public String toString()
   {
      DecimalFormat d = new DecimalFormat("#,##0.0##");
      
      String reslt = "\"" + label + "\"" + " is a hexagonal prism with side = " 
                     + d.format(side) + " units and height = "
                     + d.format(height) + " units,\nwhich has"
                     + " base perimeter = " 
                     + d.format(basePerimeter()) + " units, base area = " 
                     + d.format(baseArea()) + " square units,\nsurface area = " 
                     + d.format(surfaceArea()) + " square units, and volume = "
                     + d.format(volume()) + " cubic units.";   
      return reslt; 
   }
}