
public class aula27main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		double delta;
		double x1;
		double x2;
		A = Math.sqrt(x); // sqrt = raiz quadrada
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);	// pow = potenciação
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);	//abs = valor absoluto
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		delta= Math.pow(B,20) -4*A*C;
		System.out.println(delta);
		x1 = (-B + Math.sqrt(delta))/(2.0*A);
		x2 = (-B - Math.sqrt(delta))/(2.0*A);
		System.out.printf("valor de x%n x1 = %f.2 %n x2 = %f.2", x1, x2);
	}

}
