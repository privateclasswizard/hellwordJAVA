//import java.util.Locale;

public class primeiroprogramaMain {

	public static void main(String[] args) {
		//System.out.print("Olá mundo");
		//System.out.println("vc é feio");
		
		
		String nome= "Douglas";
		int idade = 22;
		double renda = 1634.8;
		int y = 32;
		double x = 13.8998;
		
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.lineSeparator();
		System.out.print("Use os produtos evone");
		//Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = "+ x +"Metros");
		System.out.printf("Reustado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, renda);
	
	}

}
