import java.text.NumberFormat;

/**
 * Door.java
 * @author Jeremy Krovitz
 * 
 * Represents a single door.
 */
public class Door {
	private Color color;
	private double price = 599.00;
	
	/**
	 * Constructor: sets up this door with a color.
	 * @param color
	 */
	public Door(Color color) {
		this.color = color;
	}
	
	/**
	 * Door price accessor.
	 * @return this.price
	 */
	public double getDoorPrice(){
		this.price = 599.00;
		return this.price;
	}
	
	/**
	 * Returns a description of the door that the customer
	 * selected as a string.
	 * @return doorString
	 */
	public String toString() {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		String doorString = "\nDoors: " + color.getColor() + " color, Price: "
		+ moneyFormat.format(this.price); 
		return doorString;
	}
}
