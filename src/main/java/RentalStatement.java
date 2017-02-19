import java.util.ArrayList;
import java.util.Collection;


public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);

		

	}

	public void print() {
		for (Rental rental : rentals) {
			
			
			System.out.println("\nPrice code: " + rental.getPriceCode()
			+ "\nTitle: " + rental.getTitle()
			+ "\n days rented: " + rental.getDays()
			+ "\n Your total cost will be " + rental.calculateFees());
			
		}

	}

}
