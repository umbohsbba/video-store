import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);

		

	}

	public void print() {
		for (Rental rental : rentals) {
			
			
			System.out.println("\nprice code " + rental.getPriceCode()
			+ "\nTitle " + rental.getTitle()
			+ "\n Rental fees are " + rental.calculateFees());
			
		}

	}

}
