
/**
 * Class Movie
 * 
 * This class will assign a title to the movie object and a priceCode that will
 * be getting from the Price abstract class.
 * 
 * @author mahsa
 *
 */

public class Movie {
	
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Price _price;
	
	/**
	 * Constructor to set the title and the priceCode
	 * @param title
	 * @param priceCode
	 */
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	/**
	 * Getter method for priceCode which will be getting from the abstract class Price
	 * @return int
	 */
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	/**
	 * setting the priceCode for the movie object
	 * @param arg
	 */
	public void setPriceCode(int arg) {

		if (arg == Movie.REGULAR){ 
			_price = new Regular();
		} else if(arg == Movie.CHILDREN) {
			_price = new Children();
		} else if(arg == Movie.NEW_RELEASE) {
			_price = new NewRelease();
		}

	}
	
	/**
	 * Getter method for title
	 * @return title
	 */
	public String getTitle() {
		return _title;
	}
	
	/**
	 * Getter method for charge value of renting a movie.
	 * This will get the charge value from Price abstract class,
	 * that means from its extended type of the movie classes.
	 * @param daysRented
	 * @return double
	 */
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	/**
	 * Getter method for the point that a customer get for
	 * renting each movies. It will be calculated in Price abstract class
	 * or its extended type of the movie classes.
	 * @param daysRented
	 * @return int
	 */
	public int getPoints(int daysRented){
		return _price.getPoints(daysRented);
	}
}