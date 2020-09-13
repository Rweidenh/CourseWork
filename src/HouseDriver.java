
/**
 * Assignment Programming 1 Game of Thrones - 6112
 * Driver class for GreatHouse containing the main method
 *
 * @version Sep 7, 2020
 * @author Rachel Weidenhammer
 */
public class HouseDriver {

	/**
	 * Main method in the Driver
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		//Create an object to represent House Lannister
		//"House characteristic" parameters: name, sigil, motto, current head of house
		GreatHouse HouseLannister = new GreatHouse("Lannister", "Lion", "Hear me roar!", "Tywin Lannister");

		//Retrieve and display all the characteristics of House Lannister.
		System.out.println("These are the characteristics of House " + HouseLannister.getName()
				+ "\nName: " + HouseLannister.getName()
				+ "\nSigil: " + HouseLannister.getSigil()
				+ "\nMotto: " + HouseLannister.getMotto()
				+ "\nCurrent Head of the House: " + HouseLannister.getCurrentHeadOfHouse()
				+ "\n");

		//Tywin Lannister is killed and replaced with Jamie Lannister
		//update the state of the current head of House Lannister
		HouseLannister.setCurrentHeadOfHouse("Jamie Lannister");

		//Retrieve and display all of the characteristics of House Lannister post-update.
		System.out.println("These are the characteristics of House " + HouseLannister.getName()
				+ "\nName: " + HouseLannister.getName()
				+ "\nSigil: " + HouseLannister.getSigil()
				+ "\nMotto: " + HouseLannister.getMotto()
				+ "\nCurrent Head of the House: " + HouseLannister.getCurrentHeadOfHouse()
				+ "\n");
	}

}
