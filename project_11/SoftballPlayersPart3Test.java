import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the SoftaballPlayersPart3 class. **/
public class SoftballPlayersPart3Test 
{
  /** 
   * Tests the main method for no command line argument.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void mainTest() 
   {
      SoftballPlayersPart3 app = new SoftballPlayersPart3();
      String[] args2 = {"softball_player_data3d.csv"};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart3.main(args2); 
      Assert.assertEquals(1, SoftballTeam.getTeamCount());
   }
   
  /** 
   * Tests the main method for a command line argument.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void main2Test() 
   {
      SoftballPlayersPart3 app = new SoftballPlayersPart3();
      String[] args2 = {"softball_player_data3c.csv"};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart3.main(args2); 
      Assert.assertEquals(1, SoftballTeam.getTeamCount());
   }
}
