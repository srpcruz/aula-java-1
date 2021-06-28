package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioLista;

public class FuncionarioL {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FuncionarioLista f ;
		
		List <FuncionarioLista> funcList = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			
			f = new FuncionarioLista(id, nome, salario);
			
			funcList.add(f);
			
		}
		
	
		System.out.println("");
		System.out.print("Entre id funcionario que terá aumento no salario: ");
		int idAumento = sc.nextInt();
		sc.nextLine();

		FuncionarioLista emp = funcList.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Funcionario nao existe");			
		} else {
			System.out.print("Entre o percentual: ");
			Double perc = sc.nextDouble();
			emp.aumentarSalario(perc);
		}

		System.out.println("");
		for (FuncionarioLista xfun : funcList) {
				System.out.println(xfun.getId() 
						+ ": " 
						+ xfun.getNome() 
						+ ", " 
						+ String.format("%.2f", xfun.getSalary()) );
		}
		
		sc.close();
		
	}

}
