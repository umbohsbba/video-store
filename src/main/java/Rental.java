import java.math.BigDecimal;

public class Rental {
	Movie rented;
	int days;

	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}

	public BigDecimal calculateFees() {
		BigDecimal fees = rented.calculateFees(days);
		return fees;
	}

	public String getTitle() {
		return rented.getTitle();
	}

	public String getPriceCode() {
		return rented.getPriceCode();

	}

}