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
                new MenuItem('4', "Take the Quiz"),
                new MenuItem('R', "Return")
        };
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
                printMattress("All");
                break;
            case '2':
                printMattress("BedInBox");
               
                break;
            case '3':
                printMattress("TraditionalMattress");
                break;
            case '4':Menu mattressSearchMenu = new MattressSearchMenu();
                mattressSearchMenu.display();
            case 'R':
                return false;// return back to main menu 
                
            default:
                System.out.println("Invalid Entry");// prompt user when input is not valid
            
        }
        
        return true;
    }


    /**
     *   this will bring in the the top 25 mattress list for the user to view
     * @param database
     * @return
     */
    public static ArrayList <Mattress> printMattress(String mattressType) {
    	
    		return MattressDatabase.getBed(mattressType);
    	
    }
  
    /**
     * displays all bed in a box mattresses
     * @param database
     * @param typeToFind
     * @return
     */
   public static ArrayList<Mattress> printBiab(ArrayList<Mattress> bed, String typeToFind) {
	   ArrayList<Mattress> foundMattress = new ArrayList<>();
    			for(Mattress m: bed) {
    				if (m.getType().contentEquals(typeToFind)) {
    					foundMattress.add(m);
    				}
    				
    			}
    			return foundMattress;
    }
   

    /**
     * displays all traditional mattresses.
     * @param database
     * @param typeToFind
     * @return
     */
   /* public static String printTraditional(ArrayList<Mattress> bed, String typeToFind) {
    	
    }*/
}