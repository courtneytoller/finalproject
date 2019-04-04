package cit260final;

import java.util.ArrayList;
import java.util.Scanner;
import cit260final.Mattress;

public class MattressDatabase {
	private static ArrayList<Mattress> readMattresses() {
      
        private static final String FILEPATH = "mattress.txt";
       // private static ArrayList<Mattress> mattress = null;
        
        ArrayList<Mattress> mattress = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(FILEPATH)) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
        
                try {
                Mattress newMattress = new Mattress();
                mattress.setprice(fields[2]);
                mattress.setPosition(fields[1]));
                } catch (NumberFormatException ex) {
                    continue;
                }
                //...
                
                mattress.add(mattress);
            }
        }
        
    }
}
