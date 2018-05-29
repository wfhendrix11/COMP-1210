import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Tests the SoftballPlayer class. **/
public class SoftballPlayersPart1Test 
{
   /** Tests the getCount and resetCount methods. **/
   @Test public void resetCountTest() 
   {
      SoftballPlayer.resetCount(); 
      SoftballPlayersPart1.main(null);
      Assert.assertEquals("Player.count should be 4. ",
                            4, SoftballPlayer.getCount());
   }
}
