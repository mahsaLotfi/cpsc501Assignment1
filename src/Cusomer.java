import java.util.Enumeration;
import java.util.Vector;

/**
 * Customer class.
 * This class will create a customer object with a name assigned to it and
 * will print out a statement regarding the customer and the charges for 
 * renting a movie and the point for renting a movie.
 * @author mahsa
 *
 */
class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	/**
	 * Constructor for initializing a name
	 * @param name
	 */
	public Customer(String name) {
		_name = name;
	}
	
	/**
	 * Method for adding the movies rented to the customer
	 * @param arg
	 */
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	/**
	 * Getter method for the name of the customer
	 * @return String
	 */
	public String getName() {
		return _name;
	}
	
	/**
	 * Statement method for printing out a statement for the rentals and 
	 * the charges and the point that the customer has.
	 * @return String
	 */
	public String statement() {
		double totalAmount = 0;
		int points = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			
			Rental eachRental = (Rental) rentals.nextElement();
			
			points += eachRental.getPoints();
			
			//show figures for this rental
			result += "\t" + eachRental.getMovie().getTitle()+ "\t" + String.valueOf(eachRental.getCharge()) + "\n";
			totalAmount += eachRental.getCharge();
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(points) + " frequent renter points";
		return result;
	}
	
			
}