package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class DadosFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		f.imposto = sc.nextDouble();
		
		System.out.println("");		
		System.out.println("Funcionario: " + f);
		
		System.out.println("");
		System.out.print("Com percentual de aumento: ");
		double perc = sc.nextDouble();
		f.AumentoSalario(perc);
		
		System.out.println("");
		System.out.println("Salario atualizado: " + f);
		
		sc.close();
	}

}
