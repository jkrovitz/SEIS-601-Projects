import java.text.NumberFormat;

/**
 * Fender.java
 * @author Jeremy Krovitz
 * 
 * Represents a single fender.
 */
public class Fender {
	
	private Color color;
	private double price;
	private FenderType fenderType;

	/**
	 * Constructor: sets up this fender with a fenderType
	 * and a color.
	 * @param fenderType
	 * @param color
	 */
	public Fender(FenderType fenderType, Color color) {
		this.fenderType = fenderType;
		this.color = color;
	}

	/**
	 * Fender price accessor.
	 * @return this.price
	 */
	public double getFenderPrice() {
		switch(this.fenderType) {
			case REGULAR:
				this.price = 100.00;
				break;
			case SPORTS:
				this.price = 200.00;
				break;
			case CARBON_FIBER:
				this.price = 1000.00;
		}
		return this.price;
	}

	/**
	 * Returns a description of the fender that the customer
	 * selected.
	 * @return fenderString
	 */
	public String toString() {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		String fenderString = "\nFender: " + fenderType.getFenderType() + 
				" in " + color.getColor() + ", Price: " + moneyFormat.format(this.getFenderPrice());
		return fenderString;
	}
}
