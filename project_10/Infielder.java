/**
 * This program extends the SoftballPlayer program, and has methods 
 * to get/set InfielderFieldingAvg, and overrides the rating method.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public class Infielder extends SoftballPlayer 
{
   private double inFielderFieldingAvg;
   
  /** 
   * Creates a new SoftballPlayer object witha given number, name, position, 
   * specialization factor, and batting average. 
   * 
   * @param numberIn for number
   * @param nameIn for name
   * @param positionIn for position
   * @param specFactorIn for specFactor
   * @param battingAvgIn for battingAvg
   * @param inFielderFieldingAvgIn for inFielderFieldingAvg
   */
   public Infielder(String numberIn, String nameIn, String positionIn, 
      double specFactorIn, double battingAvgIn, double inFielderFieldingAvgIn)
   {
      super(numberIn, nameIn, positionIn, specFactorIn, battingAvgIn);
      inFielderFieldingAvg = inFielderFieldingAvgIn;
   }
   
  /** 
   * Returns the infielder fielding average of the SoftballPlayer object.
   * 
   * @return inFielderFieldingAvg. 
   */
   public double getInfielderFieldingAvg()
   {
      return inFielderFieldingAvg;
   }
   
  /** 
   * Sets the infielder fielding average of the SoftballPlayer object.
   *
   * @param inFielderFieldingAvgIn for inFielderFieldingAvg. 
   */
   public void setInfielderFieldingAvg(double inFielderFieldingAvgIn)
   {
      inFielderFieldingAvg = inFielderFieldingAvgIn;
   }
   
  /** 
   * Computes the rating of the SoftballPlayer object by multiplying the 
   * base rating, specialization factor, batting average, and outfielding 
   * average.
   * 
   * @return double. 
   */ 
   public double rating()
   {
      return BASE_RATING * specFactor * battingAvg * inFielderFieldingAvg;
   } 
}
