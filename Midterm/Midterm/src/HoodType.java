/**
 * HoodType.java		Enumerator
 * @author Jeremy Krovitz
 * 
 * Hood types that the customer can select for their car.
 */
public enum HoodType {
		REGULAR ("Regular"),
		SPORTS ("Sports"),
		LIFTED ("Lifted"),
		NONE ("None");

	private String hoodType;

	/*
	 * Constructor: sets the hoodType as a String argument for each 
	 * of the enum hoodType constants. The enum constructor is private
	 * because you cannot invoke the enum constructor, as its
	 * constants are already defined.
	 * 
	 * @param hoodType
	 */
	private HoodType(String hoodType) {
		this.hoodType = hoodType;
	}

	/**
	 * hoodType mutator.
	 * @param hoodType
	 */
	public void setHoodType(String hoodType) {
		this.hoodType = hoodType;
	}

	/**
	 * hoodType accessor.
	 * @return hoodType
	 */
	public String getHoodType() {
		return this.hoodType;
	}
}
