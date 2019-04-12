package cit260final;

import java.util.ArrayList;
import java.io.PrintStream;

public abstract class BedQuizData extends MattressDatabase {
	/**
	 * filters user input for prices that matches each mattress
	 * 
	 * @param mattresses
	 * @param maxPrice
	 * @return
	 */
	public static ArrayList<Mattress> filterByPrice(ArrayList<Mattress> mattresses, double maxPrice) {
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getPrice() <= maxPrice) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	/**
	 * filters user input for firmness that matches each mattress
	 * 
	 * @param mattresses
	 * @param maxFirmness
	 * @return
	 */
	public static ArrayList<Mattress> filterByFirmness(ArrayList<Mattress> mattresses, int maxFirmness) {
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getFirmness() <= maxFirmness) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	/**
	 * filters user input for position that matches each mattress
	 * 
	 * @param mattresses
	 * @param maxPosition
	 * @return
	 */
	public static ArrayList<Mattress> filterByPosition(ArrayList<Mattress> mattresses, String maxPosition) {
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getPosition().equalsIgnoreCase(maxPosition)) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	/**
	 * prints the user input to a new file.
	 * 
	 * @param mattresses
	 * @param out
	 */
	public static void printMattressData(ArrayList<Mattress> mattresses, PrintStream out) {
		// this will print to file so user can have record of results.
		for (Mattress m : mattresses) {
			out.println(m);

		}

	}

}
