import org.junit.Assert;
//import static org.junit.Assert.*; checkstyle error!
//import org.junit.Before;
import org.junit.Test;

/** Tests methods in HexagonalPrism class. **/
public class HexagonalPrismTest {

   /** tests the return label. **/
   @Test public void getLabelTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.getLabel(), "Wide Example");
   }
   
   /** tests the set label when setting the 
   * label equal to null.
   **/
   @Test public void setLabelFalseTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.setLabel(null), false);
   }
   
  /** tests the set label when setting the 
   * label equal to a string.
   **/
   @Test public void setLabelTrueTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.setLabel("Wide Example"), true);
   }
   
   /** tests the get side and set side method. **/
   @Test public void getSideTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      h.setSide(12.0);
      Assert.assertEquals(h.getSide(), 12.0, 0);
   }
     
   /** tests the get height. **/
   @Test public void getHeightTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      h.setHeight(7.0);
      Assert.assertEquals(h.getHeight(), 7.0, 0);
   }
   
   /** Tests the base perimeter. **/
   @Test public void basePerimiterTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.basePerimeter(), 24.0, 0);
   }
   
   /** Tests the base area. **/
   @Test public void baseAreaTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.baseArea(), 41.0, 1);
   }
   
   /** Tests the surface area. **/
   @Test public void surfaceAreaTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.surfaceArea(), 227.0, 1);
   }
   
   /** Tests the volume. **/
   @Test public void volumeTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.volume(), 249.0, 1);
   }
   
   /** Tests the toString. **/
   @Test public void toStringTest()
   {
      boolean hasExp = false;
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      if (h.toString().contains("Wide Example")
         && h.toString().contains("hexagonal prism")
         && h.toString().contains("base perimeter")
         && h.toString().contains("and volume"))
      {
         hasExp = true;
      }
      Assert.assertTrue(hasExp);
   }
   
   /** Tests the reset count and get count. **/
   @Test public void getCountTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      h.resetCount();
      Assert.assertEquals(h.getCount(), 0, 0);
   }
   
   /** Tests that the ewuals method returns true. **/
   @Test public void equalsTestTrue()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertTrue(h.equals(h));
   }
   
   /** Tests that the equals method returns false. **/
   @Test public void equalsTestFalse()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertFalse(h.equals(this));
   }
   
   /** Tests the hashcode. **/
   @Test public void hashCodeTest()
   {
      HexagonalPrism h = new HexagonalPrism("Wide Example", 4.0, 6.0);
      Assert.assertEquals(h.hashCode(), 0, 0);
   }
   
   
   
   
   

   
   
   




}
