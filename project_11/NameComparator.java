import java.util.Comparator;

/**
 * This program implements the comparator interface, and has a 
 * method called compare that compares two SoftballPlayer objects
 * by their last name, and then their first.    
 *    
 * Project 10.
 *
 * @author William Hendrix - section 003
 * @version 4/17/16
 */
public class NameComparator implements Comparator<SoftballPlayer> 
{
  /** 
   * Returns a. 
   * 
   * @param p1 for SoftballPlayer.
   * @param p2 for SoftballPlayer.
   * @return result. 
   */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) 
   {
      String p1Name = p1.getName();
      int a = p1Name.indexOf(" ") + 1;
      
      String p1FirstName = p1Name.substring(0, a);
      String p1LastName = p1Name.substring(a, p1Name.length());
      
      String p2Name = p2.getName();
      int b = p2Name.indexOf(" ") + 1;
      
      String p2FirstName = p2Name.substring(0, b);
      String p2LastName = p2Name.substring(b, p2Name.length());
      
      int result = p1LastName.compareToIgnoreCase(p2LastName);
      int result2 = p1FirstName.compareToIgnoreCase(p2FirstName);
     
      if (result < 1) 
      {
         return -1; 
      }
      else if (result == 0 && result2 > 1) 
      {
         return 1;
      }
      else if (result > 1)
      {
         return 1;
      }
      return 0;
   }
}