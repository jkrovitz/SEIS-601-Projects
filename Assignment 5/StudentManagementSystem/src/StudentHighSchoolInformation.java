/**
 * StudentHighSchoolInformation.java
 * @author Jeremy Krovitz
 *
 * Represents information about a student's high school, containing 
 * information about both the student's school address and GPA.
 */
public class StudentHighSchoolInformation {
	private Address schoolAddress;

	private double GPA;
	
	/**
	 * Constructor: sets up information about a student's high school by 
	 * setting up the schoolAddress and GPA.
	 */
	public StudentHighSchoolInformation (Address schoolAddress, double GPA) {
		this.schoolAddress = schoolAddress; 
		this.GPA = GPA; 
	}
	
	/**
	 * GPA mutator.
	 * @param g
	 */
	public void setGPA(double g) {
		this.GPA = g;
	}
	
	/**
	 * GPA accessor.
	 */
	public double getGPA() {
		return this.GPA;
	}
	
	/**
	 * School address mutator.
	 */
	public void setSchoolAddress(Address sAddress) {
		this.schoolAddress = sAddress;
	}
	
	/**
	 * School address accessor.
	 */
	public Address getSchoolAddress() {
		return this.schoolAddress;
	}
	
	/**
	 * Returns a description of a student's high school information including
	 * the high school's address and the student's high school GPA.
	 */
	public String toString() {
		return ". I went to an awesome high school at " + getSchoolAddress() + "\nand guess what my GPA was "
				+ getGPA() + "\n";
	}
}
