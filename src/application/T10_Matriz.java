package application;

import java.util.Locale;
import java.util.Scanner;

public class T10_Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre quantidade de linhas e colunas da matriz: ");
		int l = sc.nextInt();
		int c = sc.nextInt();

		int mat[][] = new int[l][c]; 
		
		sc.nextLine();		
		System.out.println("Entre com a matriz");
		
		for (int i=0; i < l; i++) {
			for (int j=0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		sc.nextLine();		
		System.out.print("Entre com valor para busca:");
		int v = sc.nextInt();
		int pi = -1;
		int pj = -1;
		
		for (int i=0;i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] == v) {
					pi = i;
					pj = j;
					break;
				}
			}
		}
	
		System.out.println("Posição: " + pi + ", " + pj);
		
		// left
		if (pj > 0) {
			System.out.println("Left: " + mat[pi][pj-1]);
		}
		
		// right
		if (pj < mat[pi].length -1) {
			System.out.println("Right: " + mat[pi][pj+1]);
		}
		
		// top
		if (pi > 0) {
			System.out.println("top: " + mat[pi-1][pj]);
		}
		
		// down
		if (pi < mat.length -1) {
			System.out.println("down: " + mat[pi+1][pj]);
		}
		
	}

}
