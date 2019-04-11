package cit260final;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public abstract class BedQuizData extends MattressDatabase{
	
	ArrayList<Mattress> mattresses = new ArrayList<Mattress>();
	
	public BedQuizData() {
		
	}

	
	
	
    public static ArrayList<Mattress> filterByPrice(ArrayList<Mattress> mattresses, double maxPrice){
    	//takes in ArrayList and filters by price  of mattress that the user specifies.
    	ArrayList<Mattress> matchMattress = new ArrayList<>();
    	for(Mattress m: mattresses) {
    		if(m.getPrice() <= maxPrice) {
    			matchMattress.add(m);
    		}    		
    	}
    	return matchMattress;
    }

    public static ArrayList<Mattress> filterByFirmness(ArrayList<Mattress> mattresses, int maxFirmness){
    	//takes in ArrayList and filters by firmness of mattress that the user specifies.
    	ArrayList<Mattress> matchMattress = new ArrayList<>();
    	for(Mattress m: mattresses) {
    		if(m.getFirmness() <= maxFirmness) {
    			matchMattress.add(m);
    		}    		
    	}
    	return matchMattress;
    }

    public static ArrayList<Mattress> filterByPosition(ArrayList<Mattress> mattresses, String maxPosition){
    	ArrayList<Mattress> matchMattress = new ArrayList<>();
    	for(Mattress m: mattresses) {
    		if(m.getPosition().equals(maxPosition)) {
    			matchMattress.add(m);
    		}    		
    	}
    	return matchMattress;
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
