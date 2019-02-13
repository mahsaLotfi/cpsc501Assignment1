/**
 * NewRelease class extends Price abstract class.
 * This class will calculate the New Released movies charge and points
 * 
 * @author mahsa
 *
 */

public class NewRelease extends Price {

	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented){
		return daysRented * 3;
	}

	public int getFrequentRenterPoints(int daysRented){
		return (daysRented > 1) ? 2: 1;
	}
}