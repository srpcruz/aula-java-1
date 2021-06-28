package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class ReservaQuartos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];
		
		System.out.print("Quantos quartos serao alugados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Rent #" + i + ": ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int nQuarto = sc.nextInt();
			sc.nextLine();
			
			Quartos q = new Quartos(nome, email, nQuarto);
			
			vect[nQuarto] = q;
			
		}
		
		System.out.println("");
		System.out.println("Quartos ocupados:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getNumQuarto() 
						+ ": " 
						+ vect[i].getNome() 
						+ ", " 
						+ vect[i].getEmail() );
			}
		}
		
		sc.close();
		
	}

}
