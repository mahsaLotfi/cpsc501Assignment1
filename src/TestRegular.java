import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for Regular class
 * @author mahsa
 *
 */
public class TestRegular {
	
	private Price p1= new Regular();
	
	@Test
	public void TestGetPoint() {
		
		assertEquals(1, p1.getFrequentRenterPoints(10));
		assertEquals(1, p1.getFrequentRenterPoints(1));
		assertEquals(1, p1.getFrequentRenterPoints(5));
	}
	
	@Test
	public void TestGetPriceCode() {
		
		assertEquals(0, p1.getPriceCode());
	}

	
	@Test
	public void TestGetCharge() {
		
		assertEquals(2.0, p1.getCharge(1),0.1);
		assertEquals(2.0, p1.getCharge(2),0.1);
		assertEquals(3.5, p1.getCharge(3),0.1);
	}
	
}
