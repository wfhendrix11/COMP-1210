import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Tests the SoftaballPlayersPart2 class. **/
public class SoftballPlayersPart2Test 
{
   /** 
   * Tests the main method for no command line argument.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void mainTest() throws IOException
   {
      String[] args1 = {};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart2.main(args1); 
      Assert.assertEquals(0, SoftballTeam.getTeamCount());
   }
   
   /** 
   * Tests the main method for a command line argument.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void main2Test() throws IOException
   {
      SoftballPlayersPart2 app = new SoftballPlayersPart2();
      String[] args2 = {"softball_player_data.csv"};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart2.main(args2); 
      Assert.assertEquals(1, SoftballTeam.getTeamCount());
   }
}
