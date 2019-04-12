package cit260final;

import java.util.ArrayList;
import java.util.Scanner;
import cit260final.Mattress;
import java.io.*;
//methods for get type for bed in a box and traditional

public class MattressDatabase {

	protected static final String FILEPATH = "mattress.txt";
	private static ArrayList<Mattress> mattressList = null;

	/**
	 * Return the bed database array, loading it from a file, if necessary.
	 * 
	 * @return
	 */
	synchronized public static ArrayList<Mattress> getBed() {

		if (mattressList == null) {
			loadBed();
		}

		return mattressList;
	}

	/**
	 * Write the list of mattresses out to a file.
	 * 
	 * @param mattressList
	 */
	public static void storeBed() {

		File textFile = new File(FILEPATH);

		try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {

		} catch (FileNotFoundException exception) {
			System.err.println("Could not find file path");

		}

	}

	/**
	 * Load the mattress file back into the program.
	 * 
	 * @return
	 */
	public static void loadBed() {

		File textFile = new File(FILEPATH);
		mattressList = new ArrayList<Mattress>();

		try (Scanner scanner = new Scanner(textFile)) {
			// load mattress data from the file
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] fields = line.split(",");

				// parameters for arrayList
				Mattress mattress = new Mattress();
				mattress.setRank(Integer.parseInt(fields[0].trim()));
				mattress.setBrand(fields[1].trim());
				mattress.setRating(Integer.parseInt(fields[2].trim()));
				mattress.setPrice(Double.parseDouble(fields[3].trim()));
				mattress.setPosition(fields[4].trim());
				mattress.setDurability(fields[5].trim());
				mattress.setStabilization(fields[6].trim());
				mattress.setFirmness(Integer.parseInt(fields[7].trim()));
				mattress.setType(fields[8].trim());

				mattressList.add(mattress);
			}

		} catch (FileNotFoundException exception) {
			System.err.println("Could not find file path");

		}

	}

}
