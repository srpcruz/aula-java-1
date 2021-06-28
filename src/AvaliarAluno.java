import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AvaliarAluno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.print("Nome do aluno: ");
		a.nome = sc.nextLine();
		System.out.println("Entre as notas: ");
		a.nota1 = sc.nextDouble();
		System.out.print("");
		a.nota2 = sc.nextDouble();
		System.out.print("");
		a.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(a);

//		System.out.println(a.resultado());

		sc.close();
		
	}

}
