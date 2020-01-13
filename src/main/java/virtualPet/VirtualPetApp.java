/**
 * 
 */
package virtualPet;

import java.util.Scanner;

/**
 * @author Michael Cheich
 *
 */
public class VirtualPetApp {

	public static void main(String[] args) {

		// Create VirtualPetInstance
		VirtualPet foxxy = new VirtualPet();
		Scanner input = new Scanner(System.in);
		int selection;

		welcomeMessage();

		do {
			displayStats(foxxy);
			displayOptions();
			selection = input.nextInt();

			// Match user selection to option.
			switch (selection) {

			case 1:
				foxxy.feed();
				break;
			case 2:
				foxxy.play();
				break;
			case 3:
				foxxy.sleep();
				break;
			case 4:
				break;
			case 5:
				System.out.println("\n Thanks for Playing Fox_E!");
				System.exit(0);
				break;
			}

			// Increment "Time"
			foxxy.tick();

		} while (selection != 5);

		input.close();

	}

	public static void welcomeMessage() {

		System.out.println("           ^                      ^            \n"
				+ "          ^ ^                    ^ ^           \n"
				+ "         ^   ^                  ^   ^          \n"
				+ "        ^     ^                ^     ^         \n"
				+ "       ^       ^              ^       ^        \n"
				+ "      ^         ^            ^         ^       \n"
				+ "     ^           ^          ^           ^      \n"
				+ "    ^             ^        ^             ^	  \n"
				+ "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
				+ "^^           Welcome to Fox_E!               ^^\n"
				+ "^^                                           ^^\n"
				+ "^^     The game where you get to CARE for    ^^\n"
				+ "^^       for your very own pet fox.          ^^\n"
				+ "^^                                           ^^\n"
				+ "^^      Make a selection below to begin!     ^^\n"
				+ "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

	}

	private static void displayOptions() {

		System.out.println("  What do you want to do?\n");
		System.out.println("  1. Feed Fox_E");
		System.out.println("  2. Play with Fox_E?");
		System.out.println("  3. Put Fox_E to sleep");
		System.out.println("  4. Do nothing");
		System.out.println("  5. Exit game");
		System.out.print(">");
	}

	public static void displayStats(VirtualPet foxxy) {

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^ Your Fox_E Stats:: Great       OK      Danger!^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^V^^^^^^^^^^V^^^^^^^^^^V^^^^^");
		System.out.print("          Hunger" + "(" + String.format("%2d", foxxy.getHunger()) + ") ");
		fancyStat(foxxy.getHunger()); 
		System.out.print("         Boredom" + "(" + String.format("%2d", foxxy.getBoredom()) + ") ");
		fancyStat(foxxy.getBoredom());
		System.out.print("      Sleepiness" + "(" + String.format("%2d", foxxy.getSleepiness()) + ") ");
		fancyStat(foxxy.getSleepiness());
		System.out.println();

	}

	public static void fancyStat(int stat) {

		for (int i = 0; i < stat; i++) {
			System.out.print("*");
		}

		System.out.println();
	}

}
