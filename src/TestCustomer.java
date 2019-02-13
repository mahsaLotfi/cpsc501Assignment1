import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCustomer {
	
	
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
		r1= new Rental(m1, 10);
		r2= new Rental(m2, 4);
		r3= new Rental(m3, 3);
		c= new Customer("Alice");		
	}
	
	
	@Test
	public void TestGetName() {
		setup();
		assertEquals("Alice", c.getName());
	}
	
	@Test
	public void TestStatement1() {
		setup();
		c.addRental(r1);
		String s = c.statement();
		String expectedS = "Rental Record for Alice\n\tLa la land\t30.0\nAmount owed is 30.0\nYou earned 2 frequent renter points"; 
		assertEquals(expectedS, s);
	}
	
	@Test
	public void TestStatement2() {
		setup();
		c.addRental(r1);
		c.addRental(r2);
		String s = c.statement();
		String expectedS = "Rental Record for Alice\n\tLa la land\t30.0\n\tToy story 3\t3.0\nAmount owed is 33.0\nYou earned 3 frequent renter points"; 
		assertEquals(expectedS, s);
	}
	
	@Test
	public void TestStatement3() {
		setup();
		c.addRental(r1);
		c.addRental(r2);
		c.addRental(r3);
		String s = c.statement();
		String expectedS = "Rental Record for Alice\n\tLa la land\t30.0\n\tToy story 3\t3.0\n\tVice\t3.5\nAmount owed is 36.5\nYou earned 4 frequent renter points"; 
		assertEquals(expectedS, s);
	}
	
	

}
