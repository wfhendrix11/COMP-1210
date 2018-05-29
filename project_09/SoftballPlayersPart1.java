/**
 * This program instantiates four SoftballPlayer objects.
 *    
 * Project 9.
 *
 * @author William Hendrix - section 003
 * @version 4/7/16
 */
public class SoftballPlayersPart1
{
   /**
   * Creates four SoftballPlayer objects and loads them with data.   
   * 
   * @param args - is not used.
   */
   public static void main(String[] args)
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      System.out.println(p1 + "\n");
      
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 1.25, 
                                       .275, .850);
      System.out.println(p2 + "\n");
      
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125, 22,
                                  4, 2.85);
      System.out.println(p3 + "\n");
      
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 2.0, 
                                             .125, 5, 4, 3.85, 17);
      System.out.println(p4 + "\n");     
   }
}