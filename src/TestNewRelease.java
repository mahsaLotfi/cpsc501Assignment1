import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for NewRelease class
 * @author mahsa
 *
 */
public class TestNewRelease {
	
	
	private Price p1= new NewRelease();
	

	@Test
	public void TestGetPoint() {
		
		assertEquals(2, p1.getPoints(10));
		assertEquals(1, p1.getPoints(1));
		assertEquals(2, p1.getPoints(2));
	}
	
	@Test
	public void TestGetPriceCode() {
		
		assertEquals(1, p1.getPriceCode());
	}

	
	@Test
	public void TestGetCharge() {
		
		assertEquals(3.0, p1.getCharge(1),0.1);
		assertEquals(6.0, p1.getCharge(2),0.1);
		assertEquals(0.0, p1.getCharge(0),0.1);
	}
}
