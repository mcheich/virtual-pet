package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void getHungerReturnsValueGreaterThanOrEqualTo0() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		int result = underTest.getHunger();
		// Assert
		assertTrue(result >= 0);
	}

	@Test
	public void getHungerReturnsValueLessThanOrEqualTo24() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		int result = underTest.getHunger();
		// Assert
		assertTrue(result <= 24);
	}

	@Test
	public void setHungerReturnsValueGreaterThanOrEqualTo0() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setHunger(20);
		// Assert
		assertTrue(underTest.getHunger() >= 0);
	}

	@Test
	public void setHungerReturnsValueLessThanEqualto24() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setHunger(-24);
		// Assert
		assertTrue(underTest.getHunger() <= 24);
	}

	@Test
	public void feedDecreasesHungerBy8() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.feed();
		// Assert
		assertEquals(4, underTest.getHunger());
	}

	@Test
	public void feedDoesNotSetHungerBelow0() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.feed();
		underTest.feed();
		// Assert
		assertTrue(underTest.getHunger() >= 0);
	}

	@Test
	public void playDoesNotDecreaseBoredomBelow0() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setBoredom(3);
		underTest.play();
		// Assert
		assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void setBoredomDoesNoDecreaseBoredomBelow0() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setBoredom(-3);
		// Assert
		assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void setBoredomDoesNoIncreaseBoredomAbove24() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setBoredom(25);
		// Assert
		assertEquals(24, underTest.getBoredom());
	}

	@Test
	public void setSleepinessReturnsValueGreatThanOrEqualTo0() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		underTest.setSleepiness(-2);
		//Assert
		assertEquals(0,underTest.getSleepiness());
	}
	
	@Test
	public void setSleepinessReturnsValueLessThanOrEqualTo24() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		underTest.setSleepiness(25);
		//Assert
		assertEquals(24,underTest.getSleepiness());
	}

	@Test
	public void sleepReducesSleepinessBy12() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.setSleepiness(24);
		underTest.sleep();
		//Assert
		assertEquals(12,underTest.getSleepiness());
	}
	
	@Test
	public void tickIncreasesHungerBy2() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.tick();
		// Assert
		assertEquals(14, underTest.getHunger());
	}
	
	@Test
	public void tickIncreasesSleepinessBy3() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.tick();
		// Assert
		assertEquals(15, underTest.getSleepiness());
	}

	@Test
	public void tickIncreasesBoredomBy3() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		underTest.tick();
		// Assert
		assertEquals(15, underTest.getBoredom());
	}

}
