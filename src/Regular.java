
/**
 * Regular class extends Price abstract class.
 * This class will calculate the Regular movies charge and points
 * 
 * @author mahsa
 *
 */

public class Regular extends Price {

	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
}
