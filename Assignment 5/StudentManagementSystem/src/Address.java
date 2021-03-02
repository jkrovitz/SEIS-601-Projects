/**
 * Address.java
 * @author Jeremy Krovitz
 *
 * Represents a single address.
 */
public class Address {

	private String addressLine1, addressLine2, city, zip, state;

	/**
	 * Constructor: Sets up the address with the first line of the address, the second line, the city, 
	 * state, and zip code.
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String addressLine1, String addressLine2, String city, String state, String zip) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * Address line 1 mutator.
	 * @param addL1
	 */
	public void setAddressLine1(String addL1) {
		this.addressLine1 = addL1;
	}

	/**
	 * Address line 2 mutator.
	 * @param addL2
	 */
	public void setAddressLine2(String addL2) {
		this.addressLine2 = addL2;
	}

	/**
	 * City mutator.
	 * @param c
	 */
	public void setCity(String c) {
		this.city = c;
	}

	/**
	 * Zip mutator.
	 * @param z
	 */
	public void setZip(String z) {
		this.zip = z;
	}

	/**
	 * State mutator.
	 * @param st
	 */
	public void setState(String st) {
		this.state = st;
	}

	/**
	 * Address line 1 accessor.
	 */
	public String getAddressLine1() {
		return this.addressLine1;
	}

	/**
	 * Address line 2 accessor.
	 */
	public String getAddressLine2() {
		return this.addressLine2;
	}

	/**
	 * City accessor.
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Zip accessor.
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * State accessor.
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * Returns the concatenated address as a string without address line 2 if it is not included to 
	 * prevent an additional space is address line 2 ends up being an empty string or null. Otherwise,
	 * all parts of the address are concatenated together and returned as a string.
	 */
	public String toString() {
		String addressString = " ";
		if (this.addressLine2.equals(" ")  || this.addressLine2.equals("") || this.addressLine2 == null) {
			addressString = this.addressLine1 + ", " + this.city + ", " + this.state + " " + this.zip;
		}
		else {
			addressString = this.addressLine1 + ", " + this.addressLine2 + ", " + this.city + ", " + this.state + " " + this.zip;
		}
		return addressString;
	}
}
