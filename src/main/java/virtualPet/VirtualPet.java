package virtualPet;

public class VirtualPet {
	/* Class Fields */
	private int hunger = 12;
	private int boredom = 12;

	/* Class Methods */

	/**
	 * This method represents the passing of time. It is called after every user
	 * interaction. It adjusts the instance variables.
	 * 
	 * @return Nothing.
	 * @param None.
	 */
	public void tick() {
		// Increase hunger by fixed amount
		setHunger(hunger + 6);
	}

	/**
	 * This is a getter method for hunger.
	 * 
	 * @return hunger A value between 0-24, where 0 is not hungry and 24 is super
	 *         hungry
	 * @param TBD
	 */
	public int getHunger() {
		return hunger;
	}

	/**
	 * This is a setter method for hunger.
	 * 
	 * @return Nothing.
	 * @param newHunger
	 */
	public void setHunger(int newHunger) {

		hunger = newHunger;

		// Hunger does not go below 0
		if (hunger < 0) {
			hunger = 0;
		}

		if (hunger > 24) {
			hunger = 24;
		}
	}

	/**
	 * This method reduces hunger by a fixed amount
	 * 
	 * @return Nothing.
	 * @param None.
	 */
	public void feed() {
		// Reduce hunger by fixed amount
		setHunger(hunger - 8);

	}

	/**
	 * This method reduces boredom by a fixed amount
	 * 
	 * @return Nothing.
	 * @param None.
	 */
	public void play() {
		// Reduce boredom by a set amount
		setBoredom(boredom - 4);
	}

	/**
	 * This is a setter method for boredom.
	 * 
	 * @return Nothing.
	 * @param newBoredom
	 */
	public void setBoredom(int newBoredom) {
		boredom = newBoredom;

		if (boredom < 0) {
			boredom = 0;
		}
		if (boredom > 24) {
			boredom = 24;
		}
	}

	/**
	 * This is a fetter method for boredom.
	 * 
	 * @return boredom
	 * @param Nothing.
	 */
	public int getBoredom() {
		return boredom;
	}

}
