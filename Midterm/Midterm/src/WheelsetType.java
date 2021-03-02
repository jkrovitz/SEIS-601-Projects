/**
 * WheelsetType.java		Enumerator
 * 
 * @author Jeremy Krovitz
 * 
 * Wheelset types that the customer can select for their car.
 */
public enum WheelsetType {
	POWDER_COATED ("Powder-coated"), 
	PAINT_COATED ("Paint-coated"), 
	CLEAR_COATED ("Clear-coated"),
	CHROME_PLATED ("Chrome-plated"),
	BARE_POLISHED ("Bare-polished"),
	NOT_SELECTED ("Not-selected");

	private String wheelsetType;

	/*
	 * Constructor: sets the wheelsetType as a String argument for each 
	 * of the enum wheelsetType constants. The enum constructor is private
	 * because you cannot invoke the enum constructor, as its
	 * constants are already defined.
	 * 
	 * @param wheelsetType
	 */
	private WheelsetType(String wheelsetType) {
		this.wheelsetType = wheelsetType;
	}

	/**
	 * WheelsetType mutator.
	 * @param wheelsetType
	 */
	public void setWheelsetType(String wheelsetType) {
		this.wheelsetType = wheelsetType;
	}

	/**
	 * WheelsetType accessor.
	 * @return this.wheelsetType
	 */
	public String getWheelsetType() {
		return this.wheelsetType;
	}
}
