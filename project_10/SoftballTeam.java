import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
 * This program creates an array of SoftballPlayer objects and has
 * the methods get/set teamName, get/set roster, get/set playerCount,
 * get/set excluded records, get/set excluded count, get/reset teamCount, 
 * readPlayerFile, generateReport, generateReportByNumber, 
 * generateReportByName,generateReportByRating, and 
 * generateExcludedRecordsReport.  
 *    
 * Project 10.
 *
 * @author William Hendrix - section 003
 * @version 4/17/16
 */
public class SoftballTeam
{
   private String teamName;
   private SoftballPlayer[] roster = new SoftballPlayer[24];
   private int playerCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int teamCount;
   /** Max players is 24. **/
   public static final int MAX_PLAYERS = 24;
   /** Max players is 24. **/
   public static final int MAX_EXCLUDED = 30;
   
  /** 
   * Creates a new SoftballTeam with a given number, name, position, 
   * specialization factor, and batting average. 
   */
   public SoftballTeam()
   {
      teamName = "No name";
      playerCount = 0;
      excludedCount = 0;
      teamCount++;
   }
   
  /**
   * Returns the name of the SoftballTeam object.
   *  
   * @return teamName. 
   */
   public String getTeamName()
   {
      return teamName;
   }
   
  /** 
   * Sets the name of the Softballteam object.
   * 
   * @param teamNameIn for name. 
   */ 
   public void setTeamName(String teamNameIn)
   {
      teamName = teamNameIn;
   }
   
  /**
   * Returns the SoftballPlayer array representing roster.
   *  
   * @return roster. 
   */
   public SoftballPlayer[] getRoster()
   {
      return roster;
   }
   
  /** 
   * Sets the roster.
   * 
   * @param rosterIn for roster. 
   */
   public void setRoster(SoftballPlayer[] rosterIn)
   {
      roster = rosterIn;
   }
   
  /**
   * Returns the player count of the SoftballTeam object.
   *  
   * @return playerCount. 
   */
   public int getPlayerCount()
   {
      return playerCount;
   }
   
  /** 
   * Sets the playerCount.
   * 
   * @param playerCountIn for playerCount. 
   */
   public void setPlayerCount(int playerCountIn)
   {
      playerCount = playerCountIn;
   }
   
  /**
   * Returns the excluded records.
   *  
   * @return excludedRecords. 
   */
   public String[] getExcludedRecords()
   {
      return excludedRecords;
   }
   
  /**
   * Sets the excluded records.
   *  
   * @param excludedRecordsIn for excludedRecords. 
   */
   public void setExcludedRecords(String[] excludedRecordsIn)
   {
      excludedRecords = excludedRecordsIn;
   }
   
  /**
   * Returns the excluded count.
   *  
   * @return excludedCount. 
   */
   public int getExcludedCount()
   {
      return excludedCount;
   }
   
  /** 
   * Sets the excludedCount.
   * 
   * @param excludedCountIn for excludedCount. 
   */
   public void setExcludedCount(int excludedCountIn)
   {
      excludedCount = excludedCountIn;
   }
   
  /**
   * Returns the excluded team count.
   *  
   * @return teamCount. 
   */
   public static int getTeamCount()
   {
      return teamCount;
   }
   
  /** 
   * Sets the team count to zero. 
   */
   public static void resetTeamCount()
   {
      teamCount = 0;
   }
   
