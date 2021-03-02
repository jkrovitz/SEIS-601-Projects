import java.text.NumberFormat;

/**
 * Wheelset.java
 * @author Jeremy Krovitz
 * 
 * Represents a single wheelset.
 */
public class Wheelset {

	private double price;
	private WheelsetType wheelsetType;

	/**
	 * Constructor: sets up this wheelset with a wheelsetType 
	 * and a price.
	 * @param wheelsetType
	 * @param price
	 */
	public Wheelset(WheelsetType wheelsetType, double price) {
		this.wheelsetType = wheelsetType;
		this.price = price;
	}

	/**
	 * Wheelset price accessor.
	 * @return this.price
	 */
	public double getWheelsetPrice() {
		switch(this.wheelsetType) {
		case POWDER_COATED, PAINT_COATED, CLEAR_COATED, CHROME_PLATED, BARE_POLISHED:
			this.price = 1299.00;
			break;
		default: 
			this.price = 0.0;
			break;
		}
		return this.price;
	}

	/**
	 * Returns a description of the wheelset that the customer
	 * selected as a string.
	 * @return wheelsetString
	 */
	public String toString() {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		String wheelsetString = "\nWheelset: " + wheelsetType.getWheelsetType() + ", Price: " + moneyFormat.format(this.getWheelsetPrice());
		return wheelsetString;
	}
}
