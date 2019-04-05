package cit260final;
import java.util.Scanner;

public class MainMenu extends Menu {
    
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
                handleFinance();
                break;
                
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }
    
 
    /**
     * calculateFinance calculates monthly payment for mattress base
     * payment based on 1(5%), 3(3%), or 5(2%) years
     * userInput class we will pull price, amount of years, and any cash down
     * method will return payment and display for user
     * calculation code adapted from CodeAcademy;
     * @param price
     * @param years
     * @param cashDown
     * @return
     */
    private static double calculateFinance(double price, int years, double cashDown) {
    	//do finance calculations copy and paste from previous assignment loan payment :)
    	double interestRate=0;
    	double remainingBalance= price - cashDown;
    	int months= years * 12;
    	double monthlyBalance= remainingBalance / months;
    	double monthlyPayment= monthlyBalance + interestRate;
    	
    	if(years ==1) {
    		interestRate=.05;
    	}
    	else if(years==3) {
    		interestRate=.03;
    	}else if(years == 5) {
    		interestRate=.01;
    		
    	}else {
    		System.out.print("Please enter 1, 3, 5 years.");
    	}

    return monthlyPayment;
}
   /**
     * handleFinance will prompt user for amount of the bed. 
     * user will enter 1, 3, or 5 years to finance and amount of
     * cash down. Return result of calculate finance.
     */
    private void handleFinance() {
    
        try(Scanner input= new Scanner(System.in)){
        System.out.print("Please Enter Mattress Price:");
        
        double price = input.nextDouble();
        
        System.out.print("Would you like to finance for 1, 3 or 5 years?");
        int years = input.nextInt();
        
        //for loop to check for valid input 1, 3, 5
        System.out.print("How much money would you like to put down?");
        double cashDown = input.nextDouble();
        
        // mismatch handling here.
        double result = calculateFinance(price, years, cashDown);
        System.out.print("Your Monthly Payment is: " + result);
        }
        
    }
        
}