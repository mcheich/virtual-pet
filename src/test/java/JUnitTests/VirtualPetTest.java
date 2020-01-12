package JUnitTests;
import static org.junit.Assert.*;

import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void getHungerReturnsValueGreaterThanOrEqualTo0() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		int result = underTest.getHunger();
		//Assert
		assertTrue(result >= 0);
	}
	
	@Test
	public void getHungerReturnsValueLessThanOrEqualTo24() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		int result = underTest.getHunger();
		//Assert
		assertTrue(result <= 24);
	}
	
	@Test
	public void setHungerReturnsValueGreaterThanOrEqualTo0() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		underTest.setHunger();
		//Assert
		assertTrue(underTest.getHunger() >= 0);
	}
	
	@Test
	public void setHungerReturnsValueLessThanEqualto24() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		underTest.setHunger();
		//Assert
		assertTrue(underTest.getHunger() <= 24);
	}

}
