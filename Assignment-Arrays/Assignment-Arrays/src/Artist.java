/**
 * Artist.java
 * @author Jeremy Krovitz
 *
 * Represents an artist. Some of the code in this  class was borrowed and 
 * modified from the Student class of SEIS-601 Assignment 5 (Jeremy Krovitz).
 * 
 */

public class Artist {

	private String firstName, middleName, lastName;

	/**
	 * Constructor: sets up this artist with a firstName, a middleName, and
	 * lastName.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 */
	public Artist(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/**
	 * Constructor: sets up this artist with a first and last name.
	 * @param firstName
	 * @param lastName
	 */
	public Artist(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Concatenates only the first and last name if the middle name is not specified preventing 
	 * an additional space, which would happen if the middle name was concatenated between 
	 * the first and last name and was an empty string. If the middle name is specified, the 
	 * toString method will concatenate the first name, middle name, and last name.
	 */
	public String toString() {
		String artistFullName = " ";
		if (this.middleName == null || this.middleName.equals(" ") || this.middleName.equals("")){
			artistFullName = this.firstName + " " + this.lastName;
		}
		else {
			artistFullName = this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return artistFullName;
	}

}
