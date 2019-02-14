
/**
 * Class Rental.
 * This class will get the movie that has been rented and
 * the days that it has been rented.
 * @author mahsa
 *
 */

class Rental {
	
	private Movie _movie;
	private int _daysRented;
	
	/**
	 * Constructor for initializing the movie and the days it has been rented.
	 * @param movie
	 * @param daysRented
	 */
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	/**
	 * Getter method for days rented.
	 * @return int
	 */
	public int getDaysRented() {
		return _daysRented;
	}
	
	/**
	 * Getter method for Movie object, from Movie class.
	 * @return Movie
	 */
	public Movie getMovie() {
		return _movie;
	}
	
	/**
	 * Getting the charges for the movie based on days rented.
	 * @return double
	 */
	public double getCharge() {
		
		return _movie.getCharge(_daysRented);
	}
	
	/**
	 * Getting the points that the customer get for renting the movie.
	 * @return int
	 */
	public int getPoints(){
		return _movie.getPoints(_daysRented);
	}
}
