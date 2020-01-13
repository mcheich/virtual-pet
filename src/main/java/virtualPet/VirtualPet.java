package virtualPet;

public class VirtualPet {
	
	/* Class Fields */
	private int hunger = 12;
	private int boredom = 12;
	private int sleepiness = 12;

	
	/****** Getter and Setter Methods ***********************/
	/********************************************************/

	/**
	 * This is a getter method for hunger.
	 * 
	 * @return hunger A value between 0-24, where 0 is not hungry and 24 is super
	 *         hungry
	 * @param TBD
	 */
	public int getHunger() {
		return this.hunger;
	}

	/**
	 * This is a setter method for hunger.
	 * 
	 * @return Nothing.
	 * @param newHunger
	 */
	public void setHunger(int hunger) {

		this.hunger = hunger;

		// Hunger does not go below 0
		if (this.hunger < 0) {
			this.hunger = 0;
		}

		if (this.hunger > 24) {
			this.hunger = 24;
		}
	}

	/**
	 * A getter method for boredom.
	 * 
	 * @return boredom
	 * @param None.
	 */
	public int getBoredom() {
		return this.boredom;
	}

	/**
	 * This is a setter method for boredom.
	 * 
	 * @return Nothing.
	 * @param newBoredom
	 */
	public void setBoredom(int boredom) {
		this.boredom = boredom;

		if (this.boredom < 0) {
			this.boredom = 0;
		}
		if (this.boredom > 24) {
			this.boredom = 24;
		}
	}

	/**
	 * A getter method for sleepiness.
	 * 
	 * @return sleepiness
	 * @param None.
	 */
	public int getSleepiness() {
		return this.sleepiness;
	}

	/**
	 * A setter method for sleepiness.
	 * 
	 * @return Nothing.
	 * @param sleepiness the sleepiness to set
	 */
	public void setSleepiness(int rest) {
		this.sleepiness = rest;

		if (this.sleepiness < 0) {
			this.sleepiness = 0;
		}
		if (this.sleepiness > 24) {
			this.sleepiness = 24;
		}
	}

	
	/****** Class Methods ***********************************/
	/********************************************************/

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
		setBoredom(boredom - 9);
	}

	/**
	 * This method reduces sleepiness by a fixed amount.
	 * @return Nothing.
	 * @param None
	 */
	public void sleep() {
		//Reduce sleepiness by fixed amount
		setSleepiness(this.sleepiness - 12);
	}

	/**
	 * This method represents the passing of time. It is called after every user
	 * interaction. It adjusts the instance variables.
	 * 
	 * @return Nothing.
	 * @param None.
	 */
	public void tick() {
		// Increase hunger by fixed amount
		setHunger(this.hunger + 2);
		// Increase sleepiness by fixed amount
		setSleepiness(this.sleepiness + 3);
		// Increase boredom by fixed amount
		setBoredom(this.boredom + 3);
	}
}
