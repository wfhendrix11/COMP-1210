import java.io.IOException;

/**
 * This program creates a SoftballTeam array and loads it with 
 * SoftballPlayer objects by reading an excel file.     
 *    
 * Project 10.
 *
 * @author William Hendrix - section 003
 * @version 4/17/16
 */
public class SoftballPlayersPart2
{
  /**
   * Creates a SoftballPlayer array and loads it with objects. If there
   * is not a command line argument, then the program ends.    
   * 
   * @param args - is not used.
   * @throws IOException from scanning input file.
   */
   public static void main(String[] args) throws IOException
   {
      if (args.length <= 0)
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else 
      {
         SoftballTeam s = new SoftballTeam();
         s.readPlayerFile(args[0]);
         
         System.out.print(s.generateReport());
         System.out.print(s.generateReportByNumber());
         System.out.print(s.generateReportByName());
         System.out.print(s.generateReportByRating());
         System.out.print(s.generateExcludedRecordsReport());
      }
   }
}
      
      
   