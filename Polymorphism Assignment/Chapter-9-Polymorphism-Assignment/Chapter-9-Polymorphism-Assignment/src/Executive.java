import java.text.NumberFormat;

public class Executive extends Employee{
	private double bonus;

	/**
	 * Constructor: sets up this executive with the specified info.
	 */
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.bonus = 0; // bonus has yet to be awarded
	}
	
	/**
	 * Awards the specified bonus to this executive.
	 */
	public void awardBonus(double execBonus) {
		this.bonus = execBonus;
	}
	
	@Override
	public String toString() {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		String result = super.toString();
		
		result += "\n\nPay rate before bonus: " + money.format(this.payRate);
		result += "\nBonus amount: " + money.format(this.bonus);

		return result;
	}
	
	/**
	 * Computes and returns the pay for an executive, which is the regular employee payment plus a one-time bonus.
	 */
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
