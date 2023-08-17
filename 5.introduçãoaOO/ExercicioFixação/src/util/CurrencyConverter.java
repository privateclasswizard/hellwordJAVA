package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double dollarTotal(double amout, double dollarprice) {
		return amout * dollarprice *(1.0 + IOF);
		
	
	}
	
}
