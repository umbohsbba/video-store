
public class VideoStoreApp {

	public static void main(String[] args) {
	
      RentalStatement statement = new RentalStatement();
      Movie regularMovie = new RegularMovie("Twister");
      Movie newRelease = new NewRelease("Dr.Strange");
      Movie childrensMovie = new ChildrensMovie ("UP");
       
      Rental regular = new Rental(regularMovie, 5);
      Rental nrelease = new Rental(newRelease, 5);
      Rental childrens = new Rental(childrensMovie, 5);
      
      statement.add(regular);
      statement.add(childrens);
      statement.add(nrelease);
      
      statement.print();
	}

}

