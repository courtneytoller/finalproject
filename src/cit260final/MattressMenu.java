package cit260final;

import java.util.ArrayList;
import java.util.Arrays;

public class MattressMenu extends Menu {

	/**
	 * Default constructor. Does nothing.
	 */
	public MattressMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "MATTRESS MENU";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "Get Mattress List Here";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Top 25 Mattresses"), new MenuItem('2', "Bed-in-a-Box options"),
				new MenuItem('3', "Traditional Mattress Options"), new MenuItem('4', "Take the Quiz"),
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
			processPrintMattress();
			break;
		case '2':
			//printBiab();

			break;
		case '3':
			printTraditional();
			break;
		case '4':
			Menu mattressSearchMenu = new MattressSearchMenu();
			mattressSearchMenu.display();
		case 'R':
			return false;// return back to main menu

		default:
			System.out.println("Invalid Entry");// prompt user when input is not valid

		}

		return true;
	}

	/**
	 * this will bring in the the top 25 mattress list for the user to view
	 * 
	 * @param database
	 * @return
	 */
	// public static void handleAll(ArrayList<Mattress> mattressList) {
	// String result = printMattress(<ArrayList<Mattress>);
	// return result;
	// }
	private void processPrintMattress() {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for(Mattress m: mattresses) {
			System.out.println(m.toString());
		}
		
	}

	/*public static ArrayList<Mattress> printMattress(ArrayList<Mattress> mattressList) {
		ArrayList<Mattress> mattresses = new ArrayList<>();
		for (Mattress m : mattressList) {
			
				}
		}
		
		return mattresses;

	}
*/
	/**
	 * displays all bed in a box mattresses
	 * 
	 * @param database
	 * @param typeToFind
	 * @return
	 */
	public static ArrayList<Mattress> printBiab(ArrayList<Mattress> mattressList, String position) {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for (Mattress m : mattressList) {
			if (m.getPosition().equals(position)) {
				mattresses.add(m);
			}
		}
		mattresses = MattressMenu.filterByType(mattresses, "Bed-In-A-Box");
		return mattresses;
	}
	public static ArrayList<Mattress> filterByType(ArrayList<Mattress> mattressList, String mattressType) {
		// takes in ArrayList and filters by price of mattress that the user specifies.
		ArrayList<Mattress> matchMattress = new ArrayList<>();
		for (Mattress m : mattressList) {
			if (m.getType().equals(mattressType)) {
				matchMattress.add(m);
			}
		}
		return matchMattress;
	}

	/**
	 * displays all traditional mattresses.
	 * 
	 * @param database
	 * @param typeToFind
	 * @return
	 */

	public static ArrayList<Mattress> processTraditional(ArrayList<Mattress> mattressList, String mattressType) {

		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for (Mattress m : mattressList) {
			if (m.getType().equals(mattressType)) {
				mattresses.add(m);
			}
		}
		return mattresses;
	}

	public static ArrayList<Mattress> printTraditional() {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();

		return processTraditional(mattresses, "Traditional");
	}
}