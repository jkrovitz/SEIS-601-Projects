import java.text.NumberFormat;

/**
 * Hood.java
 * @author Jeremy Krovitz
 * 
 * Represents a single hood.
 */
public class Hood {
		
	private HoodType hoodType;
	private Color color;
	private double price;
	
	/**
	 * Constructor: sets up this hood with a hood type
	 * and a color.
	 * @param hoodType
	 * @param color
	 */
	public Hood(HoodType hoodType, Color color) {
		this.hoodType = hoodType;
		this.color = color;
	}
	
	/**
	 * Hood price accessor.
	 * @return this.price
	 */
	public double getHoodPrice() {
		switch(hoodType) {
		case REGULAR:
			this.price = 499.00;
			break;
		case SPORTS:
			this.price = 599.00;
			break;
		case LIFTED:
			this.price = 699.00;
			break;
		case NONE:
			this.price = 0.00;
			break;
		}
		return this.price;
	}
	
	/**
	 * Returns a description of the hood that the customer selected.
	 * @return hoodString
	 */
	public String toString() {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		String hoodString;
		if (this.color == null) {
			hoodString = "\nHood: " + hoodType.getHoodType() + 
					", Price: " + moneyFormat.format(this.getHoodPrice());
		}
		else {
			hoodString = "\nHood: " + hoodType.getHoodType() + 
					" in " + color.getColor() + ", Price: " + moneyFormat.format(this.getHoodPrice());
		}
		
		return hoodString;
	}
}
