import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the Pitcher class. **/
public class PitcherTest {

   /** Tests the getWins method. **/
   @Test public void getWinsTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125, 
                                 22, 4, 2.85);
      Assert.assertEquals(22, p3.getWins(), 0);
   }
   
   /** Tests the setWins method. **/
   @Test public void setWinsTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125,
                                  22, 4, 2.85);
      p3.setWins(10);
      Assert.assertEquals(10, p3.getWins(), 0);
   }
   
   /** Tests the getLosses method. **/
   @Test public void getLossesTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125,
                                  22, 4, 2.85);
      Assert.assertEquals(4, p3.getLosses(), 0);
   }
   
   /** Tests the setLosses method. **/
   @Test public void setLossesTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125,
                                  22, 4, 2.85);
      p3.setLosses(6);
      Assert.assertEquals(6, p3.getLosses(), 0);
   }
   
   /** Tests the getEra method. **/
   @Test public void getEraTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125,
                                  22, 4, 2.85);
      Assert.assertEquals(2.85, p3.getEra(), 0);
   }
   
   /** Tests the setEra method. **/
   @Test public void setEraTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125, 
                                 22, 4, 2.85);
      p3.setEra(2.95);
      Assert.assertEquals(2.95, p3.getEra(), 0);
   }
   
   /** Tests the rating method. **/
   @Test public void ratingTest() 
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125, 
                                 22, 4, 2.85);
      Assert.assertEquals(3.740 , p3.rating(), .01);
   }
   
   /** Tests the stats method. **/
   @Test public void statsTest()
   {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 2.0, .125,
                                  22, 4, 2.85);
      Assert.assertTrue(p3.stats().contains("22") 
                     && p3.stats().contains("4") 
                     && p3.stats().contains("2.85"));
   }
}
