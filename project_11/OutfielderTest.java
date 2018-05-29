import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the Outfielder class. **/
public class OutfielderTest {

//---------------------------SoftballPlayer Test Methods------------------------
   
   /** Tests the getNumber method. **/
   @Test public void getNumberTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals("32", p1.getNumber());
   }
   
   /** Tests the setNumber method. **/
   @Test public void setNumberTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setNumber("21");
      Assert.assertEquals("21", p1.getNumber());
   }
   
   /** Tests the getName method. **/
   @Test public void getNameTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals("Pat Jones", p1.getName());
   }
   
   /** Tests the setNumber method. **/
   @Test public void setNameTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setName("Brent White");
      Assert.assertEquals("Brent White", p1.getName());
   }
   
   /** Tests the getPosition method. **/
   @Test public void getPositionTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals("RF", p1.getPosition());
   }
   
   /** Tests the setPosition method. **/
   @Test public void setPositionTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
   }
   
   /** Tests the getBattingAvg method. **/
   @Test public void getBattingAvgTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals(.375, p1.getBattingAvg(), 0);
   }

   /** Tests the setBattingAvg method. **/   
   @Test public void setBattingAvgTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setBattingAvg(.350);
      Assert.assertEquals(.350, p1.getBattingAvg(), 0);
   }
   
   /** Tests the getSpecializationFactor method. **/
   @Test public void getSpecializationFactorTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals(1.0, p1.getSpecializationFactor(), 0);
   }
   
   /** Tests the setSpecializationFactor method. **/
   @Test public void setSpecializationFactorTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setSpecializationFactor(0);
      Assert.assertEquals(0, p1.getSpecializationFactor(), 0);
   }
   
   /** Tests the getCount method and resetCount method. **/
   @Test public void getCountTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.resetCount();
      Assert.assertEquals(0, p1.getCount(), 0);
   }
   
   /** Tests the stats method. **/
   @Test public void statsTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertTrue(p1.stats().contains(".375"));
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest()
   {
      boolean result = false;
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      if (p1.toString().contains("Pat Jones")
          && p1.toString().contains("Pat Jones")
          && p1.toString().contains("RF")
          && p1.toString().contains("1.0")
          && p1.toString().contains(".375")
          && p1.toString().contains("3.562")
          && p1.toString().contains("Outfielder"))
      {
         result = true;
      }
      Assert.assertTrue(result);
   }
   
   /** Tests the compareTo EQUAL method. **/
   @Test public void compareToEqualTest()
   { 
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Outfielder p2 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      Assert.assertEquals(0, p1.compareTo(p2), 0);
   }
   
   /** Tests the compareTo SMALLER method. **/
   @Test public void compareToSmallerTest()
   { 
      Outfielder p1 = new Outfielder("10", "Pat Jones", "RF", 1.0, .375, .950);
      Outfielder p2 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      Assert.assertEquals(-1, p1.compareTo(p2), 0);
   }
   
   /** Tests the compareTo GREATER method. **/
   @Test public void compareToGreaterTest()
   { 
      Outfielder p1 = new Outfielder("49", "Pat Jones", "RF", 1.0, .375, .950);
      Outfielder p2 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      
      Assert.assertEquals(1, p1.compareTo(p2), 0);
   }
   
//---------------------------Outfielder Test Methods----------------------------
   
   /** Tests the getOutFielderFieldingAvg method. **/
   @Test public void getOutFielderFieldingAvgTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals(.950, p1.getOutfielderFieldingAvg(), 0);
   }
   
   /** Tests the setOutFielderFieldingAvg method. **/
   @Test public void setOutFielderFieldingAvgTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setOutfielderFieldingAvg(.800);
      Assert.assertEquals(.800, p1.getOutfielderFieldingAvg(), 0);
   }
   
   /** Tests the rating method. **/
   @Test public void ratingTest()
   {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Assert.assertEquals(3.5625, p1.rating(), 0);
   } 
}
