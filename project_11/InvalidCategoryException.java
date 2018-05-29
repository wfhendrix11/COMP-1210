/**
 * This program creates a SoftballTeam array and loads it with 
 * SoftballPlayer objects by reading an excel file.     
 *    
 * Project 11.
 *
 * @author William Hendrix - section 003
 * @version 4/17/16
 */
public class InvalidCategoryException extends Exception 
{
  /** 
   * Creates a new SoftballTeam with a given number, name, position, 
   * specialization factor, and batting average.
   *
   * @param category for type.  
   */   
   public InvalidCategoryException(String category)
   {
      super("For category: " + "\"" + category + "\"");   
   }
}
      