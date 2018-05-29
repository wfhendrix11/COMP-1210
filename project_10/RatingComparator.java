import java.util.Comparator;

/**
 * This program implements the comparator interface, and has a 
 * method called compare that compares two SoftballPlayer objects
 * by their rating.    
 *    
 * Project 10.
 *
 * @author William Hendrix - section 003
 * @version 4/17/16
 */
public class RatingComparator implements Comparator<SoftballPlayer> 
{
  /** 
   * Returns a -1 if the first rating is large, a 1 if the second
   * rating is larger, and a 0 if they are even. 
   * 
   * @param p1 for SoftballPlayer.
   * @param p2 for SoftballPlayer.
   * @return result. 
   */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) 
   {
      if (p1.rating() > p2.rating()) 
      {
         return -1;
      }
      else if (p1.rating() < p2.rating()) 
      {
         return 1;
      }
      return 0;
   }
}







