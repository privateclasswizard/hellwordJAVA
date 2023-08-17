import java.util.Scanner;

public class Aul25main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*double x;
		System.out.println("Digite um numero: ");
		x = sc.nextDouble(); // next() string; nextInt() inteiro; nextDouble() ou nextFloat() para numero flotuante
		System.out.println("Voce digitou o vlaor de: " + x); //com ponto
		System.out.printf("Voce digitou o vlaor de: %.1f%n",  x); //com virgula por causa do locale
		sc.close();
		*/
//		char x;
//		System.out.println("Digite um caracter: ");
//		x = sc.next().charAt(0);
//		System.out.printf("Voce digitou o caracter de %c",  x);
		
		String c;
		int d;
		double e;
		c = sc.next();
		d = sc.nextInt();
		e = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
