package cit260final;
import java.util.ArrayList;

public class MattressMenu extends Menu {
   
    /**
     * Default constructor. Does nothing.
     */
    public MattressMenu() {
        super();
    }
    
    /**
     * Provide the menu title (or null to skip it)
     * @return
     */
    @Override
    protected String getTitle() {
        return "MATTRESS MENU";
    }
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "Get Mattress List Here";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Top 25 Mattresses"),
                new MenuItem('2', "Bed-in-a-Box options"),
                new MenuItem('3', "Traditional Mattress Options"),
                new MenuItem('R', "Return")
        };
    }
  
    /**
     * this will filter that data file by mattress type.
     * @param database
     * @param typeToFind
     * @return
     */
    public static ArrayList<Mattress> filterByType(ArrayList<Mattress> database, String typeToFind){
    	
    
    }
    
    /**
     *   this will bring in the the top 25 mattress list for the user to view
     * @param database
     * @return
     */
    public static String printMattressData(ArrayList<Mattress> database) {
  
    }
    /**
     * displays all bed in a box mattresses
     * @param database
     * @param typeToFind
     * @return
     */
    public static String displayBedInABox(ArrayList<Mattress> database, String typeToFind) {
    	
    }
    /**
     * displays all traditional mattresses.
     * @param database
     * @param typeToFind
     * @return
     */
    public static String displayTraditional(ArrayList<Mattress> database, String typeToFind) {
    	
    }
  
    /**
     * Handle the user's menu selection.
     * @param key
     * @return false if the menu should exit and return to whatever called it.
     */
    @Override
    protected boolean handleMenuSelection(char key) {
        
        switch (Character.toUpperCase(key)) {
            case '1': 
                System.out.println("Top 25 Mattresses");//display all mattresses add in loop to search through text file
                break;
            case '2':
                System.out.println("Help Text 2");//display BIAB add in loop to search through text file
                break;
            case '3':
                System.out.println("Help Text 3");// display traditional add in loop to search through text file
                break;
                
            case 'R':
                return false;// return back to main menu 
                
            default:
                System.out.println("Invalid Entry");// prompt user when input is not valid
            
        }
        
        return true;
    }

}