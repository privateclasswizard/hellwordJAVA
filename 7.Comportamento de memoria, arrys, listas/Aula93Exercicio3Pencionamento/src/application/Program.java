package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("how many rooms will be retend? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<n; i++) {
			System.out.println("Rent #"+ i + " :");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Telefone: ");
			String telefone = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();			
			
			vect[roomNumber] = new Rent(name,email,telefone);
			
		}
		
		
		System.out.println();
		System.out.println("Busy roons");
		for(int i = 0; i< 10; i ++) {
			if(vect[i]!= null) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
