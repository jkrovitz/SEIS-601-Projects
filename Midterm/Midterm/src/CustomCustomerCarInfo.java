import java.text.NumberFormat;

/**
 * CustomCustomerCarInfo.java
 * @author Jeremy Krovitz
 * 
 * Driver class to print customers, the cars each selects, and the price. 
 */
public class CustomCustomerCarInfo {
	
	/**
	 * Passes arugments to three helper methods to print information
	 * about the two customers, the cars they select, and the price.
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Customer 1:\n");
		printCustomer("Syed", "Ali", "Naqvi", "651-456-7890", "12345 Good Ave", "Number 1", "Hastings", "MN", "55022");
		
		Vehicle vehicle1 = printVehicle("Tesla", "Model 3", "2019", HoodType.LIFTED, Color.SILVER, FenderType.CARBON_FIBER,
				Color.BLACK, Color.BLACK, WheelsetType.PAINT_COATED, 1299.00);
		
		printTotalPrice(vehicle1);
		
		System.out.println("\n--------------------------------------------------------\n");
		
		System.out.println("Customer 2:\n");
		printCustomer("Gloria", "J", "Redford", "612-0987-6543", "499 Apple Street", "", "Eagan", "MN", "55123");
		
		Vehicle vehicle2 = printVehicle("Ford", "F150", "2016", HoodType.NONE, null, FenderType.CARBON_FIBER, Color.BLACK, 
				Color.YELLOW, WheelsetType.POWDER_COATED, 1299.00);
		
		printTotalPrice(vehicle2);
	}
	
	/*
	 * Support method where an address and customer object are instantiated and
	 * printed.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param customerPhone
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param zip
	 */
	private static void printCustomer(String firstName, String middleName, String lastName, String customerPhone,
			String addressLine1, String addressLine2, String city, String state, String zip) {
		Address customerAddress = new Address(addressLine1, addressLine2, city, state, zip);
		Customer customer = new Customer(firstName, middleName, lastName, customerPhone, customerAddress);
		System.out.println(customer);
	}
	
	/*
	 * Support method where the fender, door, wheelset, and hood of a vehicle 
	 * are instantiated and passed to the vehicle constructor. The vehicle 
	 * constructor is then instantiated, and the vehicle object is printed.
	 * @param make
	 * @param model
	 * @param year
	 * @param hoodType
	 * @param hoodColor
	 * @param fenderType
	 * @param fenderColor
	 * @param doorColor
	 * @param wheelsetType
	 * @param wheelsetPrice
	 * @return vehicle
	 */
	private static Vehicle printVehicle(String make, String model, String year, HoodType hoodType, Color hoodColor,
			FenderType fenderType, Color fenderColor, Color doorColor, WheelsetType wheelsetType,
			double wheelsetPrice) {
		
		Vehicle vehicle;
		Fender fender = new Fender(fenderType, fenderColor);
		Door door = new Door(doorColor);
		Wheelset wheelset = new Wheelset(wheelsetType, wheelsetPrice);
		Hood hood = new Hood(hoodType, hoodColor);
		
		if (hoodColor == null) {
			vehicle = new Vehicle(make, model, year, fender, door, wheelset);
		}
		else {
			vehicle = new Vehicle(make, model, year, hood, fender, door, wheelset);
		}
		System.out.println(vehicle);
		return vehicle;
	}
	
	/*
	 * Support method that calls the getTotalPrice method of the vehicle
	 * object as well as formats and prints the total price of the vehicle.
	 * @param vehicle
	 * @return totalPrice
	 */
	private static String printTotalPrice(Vehicle vehicle) {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		String totalPrice = moneyFormat.format(vehicle.getTotalPrice());
		totalPrice = "\nTotal Price: " + totalPrice;
		System.out.println(totalPrice);
		return totalPrice;
	}

}
