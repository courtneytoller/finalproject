package cit260final;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintStream;

public abstract class BedQuizData extends MattressDatabase {

	public static ArrayList<Mattress> filterByPrice(ArrayList<Mattress> mattresses, double maxPrice) {
		// takes in ArrayList and filters by price of mattress that the user specifies.
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getPrice() <= maxPrice) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	public static ArrayList<Mattress> filterByFirmness(ArrayList<Mattress> mattresses, int maxFirmness) {
		// takes in ArrayList and filters by firmness of mattress that the user
		// specifies.
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getFirmness() <= maxFirmness) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	public static ArrayList<Mattress> filterByPosition(ArrayList<Mattress> mattresses, String maxPosition) {
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattresses) {
			if (m.getPosition().equalsIgnoreCase(maxPosition)) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	public static void printMattressData(ArrayList<Mattress> mattresses, PrintStream out) {
		// this will return found mattresses and bring in the three recommended
		// mattresses. this will print
		// to file so user can have record of results.
		for (Mattress m : mattresses) {
			out.println(m);

		}

	}

}
