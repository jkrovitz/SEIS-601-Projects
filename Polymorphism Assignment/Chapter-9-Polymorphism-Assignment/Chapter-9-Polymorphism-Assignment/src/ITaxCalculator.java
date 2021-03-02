
public interface ITaxCalculator {
	
	public static double calculateTax(double pay, double taxBracket) {
		return pay * taxBracket;
	}
 
}
