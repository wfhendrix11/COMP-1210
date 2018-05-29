import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Tests methods in HexagonalPrismList2 class. **/
public class HexagonalPrismList2Test {

   /** Tests the get name. **/
   @Test public void getNameTest() 
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      Assert.assertEquals(list.getName(), "name");
   }
   
   /** Tests the number of hexagonal prisms for a non-zero 
   * amount of arrays. **/
   @Test public void numberOfHexagonalPrismsTestNonZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      
      Assert.assertEquals(list.numberOfHexagonalPrisms(), 2, 0);  
   }
   
   /**Tests the number of hexagonal prisms for a non-zero 
   * amount of arrays. **/
   @Test public void numberOfHexagonalPrismsTestZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertEquals(list.numberOfHexagonalPrisms(), 0, 0);  
   }
   
   /**Tests the total surface area. **/
   @Test public void totalSurfaceAreaTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.totalSurfaceArea(), 859, 1);
   }

   /**Tests the total volume. **/   
   @Test public void totalVolumeTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.totalVolume(), 1395, 1);
   }
   
   /**Tests the total base perimeter. **/
   @Test public void totalBasePerimeterTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.totalBasePerimeter(), 66, 1);
   }
   
   /**Tests the total base area. **/
   @Test public void totalBaseAreaTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.totalBaseArea(), 168, 1);
   }
   
   /**Tests the average surface area for a non-zero number. **/
   @Test public void averageSurfaceAreaTestNonZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.averageSurfaceArea(), 429, 1);
   }
   
   /**Tests the average surface area for zero. **/
   @Test public void averageSurfaceAreaTestZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name",
                                           hpArray, 0);     
   
      Assert.assertEquals(list.averageSurfaceArea(), 0, 0);
   }
   
   /**Tests the average volume for a non-zero number. **/
   @Test public void averageVolumeNonZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);     
   
      Assert.assertEquals(list.averageVolume(), 697, 1);
   }
   
   /**Tests the average surface area for a zero. **/
   @Test public void averageVolumeZero()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name",
                                        hpArray, 0);     
   
      Assert.assertEquals(list.averageVolume(), 0, 0);
   }
   
   /** Tests the toString. **/
   @Test public void toStringTest()
   {
      boolean hasExp = false;
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      if (list.toString().contains("Wide Example")
         && list.toString().contains("hexagonal prism")
         && list.toString().contains("base perimeter")
         && list.toString().contains("and volume"))
      {
         hasExp = true;
      }
      Assert.assertTrue(hasExp);
   }
   
   /** Tests the summaryInfo. **/
   @Test public void summaryInfoTest()
   {
      boolean hasExp = false;
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      if (list.summaryInfo().contains("----- name Summary -----")
         && list.summaryInfo().contains("Number of Hexagonal Prisms: ")
         && list.summaryInfo().contains("Total Surface Area: ")
         && list.summaryInfo().contains("Total Base Perimeter: ")
         && list.summaryInfo().contains("Average Surface Area: "))
      {
         hasExp = true;
      }
      Assert.assertTrue(hasExp);
   }
   
   /**Tests the get list. **/
   @Test public void getListTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertSame(list.getList(), hpArray); 
   }
   
   /**Tests the read file method.
   * 
   * @throws IOException from scanning input file.
   */
   @Test public void readFileTest() throws IOException
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 22.1, 10.6);
      list.addHexagonalPrism("Tall Example", 10.0, 200.0);
      list.addHexagonalPrism("Really Large Example", 300, 400);
      
      String str = list.readFile("hexagonal_prism_1.dat").toString();
      String str2 = list.toString();

      Assert.assertTrue(str.equals(str2));
   }
   
   /**Tests the add hexagona prism. **/
   @Test public void addHexagonalPrismTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Tall Example", 10.0, 200.0);
      list.addHexagonalPrism("Really Large Example", 300, 400);  
      
      Assert.assertEquals(list.numberOfHexagonalPrisms(), 3);
   }
   
   /**Tests the delete hexagonal prism for a non null. **/
   @Test public void deleteHexagonalPrismTestNonNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      list.deleteHexagonalPrism("Short Example");
      
      Assert.assertEquals(list.numberOfHexagonalPrisms(), 2);
   }
   
   /**Tests the delete hexagonal prism. **/
   @Test public void deleteHexagonalPrismTestNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      list.deleteHexagonalPrism("Really Tall Example");
      
      Assert.assertEquals(list.deleteHexagonalPrism("Really Tall Example"),
                                                       null);
   }
   
   /** Tests the find hexagonal prism for a non null. **/
   @Test public void findHexagonalPrismTestNonNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      
      Assert.assertEquals(list.findHexagonalPrism("Wide Example"), hpArray[1]);
   }
   
   /** Tests the edit hexagonal prism. **/
   @Test public void editHexagonalPrismTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 4.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      list.editHexagonalPrism("Short Example", 15.0, 19.0);
      
      boolean result = false;
      if (hpArray[0].getSide() == 15.0 && hpArray[0].getHeight() == 19.0)
      {
         result = true;
      }
      
      Assert.assertTrue(result);
   }
   
   /** Tests the find hexagonal prism with the smallest side. **/
   @Test public void findHexagonalPrismWithSmallestSideTestNonNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 1.0, 6.0);
      list.addHexagonalPrism("Medium Example", 13.0, 9.0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestSide(), hpArray[1]);
   }
   
   /** Tests the find hexagonal prism with the smallest side. **/
   @Test public void findHexagonalPrismWithSmallestSideTestNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestSide(), null);
   }
   
   /** Tests the find hexagonal prism with the smallest side of null. **/
   @Test public void findHexagonalPrismWithLargestSideTest()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 1.0, 6.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      
      Assert.assertSame(list.findHexagonalPrismWithLargestSide(), hpArray[2]);
   }
   
   /** Tests the find hexagonal prism with the largest side of null. **/
   @Test public void findHexagonalPrismWithLargestSideTestNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestSide(), null);
   }
   
   /** Tests the find hexagonal prism with the smallest height. **/
   @Test public void findHexagonalPrismWithSmallestHeightTestNonNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 1.0, 5.0);
      list.addHexagonalPrism("Medium Example", 13.0, 9.0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestHeight(), 
                           hpArray[1]);
   }
   
   /** Tests the find hexagonal prism with the smallest height of null. **/
   @Test public void findHexagonalPrismWithSmallestHeightTestNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestHeight(), null);
   }
   
   /** Tests the find hexagonal prism with the largest height. **/
   @Test public void findHexagonalPrismWithLargestHeightTestNonNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      list.addHexagonalPrism("Short Example", 4.0, 6.0);
      list.addHexagonalPrism("Wide Example", 1.0, 13.0);
      list.addHexagonalPrism("Medium Example", 7.0, 9.0);
      
      Assert.assertSame(list.findHexagonalPrismWithLargestHeight(), hpArray[1]);
   }
   
   /** Tests the find hexagonal prism with the largest heightof null. **/
   @Test public void findHexagonalPrismWithLargestHeightTestNull()
   {
      HexagonalPrism[] hpArray = new HexagonalPrism[10];
      HexagonalPrismList2 list = new HexagonalPrismList2("name", hpArray, 0);
      
      Assert.assertSame(list.findHexagonalPrismWithSmallestHeight(), null);
   }
   
   
      
      
      
      
      
      
      

   
   
   
}
