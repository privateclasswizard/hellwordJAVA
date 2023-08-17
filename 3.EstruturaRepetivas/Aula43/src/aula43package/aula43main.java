package aula43package;

import java.util.Locale;
import java.util.Scanner;

public class aula43main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("escreva largura");
		double largura = sc.nextDouble();
		System.out.println("escreva metro quadrado");
		double comprimento = sc.nextDouble();
		System.out.println("escreva valor do metro quadrado");
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}
