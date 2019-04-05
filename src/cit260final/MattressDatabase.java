package cit260final;

import java.util.ArrayList;
import java.util.Scanner;
import cit260final.Mattress;
import java.io.*;
//methods for get type for bed in a box and traditional

public class MattressDatabase {
      
        private static final String FILEPATH = "mattress.txt";
        private static ArrayList<Mattress> bed = null;
        
        /**
         * Return the bed database array, loading it from a file, if necessary.
         * @return
         */
        synchronized public static ArrayList<Mattress> getBed() {
            
            if (bed == null) {
                loadBed();
            }
            
            return bed;
        }
       // our method for cycling through user input to find bed will go here
        // 
        /**
         * Write the list of mattresses out to a file.
         * @param bed
         */
        public static void storeBed() {
            
            File textFile = new File(FILEPATH);
            
            try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {
                
                
                for (Mattress mattress : bed) {
                    out.printf("Type: %s%n", mattress.getClass().getSimpleName());
                    
                    if (mattress instanceof WingedAnimal) {
                        out.printf("Name: %s%n", mattress.getName());
                   
                        
                    } else if (mattress instanceof Dog) {
                        Dog dog = (Dog)mattress;
                        out.printf("Name: %s%n", mattress.getName());
                        out.printf("FavoriteToy: %s%n", dog.getFavoriteToy());
                        
                    }
                }
               
            
            } catch (FileNotFoundException exception) {
                System.err.println("Could not find file path");
                
            } 
            
        }

        /**
         * Load a bed.
         * @return
         */
        public static void loadBed() {
            
            File textFile = new File(FILEPATH);
            zoo = new ArrayList<>();
            
            try (Scanner scanner = new Scanner(textFile)) {
                
                scanner.useDelimiter(Pattern.compile("[:\\n]"));
                
                while (scanner.hasNext()) {
                    String key = scanner.next();
                    String value = scanner.next().trim();
                    
                    Animal animal = null;
                    
                    if (key.equals("Type")) {
                        
                        switch(value) {
                            case "Dog":
                                animal = readDog(scanner);
                                break;
                            case "Bat":
                                animal = readBat(scanner);
                                break;
                            case "Canary":
                                animal = readCanary(scanner);
                                break;
                            case "Ostrich":
                                animal = readOstrich(scanner);
                                break;
                            default:
                                break;
                        }
                    }
                    
                    if (animal != null) {
                        zoo.add(animal);
                    }
                }
            } catch (FileNotFoundException exception) {
                System.err.println("Could not find file path");
                
            } 
            
        }
        
	}
	
}
