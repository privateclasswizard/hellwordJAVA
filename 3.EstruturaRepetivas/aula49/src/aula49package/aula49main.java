package aula49package;

import java.util.Scanner;

public class aula49main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int soma = 0;
		for(int i = 0; i< n; i++) {
			int x = scn.nextInt();
			soma += x;
		}
		System.out.println(soma);
	}

}
