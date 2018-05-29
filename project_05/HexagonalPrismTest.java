import java.util.ArrayList;

public class HexagonalPrismTest
{
   public static void main(String[] args)
   {
      ArrayList<HexagonalPrism> list = new ArrayList<HexagonalPrism>(); 
      
      list.add(new HexagonalPrism("Short Example", 4.0, 6.0));
      list.add(new HexagonalPrism("Wide Example", 22.1, 10.6));
      //list.add(new HexagonalPrism("Tall Example", 10.0, 200.0));
      //list.add(new HexagonalPrism("Really Large Example", 300.0, 400.0));
      
      int index = 0;
      while (index < list.size()) {
      HexagonalPrism hex = list.get(index);

      System.out.println(hex.getLabel());
      //System.out.println(list.numberOfHexagonalPrisms());
      //System.out.println(num.totalSurfaceArea());
      //System.out.println(num.totalVolume());
      //System.out.println(num.totalBasePerimeter());
      //System.out.println(num.totalBaseArea());
      //System.out.println(num.averageSurfaceArea());
      //System.out.println(num.averageVolume());
      System.out.println(hex.toString());
      //System.out.println(num.summaryInfo());
      
      index++;
      }  
   
   
   
   }
}