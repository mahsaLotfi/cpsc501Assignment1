

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