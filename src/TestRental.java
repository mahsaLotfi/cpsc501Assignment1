import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRental {
	
	private Rental r;
	private Movie m;
	
	private void setup(){
		
		r= new Rental(m, 10);
		m= new Movie("La la land", 1);
	}
	
	
	@Test
	public void TestDaysRented() {
		setup();
		assertEquals(10, r.getDaysRented());
	}
	
	@Test
	public void TestMov() {
		setup();
		assertEquals(m, r.getMovie());
	}
	

}
