import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) {
	
      RentalStatement statement = new RentalStatement();
      Movie regularMovie = new RegularMovie("Twister");
      Movie newRelease = new NewRelease("Dr.Strange");
      Movie childrensMovie = new ChildrensMovie ("UP");
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many days would you like to keep your rental?");
      int rentalDays = input.nextInt();
     
      
      Rental regular = new Rental(regularMovie, rentalDays );
      Rental nrelease = new Rental(newRelease, rentalDays);
      Rental childrens = new Rental(childrensMovie, rentalDays);
      
      statement.add(regular);
      statement.add(childrens);
      statement.add(nrelease);
      
      statement.print();
	}

}

