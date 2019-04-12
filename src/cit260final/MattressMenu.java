package cit260final;

import java.util.ArrayList;

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
			printMattress();
			break;
		case '2':
			printBiab();

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
	 * prints all 25 mattresses
	 */
	private void printMattress() {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for (Mattress m : mattresses) {
			System.out.println(m.toString());
		}

	}

	/**
	 * prints out all the traditional mattresses
	 */
	public void printTraditional() {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for (Mattress m : mattresses) {
			if (m.getType().contains("Traditional")) {
				System.out.println(m.toString());
			}
		}
	}

	/**
	 * prints all the Bed in a box mattresses
	 */
	public void printBiab() {
		ArrayList<Mattress> mattresses = MattressDatabase.getBed();
		for (Mattress m : mattresses) {
			if (m.getType().contains("Bed In A Box")) {
				System.out.println(m.toString());
			}
		}

	}

	/**
	 * filters the mattresses by type.
	 * 
	 * @param mattressList
	 * @param mattressType
	 * @return
	 */
	public static ArrayList<Mattress> filterByType(ArrayList<Mattress> mattressList, String mattressType) {
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
}