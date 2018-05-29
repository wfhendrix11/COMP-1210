/**
 * This program extends the SoftballPlayer program, and has methods 
 * to get/set wins, get/set losses, get/set Era, and overrides the rating
 * and stats methods.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public class Pitcher extends SoftballPlayer 
{
   protected int wins, losses;
   protected double era;
   
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
   */
   public Pitcher(String numberIn, String nameIn, String positionIn,
       double specFactorIn, double battingAvgIn, int winsIn, int lossesIn,
             double eraIn)
   {
      super(numberIn, nameIn, positionIn, specFactorIn, battingAvgIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
  /** 
   * Returns the amount of wins of the SoftballPlayer object.
   * 
   * @return wins. 
   */
   public int getWins()
   {
      return wins;
   }
   
  /** 
   * Sets the amount of wins of the SoftballPlayer object.
   *
   * @param winsIn for wins. 
   */
   public void setWins(int winsIn)
   {
      wins = winsIn;
   }
   
  /** 
   * Returns the amount of losses of the SoftballPlayer object.
   * 
   * @return losses. 
   */
   public int getLosses()
   {
      return losses;
   }
   
  /** 
   * Sets the amount of losses of the SoftballPlayer object.
   *
   * @param lossesIn for losses. 
   */
   public void setLosses(int lossesIn)
   {
      losses = lossesIn;
   }
   
  /** 
   * Returns the era of the SoftballPlayer object.
   * 
   * @return era. 
   */
   public double getEra()
   {
      return era;
   }
   
  /** 
   * Sets the era of the SoftballPlayer object.
   *
   * @param eraIn for era. 
   */
   public void setEra(double eraIn)
   {
      era = eraIn;
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
         * ((wins - losses) / 25.0);
   }
   
  /**
   * Returns a String representation of the wins, losses, and era 
   * of the SoftballPlayer object.
   *  
   * @return a String. 
   */
   public String stats()
   {
      return wins + " wins, " + losses + " losses, " + era + " ERA";  
   }
}