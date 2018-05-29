import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Tests the RatingComparator class. **/
public class RatingComparatorTest 
{
   /** 
   * Tests the ratingComparator method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void ratingComparatorTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateReportByRating();
      String b = result.substring(131, 140);
      String c = result.substring(974, 985);

      boolean r = result.substring(131, 141).equals("Nina Dobbs")
               && result.substring(974, 985).equals("Erin Noland"); 
      Assert.assertTrue(r);
   }
}
