package Aula44package;

import java.util.Scanner;

public class aula44main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		
		int soma = 0 ;
		while(x != 0) {
			soma += x;
			x= sc.nextInt();
			
		}
	}

}
