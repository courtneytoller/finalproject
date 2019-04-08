package cit260final;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMenu extends Menu {

	/**
	 * Default constructor. Does nothing.
	 */
	public MainMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "MAIN MENU";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "Welcome to the main menu of the program.";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { 
				new MenuItem('1', "Mattress Menu"),
				new MenuItem('2', "Find the Best Mattress for You"),
				new MenuItem('F', "Financial"), new MenuItem('Q', "Quit Program") };
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
			Menu mattressMenu = new MattressMenu();
			mattressMenu.display();
			break;
		case '2':
			Menu mattressSearchMenu = new MattressSearchMenu();
			mattressSearchMenu.display();
			break;
		case 'F':
			handleFinance();
			break;

		case 'Q':
			return false;

		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

	/**
	 * calculateFinance calculates monthly payment for mattress base payment based
	 * on 1(5%), 3(3%), or 5(2%) years userInput class we will pull price, amount of
	 * years, and any cash down method will return payment and display for user
	 * calculation code adapted from CodeAcademy;
	 * 
	 * @param price
	 * @param years
	 * @param cashDown
	 * @return
	 */
	private static double calculateFinance(double price, int years, double cashDown) {
		// do finance calculations copy and paste from previous assignment loan payment
		// :)
		double interestRate = 0;
		double remainingBalance = price - cashDown;
		int months = years * 12;

		if (years == 1) {
			interestRate = .05;
		} else if (years == 3) {
			interestRate = .03;
		} else if (years == 5) {
			interestRate = .01;

		} else {
			System.out.print("Please enter 1, 3, 5 years.");
		}

		double monthlyPayment = ((interestRate / 12) * remainingBalance)
				/ (1 - Math.pow((1 + (interestRate / 12)), -months));

		return monthlyPayment;
	}

	/**
	 * handleFinance will prompt user for amount of the bed. user will enter 1, 3,
	 * or 5 years to finance and amount of cash down. Return result of calculate
	 * finance.
	 */
	private void handleFinance() {
		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Please Enter Mattress Price:");

			double price = input.nextDouble();
			// check for negative number
			while (price < 0) {
				System.err.println("Only positive number, please.");
				System.out.println("");
				System.out.println("Please re-enter price: ");
				price = input.nextDouble();
			}

			System.out.print("Would you like to finance for 1, 3 or 5 years?");
			int years = input.nextInt();

			// exception for only 1,3,5
			while (years != 1 && years != 3 && years != 5) {
				System.err.println("Please enter only 1, 3, or 5 years.");
				System.out.println("");
				System.out.println("Please re-enter years: ");
				years = input.nextInt();

			}

			// for loop to check for valid input 1, 3, 5
			System.out.print("How much money would you like to put down?");
			double cashDown = input.nextDouble();
			while (cashDown < 0) {
				System.err.println("Only positive number, please.");
				System.out.println("");
				System.out.println("Please re-enter price:\n");
				cashDown = input.nextDouble();
			}
			// mismatch handling here.
			double result = calculateFinance(price, years, cashDown);
			System.out.printf("Your Monthly Payment is: $%.2f\n", result);
		//look at catch again see what exception we need
			//figure out no such element exception
		} catch (InputMismatchException ex) {
			System.out.println("Input not accepted, enter an integer: ");
			input.nextLine();
		}
		input.close();
	}
	//store user input
	//output the user enters for user as summary. 
	//print finance results for user including payment per month.
}
