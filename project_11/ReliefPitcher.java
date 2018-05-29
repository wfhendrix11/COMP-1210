/**
 * This program extends the SoftballPlayer program, and has methods 
 * to get/set saves, and overrides the rating and stats methods.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public class ReliefPitcher extends Pitcher 
{
   private int saves;
   
  /** 
   * Creates a new SoftballPlayer object witha given number, name, position, 
   * specialization factor, and batting average. 
   * 
   * @param numberIn for number
   * @param nameIn for name
   * @param positionIn for position
   * @param specFactorIn for specFactor
   * @param battingAvgIn for battingAvg
   * @param winsIn for wins
   * @param lossesIn for losses
   * @param eraIn for era
   * @param savesIn for saves
   */
   public ReliefPitcher(String numberIn, String nameIn, String positionIn, 
      double specFactorIn, double battingAvgIn, int winsIn, int lossesIn, 
         double eraIn, int savesIn)
   {
      super(numberIn, nameIn, positionIn, specFactorIn, battingAvgIn, 
            winsIn, lossesIn, eraIn);
      saves = savesIn;
   }
   
  /** 
   * Returns the amount of saves of the SoftballPlayer object.
   * 
   * @return saves. 
   */
   public int getSaves()
   {
      return saves;
   }
   
  /** 
   * Sets the amount of saves of the SoftballPlayer object.
   *
   * @param savesIn for saves. 
   */
   public void setSaves(int savesIn)
   {
      saves = savesIn;
   }
   
  /** 
   * Computes the rating of the SoftballPlayer object by multiplying the 
   * base rating, specialization factor, batting average, and outfielding 
   * average, era and wins and losses. 
   * 
   * @return double. 
   */
   public double rating()
   {
      return BASE_RATING * specFactor * (1 / (1 + era)) 
         * ((wins - losses + saves) / 30.0);
   }
   
   /**
   * Returns a String representation of the wins, losses, saves, and era 
   * of the SoftballPlayer object.
   *  
   * @return a String. 
   */
   public String stats()
   {
      return wins + " wins, " + losses + " losses, " + saves 
         + " saves, " + era + " ERA";
   }
   
}
