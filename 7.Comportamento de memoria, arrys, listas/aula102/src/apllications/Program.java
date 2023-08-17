package apllications;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero :");
		int n =sc.nextInt();
		int [][] mat  = new int[n][n];
		
		for(int l = 0; l <mat.length ; l ++) {
			for(int c =0; c < mat[l].length ; c ++) {
				mat [l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i <mat.length ; i++) {
			System.out.println(mat [i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int l = 0; l<mat.length;l++) {
			for (int c = 0; c<mat[l].length ; c++) {
				if(mat[l][c]<0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		
		System.out.println();
		for(int l = 0; l <mat.length ; l ++) {
			for(int c =0; c < mat[l].length  ; c ++) {		
				System.out.println(mat[l][c]); 
			}
		}
		sc.close();
	}

}
