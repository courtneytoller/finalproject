package cit260final;
import java.util.Scanner;

import java.util.ArrayList;
import cit260final.BedQuizData;
public class MattressSearchMenu extends Menu {
   
    /**
     * Provide the menu title (or null to skip it)
     * @return
     */
    @Override
    protected String getTitle() {
        return "MATTRESS SEARCH MENU";
    }
    
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "Take the Mattress Quiz Here";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Take the Bed Quiz"),
                new MenuItem('2', "Mattress Menu"),
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
            case '1':handleQuizOptions();
            case '2':Menu mattressMenu = new MattressMenu();
            mattressMenu.display();
                return false;// return back to main menu 
                
            default:
                System.out.println("Invalid Entry");// prompt user when input is not valid
            
        }
        
        return true;
    }
    // try with catch statements to close out scanner
    private void handleQuizOptions() {
    	Scanner input= new Scanner(System.in);
    
    	//Prompt user for price
    	System.out.print("What is your price range? \n 1= $500-$699, \n 2=$700-$900, \n 3=$900+");
    	double filterByPrice=input.nextDouble();
    	while (filterByPrice != 1 && filterByPrice != 2 && filterByPrice != 3) {
			System.err.println("Please enter price options of 1, 2, or 3 only");
			System.out.println("");
			System.out.println("Please re-enterprice options: ");
			filterByPrice = input.nextDouble();
			

		}	
    	//Prompt for firmness from 1-5 soft, medium, hard
    	System.out.print("What is your firmness preference? 1=soft, 2=medium, 3=hard ");
    	int filterByFirmness=input.nextInt();
    	while (filterByFirmness != 1 && filterByFirmness != 2 && filterByFirmness != 3) {
			System.err.println("Please enter firmness preference of 1, 2, or 3 only");
			System.out.println("");
			System.out.println("Please re-enter firmness preference options: ");
			filterByFirmness = input.nextInt();
		}	
    	//prompt for position back or side
    	//IS THIS GOING TO WORK WITH THE STRING TO INT CONVERSION?
    	System.out.print("What is your preferred sleeping position? back, bide");
    	String filterByPosition= input.next();
    	
    	while (filterByPosition != "back" && filterByPosition != "side") {
			System.err.println("Please enter postition option of back or side only");
			System.out.println("");
			System.out.println("Please re-enter position preference: ");
			filterByPosition= input.next();
		}	
    	//Mattress mattress = new Mattress(price, firmness, position);
    	
       	
    
       	//Option to print list of 25 mattresses
       	//Output top 3 mattresses String
//exception handling
    }
  private String processQuizOptions(double filterByPrice, int filterByFirmness, String filterByPostion) {
	  // filter user input to arrays that will find
	  
	  return BedQuizData.testResults();
  }
  
}