  /** 
   * Reads in SoftballPlayer objects from an excel file, then checks the 
   * type of objects and loads it into the correct object constructor. If
   * roster is full, then it is added to excludedPlayers, if both are full 
   * it is disregarded. 
   * 
   * @param fileName for fileName.
   * @throws IOException from scanning input file.  
   */
   public void readPlayerFile(String fileName) throws IOException
   {
      Scanner a = new Scanner(new File(fileName));
      teamName = a.nextLine();
      
      while (a.hasNext())
      {
         String line = a.nextLine();         
         Scanner s = new Scanner(line);
         s.useDelimiter(",");
         
         String type = s.next();
         String number = s.next();
         String name = s.next();
         String position = s.next();
         double specFactor = s.nextDouble();
         double battingAvg = Double.parseDouble(s.next());
         
         if (type.equals("O"))
         {
            double outFieldAvg = s.nextDouble();
            
            Outfielder p1 = new Outfielder(number, name, position, specFactor, 
                                             battingAvg, outFieldAvg);
            
            if (playerCount < MAX_PLAYERS)
            {
               roster[playerCount] = p1;
               playerCount++;
            }
            else
            {
               excludedRecords[excludedCount] = "Maximum player count"
                           + " of 24 exceeded for: " + line;
               excludedCount++;
            }     
         }
         else if (type.equals("I"))
         {
            double inFieldAvg = s.nextDouble();
            
            Infielder p2 = new Infielder(number, name, position, specFactor, 
                                          battingAvg, inFieldAvg);
            
            if (playerCount < MAX_PLAYERS)
            {
               roster[playerCount] = p2;
               playerCount++;
            }
            else
            {
               excludedRecords[excludedCount] = "Maximum player count"
                           + " of 24 exceeded for: " + line;
               excludedCount++;
            }
         }
         else if (type.equals("P"))
         {
            int wins = s.nextInt();
            int losses = s.nextInt();
            double era = s.nextDouble();
            
            Pitcher p3 = new Pitcher(number, name, position, specFactor, 
                     battingAvg, wins, losses, era);
            
            if (playerCount < MAX_PLAYERS)
            {
               roster[playerCount] = p3;
               playerCount++;
            }
            else
            {
               excludedRecords[excludedCount] = "Maximum player count"
                              + " of 24 exceeded for: " + line;
               excludedCount++;
            }
         }
         else if (type.equals("R"))
         {
            int wins = s.nextInt();
            int losses = s.nextInt();
            double era = s.nextDouble();
            int saves = s.nextInt();
            
            ReliefPitcher p4 = new ReliefPitcher(number, name, position, 
                     specFactor, battingAvg, wins, losses, era, saves);
            
            if (playerCount < MAX_PLAYERS)
            {
               roster[playerCount] = p4;
               playerCount++;
            }
            else
            {
               excludedRecords[excludedCount] = "Maximum player count"
                        + " of 24 exceeded for: " + line;
               excludedCount++;
            }
         }
         else 
         {
            excludedRecords[excludedCount] = "*** invalid category *** " + line;
            excludedCount++;
         }       
      }
   }
   
  /** 
   * Returns the toString output of each object in the roster
   * array.
   * 
   * @return result. 
   */   
   public String generateReport()
   {
      SoftballPlayer[] a = Arrays.copyOf(roster, playerCount);
      
      String result = "---------------------------------------\n"
                    + "Team Report for " + teamName + "\n"
                 + "---------------------------------------\n";                 
      int index = 0;
      while (index < playerCount) 
      {
         result += "\n" + a[index] + "\n"; 
         index++;  
      }   
      return result + "\n";
   }
   
  /** 
   * Returns the toString output of each object in the roster
   * array.
   * 
   * @return result. 
   */
   public String generateReportByNumber()
   {
      SoftballPlayer[] b = Arrays.copyOf(roster, playerCount); 
      Arrays.sort(b);
      
      String result = "---------------------------------------\n"
                    + "Team Report for " + teamName + " (by number)\n"
                    + "---------------------------------------";
      int index = 0;
      while (index < playerCount) 
      {
         result += "\n" + b[index].number + " " 
            + b[index].name + " " + b[index].stats(); 
         index++;  
      }
      return result + "\n" + "\n";
   }
   
  /** 
   * Returns the rating, number, name and stats all 
   * sorted from largest to smallest last name and then first. 
   * 
   * @return result. 
   */
   public String generateReportByName()
   {
      SoftballPlayer[] c = Arrays.copyOf(roster, playerCount);
      NameComparator nameComp = new NameComparator();
      Arrays.sort(c, nameComp);
      
      String result = "---------------------------------------\n"
                    + "Team Report for " + teamName + " (by name)\n"
                    + "---------------------------------------";
      int index = 0;
      while (index < playerCount) 
      {
         result += "\n" + c[index].number + " " 
               + c[index].name + " " 
               + c[index].stats(); 
         index++;  
      }
      return result + "\n" + "\n";
   }
   
  /** 
   * Returns the rating, number, name and stats all 
   * sorted from largest to smallest rating. 
   * 
   * @return result. 
   */
   public String generateReportByRating()
   {
      SoftballPlayer[] sp = Arrays.copyOf(roster, playerCount);
      RatingComparator ratingComp = new RatingComparator();
      Arrays.sort(sp, ratingComp);
      
      String result = "---------------------------------------\n"
                    + "Team Report for " + teamName + " (by rating)\n"
                    + "---------------------------------------";
      int index = 0;
      while (index < playerCount) 
      {
         DecimalFormat df = new DecimalFormat(".00");
      
         result += "\n" + df.format(sp[index].rating()) + " " 
              + sp[index].number + " " + sp[index].name + " " 
              + sp[index].stats(); 
         index++;  
      }
      return result + "\n" + "\n";
   }
   
  /** 
   * Returns the contents of the excludedRecords array. 
   * 
   * @return result. 
   */
   public String generateExcludedRecordsReport()
   {
      
      String result = "---------------------------------------\n"
                    + "Excluded Records Report\n"
                    + "---------------------------------------";
      int index = 0;
      while (index < excludedCount) 
      {
         result += "\n" + excludedRecords[index]; 
         index++;  
      }
      return result + "\n" + "\n";
   }       
}
   
            
      
      
      
   
   
   
   
   
   
         
      
