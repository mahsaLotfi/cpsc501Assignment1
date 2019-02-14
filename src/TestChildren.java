import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for Children class
 * @author mahsa
 *
 */

public class TestChildren {

	private Price p1= new Children();
	

	@Test
	public void TestGetPoint() {
		
		assertEquals(1, p1.getPoints(10));
		assertEquals(1, p1.getPoints(1));
		assertEquals(1, p1.getPoints(0));
	}
	
	@Test
	public void TestGetPriceCode() {
		
		assertEquals(2, p1.getPriceCode());
	}

	
	@Test
	public void TestGetCharge() {
		
		assertEquals(1.5, p1.getCharge(1),0.1);
		assertEquals(1.5, p1.getCharge(3),0.1);
		assertEquals(3.0, p1.getCharge(4),0.1);
	}
}
