package apllication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("type number line: ");
		int x = sc.nextInt();
		System.out.println("Type number column");
		int y = sc.nextInt();
		
		int[][] mat = new int[x][y];
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c< mat[l].length; c++) {
//				System.out.println("passou");
				mat[l][c] = sc.nextInt();
			}
		}
		System.out.println("type number psition: ");
		int n = sc.nextInt();
		for(int l = 0; l<mat.length; l++) {
			for(int c=0; c< mat[l].length; c++) {
				if(mat[l][c] == n) {
					System.out.println("postion " + l +", "+ c+": "+ n );
					if(c>0) {
						System.out.println("Left: " + mat[l][c-1]);
					}
					if(l>0) {
						System.out.println("UP TSI " + mat[l-1][c]);
					}
					if(c< mat[l].length-1) {
						System.out.println("Right: " + mat[l][c+1]);
					}
					if(l< mat.length-1) {
						System.out.println("Down: " + mat[l+1][c]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
