/**
 * This program extends the SoftballPlayer program, and has methods 
 * to get/set OutfielderFieldingAvg, and overrides the rating method.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public class Outfielder extends SoftballPlayer 
{
   private double outfieldingFieldingAvg;
   
  /** 
   * Creates a new SoftballPlayer object witha given number, name, position, 
   * specialization factor, and batting average. 
   * 
   * @param numberIn for number
   * @param nameIn for name
   * @param positionIn for position
   * @param specFactorIn for specFactor
   * @param battingAvgIn for battingAvg
   * @param outfieldingFieldingAvgIn for outfieldingFieldingAvg
   */
   public Outfielder(String numberIn, String nameIn, String positionIn, 
      double specFactorIn, double battingAvgIn, double outfieldingFieldingAvgIn)
   {
      super(numberIn, nameIn, positionIn, specFactorIn, battingAvgIn);
      outfieldingFieldingAvg = outfieldingFieldingAvgIn;
   }
   
  /** 
   * Returns the outfield fielding average of the SoftballPlayer object.
   * 
   * @return number. 
   */
   public double getOutfielderFieldingAvg()
   {
      return outfieldingFieldingAvg;
   }
   
  /** 
   * Sets the outfield fielding average of the SoftballPlayer object.
   *
   * @param outfieldingFieldingAvgIn for outfieldingFieldingAvg. 
   */
   public void setOutfielderFieldingAvg(double outfieldingFieldingAvgIn)
   {
      outfieldingFieldingAvg = outfieldingFieldingAvgIn;
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
      return BASE_RATING * specFactor * battingAvg * outfieldingFieldingAvg;
   }    
}