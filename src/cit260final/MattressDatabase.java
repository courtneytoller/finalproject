package cit260final;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import cit260final.Mattress;
import java.io.*;
//methods for get type for bed in a box and traditional

public class MattressDatabase {
      
        protected static final String FILEPATH = "mattress.txt";
        private static ArrayList<Mattress> bed = null;
        
        /**
         * Return the bed database array, loading it from a file, if necessary.
         * @return
         */
        synchronized public static ArrayList<Mattress> getBed(String mattressType) {
            
            if (bed == null) {
                loadBed(mattressType);
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
        public static void loadBed(String mattressType) {
            
            File textFile = new File(FILEPATH);
            boolean traditionalList = true;
            
            try (Scanner scanner = new Scanner(textFile)) {
                //load mattress data from the file 
             while(scanner.hasNextLine()) {
            	 String line = scanner.nextLine();
            	 //String[] fields=line.split(",");
            	 
            	 try {
            	 Mattress newMattress = new Mattress();
            	 newMattress.setType(line);
            	 
            	 if (mattressType == "All") {
            	 System.out.println(newMattress.getType());
            	 }
            	 
            	 else if (mattressType == "TraditionalMattress") {             		 
            		 if(line.contains("Traditional") && traditionalList == true)
            		 System.out.println(newMattress.getType());     
            	 }
            	 	
            	 else if(mattressType == "BedInBox") {            		 
            		 if(line.contains("Bed-In-A-Box") && traditionalList == true)
            		 System.out.println(newMattress.getType());
            	 	}
            	 
            	 else if (mattressType == "Quiz") {
            		 while(scanner.hasNextLine()) {
            			 String userInput = scanner.nextLine();
            			 String[] fields = userInput.split(",");
            			 try {Mattress mattressQuiz = new Mattress();
            			 	
            			 mattressQuiz.setPrice(Double.parseDouble(fields[3]));
            			 mattressQuiz.setPosition(fields[4]);
            			 mattressQuiz.setFirmness(Integer.parseInt(fields[7]));
            			 System.out.println(fields[4] + fields[3]+ fields[7]);	
            				 
            				 
            			 }
            			 catch(NumberFormatException ex) {
            				 continue;
            			 }
            			 
            			 
            		 }
            		 
            	 } 
            	 }
            	 catch (NumberFormatException ex) {
            		 continue;
            	 }
            	 
               }
                
            } catch (FileNotFoundException exception) {
                System.err.println("Could not find file path");
                
            }
            
        }
        
	}
	
        

