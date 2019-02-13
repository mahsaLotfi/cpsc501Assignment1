
/**
 * Price abstract class.
 * This class will calculate the charge of renting each movies and 
 * the points that the customer will get from renting a movie.
 * The abstract methods will be overwritten in the extended classes
 * of Price which are : NewRelease, Regular and Children
 * @author mahsa
 *
 */
abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);

	public int getPoints(int daysRented){
		return 1;
	}
}