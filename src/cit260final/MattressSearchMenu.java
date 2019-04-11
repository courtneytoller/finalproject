package cit260final;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import cit260final.BedQuizData;

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
	private void handleQuizOptions() {
		Scanner input = new Scanner(System.in);
		//String back = "back";
		//String side = "side";
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
			// Prompt for firmness from 1-5 soft, medium, hard
			System.out.print("What is your preferred firmness 1-7? 1 being softest 7 being most firm");
			int filterByFirmness = input.nextInt();
			while (filterByFirmness < 0 || filterByFirmness > 7) {
				System.err.println("Please enter firmness rating between 1 and 7");
				System.out.println("");
				System.out.println("Please re-enter firmness preference options: ");
				filterByFirmness = input.nextInt();
			}
			// prompt for position back or side
			// IS THIS GOING TO WORK WITH THE STRING TO INT CONVERSION?

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
				System.out.printf("The Mattresses that match your specifications are: $%.2f\n", result);
			}
		} catch (InputMismatchException ex) {
			System.err.println("Incorrect input. Please try again.");
			System.out.print("");
		}
		//process Quiz options to get filtered results
		//using a for each loop print out the matching mattresses
	}

	private ArrayList<Mattress> processQuizOptions(double filterByPrice, int filterByFirmness,
		String filterByPosition) {
		// filter user input to arrays that will find
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		mattresses = BedQuizData.filterByPrice(mattresses, filterByPrice);
		mattresses = BedQuizData.filterByFirmness(mattresses, filterByFirmness);
		mattresses = BedQuizData.filterByPosition(mattresses, filterByPosition);
		//second parameter passed through the method will look for individual mattress
		//mattresses = MattressMenu.filterByType(mattresses, "Traditional");
		return mattresses;
	}

}