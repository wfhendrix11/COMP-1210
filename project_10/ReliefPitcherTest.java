import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the ReliefPitcher class. **/
public class ReliefPitcherTest 
{
   /** Tests the getSaves method. **/
   @Test public void getSavesTest() 
   {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 2.0,
                                              .125, 5, 4, 3.85, 17);
      Assert.assertEquals(p4.getSaves(), 17);
   }
   
   /** Tests the setSaves method. **/
   @Test public void setSavesTest() 
   {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 2.0, 
                                             .125, 5, 4, 3.85, 17);
      p4.setSaves(15);
      Assert.assertEquals(p4.getSaves(), 15);
   }
   
   /** Tests the rating method. **/
   @Test public void ratingTest() 
   {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 2.0, 
                                             .125, 5, 4, 3.85, 17);
      Assert.assertEquals(p4.rating(), 2.474, .01);
   }
   
   /** Tests the stats method. **/
   @Test public void statsTest()
   {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 2.0,
                                              .125, 5, 4, 3.85, 17);
      Assert.assertTrue(p4.stats().contains("5")
                     && p4.stats().contains("4") 
                     && p4.stats().contains("17")
                     && p4.stats().contains("3.85"));
   }
}
