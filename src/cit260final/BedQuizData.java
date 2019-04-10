package cit260final;

import java.util.ArrayList;

public abstract class BedQuizData {
	
	//if statements for price points for user input
	ArrayList<Mattress> bed = new ArrayList<Mattress>();
	//new object for Mattress that calls user input
	//pass user input into each method to test
	//filter through mattresses
	
	public BedQuizData() {
		
	}
	
    public static ArrayList<Mattress> filterByPrice(ArrayList<Mattress> bed, double price){
    	//takes in ArrayList and filters by price  of mattress that the user specifies.
    	return null;
    }

    public static ArrayList<Mattress> filterByFirmness(ArrayList<Mattress> bed, int firmness){
    	//takes in ArrayList and filters by firmness of mattress that the user specifies.
    	return null;
    }
    
    public static ArrayList<Mattress> filterByPosition(ArrayList<Mattress> bed, String position){
       	//takes in ArrayList and filters by position of mattress that the user specifies.
    	return null;
       }
    
    public static String printMattressData(ArrayList<Mattress> bed) {
        //this will return found mattresses and bring in the three recommended mattresses. this will print
    	//to file so user can have record of results.
    	return null;
        }
    
    public static String testResults() {
    	//Take the filtered results and hold the top 3 for display to the user
    	return null;
    }
}
