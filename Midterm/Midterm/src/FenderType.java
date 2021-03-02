/**
 * FenderType.java		Enumerator
 * @author Jeremy Krovitz
 *
 * Fender types that a customer can select for their car.
 */
public enum FenderType {
		REGULAR ("Regular"),
		SPORTS ("Sports"),
		CARBON_FIBER ("Carbon Fiber");
	
	private String fenderType;

	/*
	 * Constructor: sets the fenderType as a String argument for each 
	 * of the enum fenderType constants. The enum constructor is private
	 * because you cannot invoke the enum constructor, as its
	 * constants are already defined.
	 * 
	 * @param fenderType
	 */
	private FenderType(String fenderType) {
		this.fenderType = fenderType;
	}

	/**
	 * fenderType mutator.
	 * @param fenderType
	 */
	public void setFenderType(String fenderType) {
		this.fenderType = fenderType;
	}

	/**
	 * fenderType accessor.
	 * @return this.fenderType
	 */
	public String getFenderType() {
		return this.fenderType;
	}
}
