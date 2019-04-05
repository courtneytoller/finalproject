package cit260final;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

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
            	// store mattress data to be used for other methods in program.
            	
            } catch (FileNotFoundException exception) {
                System.err.println("Could not find file path");
                
            } 
            
        }

        /**
         * Load the bed file back into the program. 
         * @return
         */
        public static void loadBed() {
            
            File textFile = new File(FILEPATH);
            bed = new ArrayList<>();
            
            try (Scanner scanner = new Scanner(textFile)) {
                //load mattress data from the file 
                scanner.useDelimiter(Pattern.compile(","));
                
            } catch (FileNotFoundException exception) {
                System.err.println("Could not find file path");
                
            } 
            
        }
        
	}
	

