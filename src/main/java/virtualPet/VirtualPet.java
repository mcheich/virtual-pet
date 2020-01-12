package virtualPet;

public class VirtualPet {
	/* Class Fields */
	private int hunger = 12;

	/* Class Methods */

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
	 * @param food 
	 * @return Nothing
	 * @param TBD 
	 * */
	public void setHunger(int newHunger) {
		
		hunger = newHunger;
		
		//Hunger does not go below 0
		if(hunger < 0) {
			hunger = 0;
		}
		
		if(hunger > 24) {
			hunger = 24;
		}
	}
	
	public void feed() {
		
		setHunger(hunger - 8);
		
	}

}
