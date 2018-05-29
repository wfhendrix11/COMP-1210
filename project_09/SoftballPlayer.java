import java.text.DecimalFormat;

/**
 * This program creates softball objects and has methods to get/set number,
 * get/set name, get/set position, get/set specialization factor, get/reset 
 * count, return a string of stats, return a summary of the SoftballPlayer,
 * and rating.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public abstract class SoftballPlayer
{
   protected String number, name, position;
   protected double specFactor, battingAvg;
   protected static int count = 0;
   protected static final int BASE_RATING = 10;
   
  /** 
   * Creates a new SoftballPlayer object witha given number, name, position, 
   * specialization factor, and batting average. 
   * 
   * @param numberIn for number
   * @param nameIn for name
   * @param positionIn for position
   * @param specFactorIn for specFactor
   * @param battingAvgIn for battingAvg
   */
   public SoftballPlayer(String numberIn, String nameIn, String positionIn,
                           double specFactorIn, double battingAvgIn)
   {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      specFactor = specFactorIn;
      battingAvg = battingAvgIn;
      count++;
   }
   
  /** 
   * Returns the number of the SoftballPlayer objects.
   * 
   * @return number. 
   */
   public String getNumber()
   {
      return number;
   }
   
  /** 
   * Sets the number of the SoftballPlayer objects.
   * 
   * @param numberIn for number. 
   */
   public void setNumber(String numberIn)
   {
      number = numberIn;
   }
   
  /**
   * Returns the name of the SoftballPlayer object.
   *  
   * @return name. 
   */ 
   public String getName()
   {
      return name;
   }
   
  /** 
   * Sets the name of the SoftballPlayer object.
   * 
   * @param nameIn for name. 
   */ 
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
  /** 
   * Returns the position of the SoftballPlayer object. 
   * 
   * @return position. 
   */
   public String getPosition()
   {
      return position;
   }
   
   
  /**
   * Sets the position of the SoftballPlayer object.
   *  
   * @param positionIn for position. 
   */
   public void setPosition(String positionIn)
   {
      position = positionIn;
   }
   
  /**
   * Returns the batting average of the SoftballPlayer object.
   *  
   * @return battingAvg. 
   */
   public double getBattingAvg()
   {
      return battingAvg;
   }
   
  /**
   * Sets the batting average of the SoftballPlayer object.
   *  
   * @param battingAvgIn for battingAvg. 
   */ 
   public void setBattingAvg(double battingAvgIn)
   {
      battingAvg = battingAvgIn;
   }
   
  /**
   * Returns the specialization factor of the SoftballPlayer object.
   *   
   * @return specFactor. 
   */
   public double getSpecializationFactor()
   {
      return specFactor;
   }
   
  /**
   * Sets the specialization factor of the SoftballPlayer object.
   *  
   * @param specFactorIn for specFactor.  
   */ 
   public void setSpecializationFactor(double specFactorIn)
   {
      specFactor = specFactorIn;
   }
   
  /** 
   * Returns the amount of SoftballPlayer objects.
   * 
   * @return count. 
   */
   public static int getCount()
   {
      return count;
   }
  /**
   * Resets the amount of SoftballPlayer objects.  
   */
   public static void resetCount()
   {
      count = 0;
   }
   
  /**
   * Returns a String representation of the batting average 
   * of the SoftballPlayer object.
   *  
   * @return a String. 
   */
   public String stats()
   {
      DecimalFormat df = new DecimalFormat(".000");
      String dfBattingAvg = df.format(battingAvg);
      return dfBattingAvg;
   }
   
  /** 
   * Returns a String representation of the SoftballPlayer object including
   * name, position, stats, specialization factor, class, and rating.
   * 
   * @return a String.  
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat(".000");
      return number
         + " " + name + " " + "(" + position + ")"
         + " " + stats() + "\n"
         + "Specialization Factor: " 
         + specFactor + " (" + this.getClass() + ")"
         + " Rating: " + df.format(rating());
   }
   
  /**
   * Returns the rating of the SoftballPlayer object (overridden 
   * by child classes).
   *  
   * @return rating.  
   */
   public abstract double rating();
}