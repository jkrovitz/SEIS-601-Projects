/**
 * Customer.java
 * @author Jeremy Krovitz
 * 
 * Represents a single customer.
 */
public class Customer {
	String firstName, middleName, lastName, customerPhone;
	Address customerAddress;
	Vehicle customerVehicle;
	
	/**
	 * Constructor: sets up this customer with a first name,
	 * a middle name, a last name, a phone number, and an 
	 * address.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param customerPhone
	 * @param customerAddress
	 */
	public Customer(String firstName, String middleName, String lastName, String customerPhone, Address customerAddress) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}
	
	/**
	 * Customer full name accessor will concatenate only the first and last name if the middle name 
	 * is not specified preventing an additional space, which would happen if the middle name
	 * was concatenated between the first and last name and was an empty string. If the middle
	 * name is specified, the accessor will concatenate the first name, middle name, and last name.
	 * @return customerFullName
	 */
	public String getCustomerFullName() {
		String customerFullName = " ";
		if (this.middleName.equals(" ") || this.middleName.equals("")) {
			customerFullName = this.firstName + " " + this.lastName;
		}
		else {
			customerFullName = this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return customerFullName;
	}
	
	/**
	 * Returns a description of the customers contact information including
	 * their full name, phone number, and address.
	 * @return customerInfoString
	 */
	public String toString() {
		String customerInfoString = this.getCustomerFullName() + "\n" +
				this.customerPhone + "\n" + customerAddress.toString() + "\n\n";
		return customerInfoString;
	}
	
}
