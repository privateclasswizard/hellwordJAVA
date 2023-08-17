public class ExerciciodeFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double prince1 = 2100.0;
		double prince2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s , shice prince is %f %n", product1, prince1);
		System.out.printf("%s , shice prince is %f %n", product2, prince2);
		System.out.println(" ");
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal place: %.8f%n", measure);
		System.out.printf("Rouded(three decimal places: %.4f%n", measure);
		System.out.printf("Us decimal point: %.3f%n", measure);
	}

}
