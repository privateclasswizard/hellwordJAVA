package aula26java;

import java.util.Scanner;

public class aula26main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		System.out.println("digite uma mensagem:");
		s1 = sc.nextLine();
		System.out.println("digite outra mensagem:");
		s2 = sc.nextLine();
		System.out.println("digite mais uma mensagem:");
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
