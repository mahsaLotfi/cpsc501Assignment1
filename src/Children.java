
/**
 * Children class extends Price abstract class.
 * This class will calculate the Children movies charge and points
 * 
 * @author mahsa
 *
 */
public class Children extends Price {

	int getPriceCode() {
		return Movie.CHILDREN;
	}

	@Override
	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}
