import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the Infielder class. **/
public class InfielderTest {

   /** Tests the getInfielderFieldingAvg method. **/
   @Test public void getInfielderFieldingAvgTest()
   {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 1.25, 
                                    .275, .850);      
      Assert.assertEquals(.850, p2.getInfielderFieldingAvg(), 0);
   }
   
   /** Tests the setInfielderFieldingAvg method. **/
   @Test public void setInfielderFieldingAvgTest()
   {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 1.25, 
                                       .275, .850);      
      p2.setInfielderFieldingAvg(.800);
      Assert.assertEquals(.800, p2.getInfielderFieldingAvg(), 0);
   }
   
   /** Tests the rating method. **/
   @Test public void ratingTest()
   {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 1.25,
                                     .275, .850);
      Assert.assertEquals(2.922, p2.rating(), .01);
   }
}
