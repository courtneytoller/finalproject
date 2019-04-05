package cit260final;
import java.util.Scanner;
import java.util.ArrayList;

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
                new MenuItem('1', "Top 25 Mattresses"),
                new MenuItem('2', "Bed-in-a-Box options"),
                new MenuItem('3', "Traditional Mattress Options"),
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
                System.out.println("Top 25 Mattresses");//display all mattresses add in loop to search through text file
                break;
            case '2':
                System.out.println("Bed In A Box");//display BIAB add in loop to search through text file
                break;
            case '3':
                System.out.println("Traditional");// display traditional add in loop to search through text file
                break;
                
            case 'R':
                return false;// return back to main menu 
                
            default:
                System.out.println("Invalid Entry");// prompt user when input is not valid
            
        }
        
        return true;
    }
    
   	//Prompt user for price
   	
   	//Prompt for size(petite, average, tall)
   	//Prompt for position(back or side)
   	//Prompt for firmness from 1-5
   	//Ask user if they would like to finance
   	//User puts in price of bed they want to finance
   	//User selects number of years to finance
   	//Option to print list of 25 mattresses
   	
   	//Output top 3 mattresses
   	//Output monthly payment for bed price
   	
       private ArrayList<Mattress> readMattress(){
       /*	ArrayList<Mattress> mattress= new ArrayList<>();
       	  try (Scanner scanner = new Scanner(new File ("./mattress.txt"))) {
                 
                 while (scanner.hasNextLine()) {
                     String line = scanner.nextLine();
                     String[] fields = line.split(",");
             
                     try {
                     Mattress newMattress = new Mattress();
                     mattress.setBrand(fields[0]);
                     mattress.setRank(Integer.parseInt(fields[1]));
                     } catch (NumberFormatException ex) {
                         continue;
                     }
                     //...
                     
                     mattress.add(mattress);
                 }
             }*/
       }
       
       // reading in file for each mattress array
       public static ArrayList<Mattress> filterByPrice(ArrayList<Mattress> database, double price){
       	//takes in ArrayList and filters by price  of mattress that the user specifies.
       	
       }
       public static ArrayList<Mattress> filterByPosition(ArrayList<Mattress> database, String position){
       	//takes in ArrayList and filters by position of mattress that the user specifies.
       }
       public static ArrayList<Mattress> filterBySize(ArrayList<Mattress> database, String size){
       	//takes in ArrayList and filters by size of mattress that the user specifies.
       }
       public static ArrayList<Mattress> filterByFirmness(ArrayList<Mattress> database, int firmness){
       	//takes in ArrayList and filters by firmness of mattress that the user specifies.
       }
      
       public static String printMattressData(ArrayList<Mattress> database) {
           //this will return found mattresses and bring in the three recommended mattresses. this will print
       	//to file so user can have record of results.
           }
       
       public String testResults() {
       	//Take the filtered results and hold the top 3 for display to the user
       }
}