/**
 * Vehicle.java
 * @author Jeremy Krovitz
 *
 * Represents a single vehicle.
 */
public class Vehicle {
	
	private String vehicleMake;
	private String vehicleModel;
	private String year;
	private Hood hood;
	private Fender fender;
	private Door door;
	private Wheelset wheelset;
	private Double totalPrice;
	
	/**
	 * Constructor: sets up this vehicle with a make, model, year, hood, fender, door, and wheelset.
	 * @param vehicleMake
	 * @param vehicleModel
	 * @param year
	 * @param hood
	 * @param fender
	 * @param door
	 * @param wheelset
	 */
	public Vehicle (String vehicleMake, String vehicleModel, String year, Hood hood, Fender fender, Door door, Wheelset wheelset) {
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.year = year;
		this.hood = hood;
		this.fender = fender;
		this.door = door;
		this.wheelset = wheelset;
	}
	
	/** 
	 * Constructor: sets up this vehicle with a a make, model, year, fender, door, and wheelset.
	 * This constructor is for a vehicle without a hood.
	 * @param vehicleMake
	 * @param vehicleModel
	 * @param year
	 * @param fender
	 * @param door
	 * @param wheelset
	 */
	public Vehicle (String vehicleMake, String vehicleModel, String year, Fender fender, Door door, Wheelset wheelset) {
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.year = year;
		this.fender = fender;
		this.door = door;
		this.wheelset = wheelset;
	}
	
	/**
	 * The vehicle price accessor adds up the price for each of the parts of the vehicle and returns the total Price.
	 * @return this.totalPrice
	 */
	public Double getTotalPrice() {
		if (this.hood == null) {
			this.totalPrice = fender.getFenderPrice() + door.getDoorPrice() + wheelset.getWheelsetPrice();
		}
		else {
			this.totalPrice = hood.getHoodPrice() + fender.getFenderPrice() + door.getDoorPrice() + wheelset.getWheelsetPrice();
		}
		return this.totalPrice;
	}
	
	/**
	 * Returns a description of the car that the customer 
	 * selected as a string.
	 * @return vehicleString
	 */
	public String toString() {
		String vehicleString;
		if (this.hood == null) {
			vehicleString = "Make: " + this.vehicleMake + 
					"\nModel: " + this.vehicleModel + "\nYear: " +
					this.year + "\n\nCustomer selected the following options:\n"
					+ fender.toString() + door.toString() + wheelset.toString();
		}
		else {
			vehicleString = "Make: " + this.vehicleMake + 
					"\nModel: " + this.vehicleModel + "\nYear: " +
					this.year + "\n\nCustomer selected the following options:\n"
					+  hood.toString() + fender.toString() +
					door.toString() + wheelset.toString();			
		}
		return vehicleString;
	}
}
