/**
 * Student.java
 * @author Jeremy Krovitz
 *
 * Represents a single student. 
 */
public class Student {
	private String firstName, middleName, lastName, studentPhone;

	private Address workAddress, homeAddress;

	private StudentHighSchoolInformation studentHSInfo;

	/**
	 * Constructor: sets up this student with a firstName, a middleName,
	 * lastName, workAddress, homeAddress, studentPhone, and studentHSInfo.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param workAddress
	 * @param homeAddress
	 * @param studentPhone
	 * @param studentHSInfo
	 */
	public Student(String firstName, String middleName, String lastName, Address workAddress, Address homeAddress,
			String studentPhone, StudentHighSchoolInformation studentHSInfo) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.workAddress = workAddress;
		this.homeAddress = homeAddress;
		this.studentPhone = studentPhone;
		this.studentHSInfo = studentHSInfo;
	}
	
	/**
	 * First name mutator.
	 * @param sFirst
	 */
	public void setStudentFirstName(String sFirst) {
		this.firstName = sFirst;
	}

	/**
	 * Middle name mutator.
	 * @param sMiddle
	 */
	public void setStudentMiddleName(String sMiddle) {
		this.middleName = sMiddle;
	}

	/**
	 * Last name mutator.
	 * @param sLast
	 */
	public void setStudentLastName(String sLast) {
		this.lastName = sLast;
	}

	/**
	 * Work address mutator.
	 * @param wAddress
	 */
	public void setStudentAddressWork(Address wAddress) {
		this.workAddress = wAddress;
	}

	/**
	 * Home address mutator.
	 * @param hAddress
	 */
	public void setStudentAddressHome(Address hAddress) {
		this.homeAddress = hAddress;
	}

	/**
	 * Phone number mutator.
	 * @param sPhone
	 */
	public void setStudentPhoneNumber(String sPhone) {
		this.studentPhone = sPhone;
	}

	/**
	 * Student high school mutator.
	 * @param sHSInfo
	 */
	public void setStudentHSInfo(StudentHighSchoolInformation sHSInfo) {
		this.studentHSInfo = sHSInfo;
	}

	/**
	 * First name accessor.
	 */
	public String getStudentFirstName() {
		return this.firstName;
	}

	/**
	 * Middle name accessor.
	 */
	public String getStudentMiddleName() {
		return this.middleName;
	}

	/**
	 * Last name accessor.
	 */
	public String getStudentLastName() {
		return this.lastName;
	}

	/**
	 * Student full name accessor will concatenate only the first and last name if the middle name 
	 * is not specified preventing an additional space, which would happen if the middle name
	 * was concatenated between the first and last name and was an empty string. If the middle
	 * name is specified, the accessor will concatenate the first name, middle name, and last name.
	 */
	public String getStudentFullName() {
		String studentFullName = " ";
		if (this.middleName.equals(" ") || this.middleName.equals("")) {
			studentFullName = this.firstName + " " + this.lastName;
		}
		else {
			studentFullName = this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return studentFullName;
	}

	/**
	 * Work address accessor.
	 */
	public Address getStudentAddressWork() {
		return this.workAddress;
	}

	/**
	 * Home address accessor.
	 */
	public Address getStudentAddressHome() {
		return this.homeAddress;
	}

	/**
	 * Phone number accessor.
	 */
	public String getStudentPhoneNumber() {
		return this.studentPhone;
	}

	/**
	 * Student high school information accessor.
	 */
	public StudentHighSchoolInformation getStudentHSInfo() {
		return this.studentHSInfo;
	}

	/**
	 * Returns a description of the student's contact information as a string.
	 */
	public String toString() {
		return "My name is " + getStudentFullName() + ", my work address is " + getStudentAddressWork()
				+ "\nand my home address is " + getStudentAddressHome() + "." + " You can contact me on my phone at\n"
				+ getStudentPhoneNumber();
	}
}
