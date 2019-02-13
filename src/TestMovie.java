import static org.junit.Assert.*;

import org.junit.Test;

public class TestMovie {
	
	private Movie m;
	
	private void setup(){
		
		m= new Movie("La la land", 1);
	}
	
	
	@Test
	public void TestTitle() {
		setup();
		assertEquals("La la land", m.getTitle());
	}
	
	@Test
	public void TestPriceCode() {
		setup();
		assertEquals(1, m.getPriceCode());
	}
	
	
}
