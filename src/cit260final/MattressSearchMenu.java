package cit260final;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import cit260final.BedQuizData;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MattressSearchMenu extends Menu {

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "MATTRESS SEARCH MENU";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "Take the Mattress Quiz Here";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Take the Bed Quiz"), new MenuItem('2', "Mattress Menu"),
				new MenuItem('R', "Return") };
	}

	/**
	 * Handle the user's menu selection.
	 * 
	 * @param key
	 * @return false if the menu should exit and return to whatever called it.
	 */
	@Override
	protected boolean handleMenuSelection(char key) {

		switch (Character.toUpperCase(key)) {
		case '1':
			handleQuizOptions();
		case '2':
			Menu mattressMenu = new MattressMenu();
			mattressMenu.display();
		case 'R':
			return false;// return back to main menu

		default:
			System.out.println("Invalid Entry");// prompt user when input is not valid

		}

		return true;
	}

	// try with catch statements to close out scanner
	/**
	 * prompts user for input and process finance.
	 */
	private void handleQuizOptions() {
		Scanner input = new Scanner(System.in);

		try {
			// Prompt user for price
			System.out.print("What is the maximum price you are willing to spend? ");
			double filterByPrice = input.nextDouble();
			while (filterByPrice < 0) {
				System.err.println("Please enter positive numbers only.");
				System.out.println("");
				System.out.println("Please re-enter price options: ");
				filterByPrice = input.nextDouble();

			}
			// Prompt for firmness from 1-7
			System.out.print("What is your preferred firmness 1-7? 1 being softest 7 being most firm");
			int filterByFirmness = input.nextInt();
			while (filterByFirmness < 0 || filterByFirmness > 7) {
				System.err.println("Please enter firmness rating between 1 and 7");
				System.out.println("");
				System.out.println("Please re-enter firmness preference options: ");
				filterByFirmness = input.nextInt();
			}
			// prompt for position back or side
			boolean validAnswer = false;
			while (!validAnswer) {
				System.out.print("What is your preferred sleeping position? back, side");
				String filterByPosition = input.next();

				if (filterByPosition.equals("side") || filterByPosition.equals("back")) {
					validAnswer = true;

				} else {
					System.out.println("");
					System.err.println("Please put in back or side only");

				}

				ArrayList<Mattress> result = processQuizOptions(filterByPrice, filterByFirmness, filterByPosition);

				System.out.println("The Mattresses that match your specifications are: ");
				BedQuizData.printMattressData(result, System.out);
				String filename = prompt("Enter the file name to save report");
				if (filename.trim().length() == 0) {
					continue;
				}
				PrintStream out = new PrintStream(new FileOutputStream(filename));
				BedQuizData.printMattressData(result, out);
				out.flush();
				out.close();
			}

		} catch (InputMismatchException ex) {
			System.err.println("Incorrect input. Please Try Again.");
			System.out.println("");
			handleQuizOptions();
			System.out.print("");

		} catch (IOException ex) {
			System.err.println("Could not open File");

		}

	}

	/**
	 * takes the parameters and filters down to the matching mattresses
	 * 
	 * @param filterByPrice
	 * @param filterByFirmness
	 * @param filterByPosition
	 * @return
	 */
	private ArrayList<Mattress> processQuizOptions(double filterByPrice, int filterByFirmness,
			String filterByPosition) {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		mattresses = BedQuizData.filterByPrice(mattresses, filterByPrice);
		mattresses = BedQuizData.filterByFirmness(mattresses, filterByFirmness);
		mattresses = BedQuizData.filterByPosition(mattresses, filterByPosition);
		return mattresses;
	}

}