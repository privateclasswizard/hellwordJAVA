package aula39package;

import java.util.Scanner;

public class aula39main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double preço;
			double desconto;
			System.out.println("digite o preço");
			preço = sc.nextDouble();
			desconto = (preço < 20.0) ? preço * 0.1 :preço * 0.05;
			System.out.println(desconto);
		}
	}

}
