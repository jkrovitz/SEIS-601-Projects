
public abstract class StaffMember implements IPayCalculator, ITaxCalculator{
	protected String name;
	protected String address;
	protected String phone;
	
	/**
	 * Constructor: sets up this staff member using the specified information.
	 */
	public StaffMember(String eName, String eAddress, String ePhone) {
		this.name = eName;
		this.address = eAddress;
		this.phone = ePhone;
	}
	
	/**
	 * Returns a string including the basic employee information.
	 */
	public String toString() {
		String result = "Name: " + name + "\n";
		
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
}
