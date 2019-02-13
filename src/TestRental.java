import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRental {
	
	private Rental r1;
	private Rental r2;
	private Rental r3;
	private Movie m1;
	private Movie m2;
	private Movie m3;
	private Customer c;
	
	private void setup(){
		m1= new Movie("La la land", 1);
		m2= new Movie("Toy story 3", 2);
		m3= new Movie("Vice", 0);
		c= new Customer("Alice");		
	}
	
	
	@Test
	public void TestDaysRented() {
		setup();
		r1= new Rental(m1, 10);
		assertEquals(10, r1.getDaysRented());
	}
	
	@Test
	public void TestMov() {
		setup();
		r1= new Rental(m1, 10);
		assertEquals(m1, r1.getMovie());
	}
	
	@Test
	public void TestGetCharge1() {
		setup();
		r1= new Rental(m1, 10);
		double rent = r1.getCharge();
		assertEquals(30.0, rent,0.1);
	}
	
	@Test
	public void TestGetCharge2() {
		setup();
		r2= new Rental(m2, 4);
		double rent = r2.getCharge();
		assertEquals(3.0, rent,0.1);
	}
	
	@Test
	public void TestGetCharge3() {
		setup();
		r3= new Rental(m3, 3);
		double rent = r3.getCharge();
		assertEquals(3.5, rent,0.1);
	}

}
