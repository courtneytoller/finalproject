package cit260final;

public class MainMenu extends Menu {
    private double years;
    private double cashDown;
    
    /**
     * Default constructor. Does nothing.
     */
    public MainMenu() {
        super();
    }

       /**
     * Provide the menu title (or null to skip it)
     * @return
     */
    @Override
    protected String getTitle() {
        return "MAIN MENU";
    }
    
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "Welcome to the main menu of the program.";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Mattress Menu"),
                new MenuItem('2', "Find the Best Mattress for You"),
                new MenuItem('F', "Financial"),
                new MenuItem('Q', "Quit Program")
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
            	Menu mattressMenu = new MattressMenu();
                mattressMenu.display();
                break;
            case '2':
            	Menu mattressSearchMenu = new MattressSearchMenu();
                mattressSearchMenu.display();
                break;
            case 'F':
                // financial menu or method;
                break;
                
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }
    
    /**
     * getters and setters for years, cashDown
     * @return
     */
    public double getYears() {
    	return years;
    }
    
    public void setYears(double years) {
    	this.years = years;
    }
    
    public double getCashDown() {
    	return cashDown;
    }
    
    public void setCashDown(double cashDown) {
    	this.cashDown = cashDown;
    }
    /**
     * handleFinance calculates monthly payment for mattress base
     * payment based on 1(5%), 3(3%), or 5(2%) years
     * userInput class we will pull price, amount of years, and any cash down
     * method will return payment and display for user
     * @param price
     * @param years
     * @param cashDown
     * @return
     */
    private double handleFinance(double price, double years, double cashDown) {
    
    	
    	
    }
}