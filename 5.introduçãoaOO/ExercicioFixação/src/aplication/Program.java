package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the  dollar price?");
		double dollarprince = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarTotal(amount, dollarprince);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}

}
