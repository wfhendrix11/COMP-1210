import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Tests the SoftballTeam class. **/
public class SoftballTeamTest 
{
   /** Tests the get/set TeamName method. **/
   @Test public void teamNameTest()
   {
      SoftballTeam st = new SoftballTeam();
      st.setTeamName("my team");
      Assert.assertEquals("my team", st.getTeamName());
   }
   
   /** Tests the get/set roster method. **/
   @Test public void rosterTest()
   {
      SoftballTeam sr = new SoftballTeam();
      SoftballPlayer[] st = new SoftballPlayer[10];
      sr.setRoster(st);
      Assert.assertTrue(st.equals(sr.getRoster()));
   }
   
   /** Tests the get/set playerCount method. **/
   @Test public void playerCountTest()
   {
      SoftballTeam st = new SoftballTeam();
      st.setPlayerCount(23);
      Assert.assertEquals(23, st.getPlayerCount(), 0);
   }
   
   /** Tests the get/set excludedRecords method. **/
   @Test public void excludedRecordsTest()
   {
      SoftballTeam st = new SoftballTeam();
      String[] excludedRecords = new String[30];
      excludedRecords[0] = "*** invalid category *** H,24," 
               + "Nola Austin,LHP,2.0,0.225,4,12,1.2";
      st.setExcludedRecords(excludedRecords);
      Assert.assertTrue(excludedRecords.equals(st.getExcludedRecords()));
   }

   /** Tests the get/set excludedCount method. **/
   @Test public void excludedCountTest()
   {
      SoftballTeam st = new SoftballTeam();
      String[] excludedRecords = new String[30];
      st.setExcludedCount(12);
      Assert.assertEquals(12, st.getExcludedCount(), 0);
   }
   
   /** Tests the get/reset teamCount method. **/
   @Test public void teamCountTest()
   {
      SoftballTeam st = new SoftballTeam();
      st.resetTeamCount();
      Assert.assertEquals(0, st.getTeamCount(), 0);
   }
   
  /** 
   * Tests the readPlayerFile method.
   *
   * @throws IOException from scanning input file.
   **/   
   @Test public void readPlayerFileTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");  
   }
   
   /** 
   * Tests the generateReportTest method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void generateReportTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateReport();

      boolean r = result.contains("21 Jodi Doe (RF) .305")  
            && result.contains("Specialization Factor: 1.0"
               + " (class Outfielder) Rating: 2.989");
      Assert.assertTrue(r);  
   }
   
   /** 
   * Tests the generateReportByNumber method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void generateReportByNumberTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateReportByNumber();

      boolean r = result.contains("12 Poppi Ledet")  
            && result.contains("20 Daisy Doalot");
      Assert.assertTrue(r);  
   }
   
   /** 
   * Tests the generateReportByRating method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void generateReportByRatingTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateReportByRating();

      boolean r = result.contains("3.28 22 Matty Ott")  
            && result.contains("20 Daisy Doalot");
      Assert.assertTrue(r);  
   }
   
   /** 
   * Tests the generateExcludedRecordsReport method.
   *
   * @throws IOException from scanning input file.
   **/
   @Test public void generateExcludedRecordsReportTest() throws IOException
   {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data2.csv");
      String result = st.generateExcludedRecordsReport();

      boolean r = result.contains("*** invalid category *** H,24,"
                     + "Nola Austin,LHP,2.0,0.225,4,12,1.2")  
            && result.contains("Maximum player count of 24 exceeded for:"
               + " R,35,Bruce Wayne,LHP,2.0,0.175,15,1,2.3,4");
      Assert.assertTrue(r);  
   }
   
   
   
   



   


}
