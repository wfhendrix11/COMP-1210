import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Tests the NameComparator class. **/
public class NameComparatorTest 
{
  /** 
   * Tests the generateReportByName method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void nameComparatorTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateReportByName();

      boolean r = result.substring(121, 134).equals("18 Buddy Bell")
               && result.substring(865, 887).equals("14 Sruthi Yalamanchili"); 
      Assert.assertTrue(r);
   }
}
