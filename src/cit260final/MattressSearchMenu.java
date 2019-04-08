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
            case '1': //handleQuizOption();
            case '2':Menu mattressMenu = new MattressMenu();
            mattressMenu.display();
                return false;// return back to main menu 
                
            default:
                System.out.println("Invalid Entry");// prompt user when input is not valid
            
        }
        
        return true;
    }
    
    private void handleQuizOptions() {
    	//Prompt user for price
    	
       	//Prompt for firmness from 1-5
    	//prompt for position
       	//Option to print list of 25 mattresses
       	//Output top 3 mattresses String

    }
  private String processQuizOptions(double price, int firmness, String position) {
	  // filter user input to arrays that will find
	  return BedQuizData.testResults();
  }
     
}