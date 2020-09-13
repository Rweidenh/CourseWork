
/**
 * Assignment Programming 1 Game of Thrones - 6112
 * Class used to create Great House objects
 * 
 * @version Sep 7, 2020
 * @author Rachel Weidenhammer 
 */
public class GreatHouse {

	//variables (characteristics of the Great House)
	private String name;
	private String sigil;
	private String motto;
	private String currentHeadOfHouse;
	
	//Constructor taking 4 characteristics
	/**
	 * Constructor for a Great House taking 4 characteristics
	 * @param name
	 * @param sigil
	 * @param motto
	 * @param currentHeadOfHouse 
	 */
	public GreatHouse(String name, String sigil, String motto, String currentHeadOfHouse) {
		this.name = name;
		this.sigil = sigil;
		this.motto = motto;
		this.currentHeadOfHouse = currentHeadOfHouse;
	}
/**
 * Gets the name of the Great House
 * @return name of Great House
 */
	public String getName() {
		return name;
	}
/**
 * Gets the sigil of the Great House
 * @return sigil
 */
	public String getSigil() {
		return sigil;
	}
/**
 * Gets the motto of the Great House
 * @return motto
 */
	public String getMotto() {
		return motto;
	}
/**
 * Gets the name of the current head of the Great House
 * @return current head of house
 */
	public String getCurrentHeadOfHouse() {
		return currentHeadOfHouse;
	}
/**
 * Sets a new name for the current head of the House
 * @param currentHeadOfHouse 
 */
	public void setCurrentHeadOfHouse(String currentHeadOfHouse) {
		//replace the current head of house name
		this.currentHeadOfHouse = currentHeadOfHouse;
	}

}
