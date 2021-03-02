/**
 * Color.java	Enumerator
 * 
 * @author Jeremy Krovitz
 * 
 * Colors that can be selected for the fender,
 * door, and / or hood of the car.
 */
public enum Color {
	RED ("Red"),
	BLUE ("Blue"),
	BLACK ("Black"),
	SILVER ("Silver"),
	GREEN ("Green"),
	YELLOW ("Yellow");

	private String color;

	/*
	 * Constructor: sets the color as a String argument for each 
	 * of the enum color constants. The enum constructor is private
	 * because you cannot invoke the enum constructor, as its
	 * constants are already defined.
	 * 
	 * @param color
	 */
	private Color(String color) {
		this.color = color;
	}

	/**
	 * Color mutator.
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Color accessor.
	 * @return this.color
	 */
	public String getColor() {
		return this.color;
	}
}
