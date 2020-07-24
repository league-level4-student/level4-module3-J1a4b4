package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double numerator, double denominator) throws IllegalArgumentException {
		if (denominator == 0.0) {
			throw new IllegalArgumentException();
		}
		double quotient = numerator / denominator;
		return quotient;
	}
	
	public String reverseString(String str) throws IllegalStateException {
		if (str.isEmpty()) {
			throw new IllegalStateException();
		}
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i++) {
			reversedString = reversedString + str.charAt(i);
		}
		return reversedString;
	}
}
