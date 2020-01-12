package JUnitTests;
import static org.junit.Assert.*;

import org.junit.Test;

import virtualPet.VirtualPet;
import virtualPet.VitualPet;

public class VirtualPetTest {

	@Test
	public void getFeedReturnsValueGreaterThanOrEqualTo0() {
		//Arrange
		VirtualPet underTest = new VirtualPet();
		//Act
		int result = underTest.getHunger();
		//Assert
		assertTrue(result >= 0);
	}

}
