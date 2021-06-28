package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ManteContaBancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciado aqui para não ficar no IF pois variaveis criadas no IF não são vista fora dele...
		ContaBancaria conta;

		System.out.println("Entre dados da conta bancaria: ");
		System.out.print("Conta: ");
		int numeroContaBancaria = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.next();
		System.out.print("Existe deposito inicial (Y-sim)? ");
		char depInicial = sc.next().charAt(0);
		
		double saldoInicial = 0;
		
		if (depInicial == 'y' || depInicial == 'Y') {
			System.out.print("Entre o saldo inicial: ");
			saldoInicial = sc.nextDouble();
			conta = new ContaBancaria(numeroContaBancaria, nome, saldoInicial);
		} else {
			conta = new ContaBancaria(numeroContaBancaria, nome);
		};
		
		System.out.println(""); 
		
		System.out.println("Dados da conta: ");
		System.out.println(conta) ;

		
		System.out.println("");
		
		System.out.print("Entre valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Saldo atualizado: ");
		System.out.println(conta) ;

		System.out.println("");
		
		System.out.print("Entre valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Saldo atualizado: ");
		System.out.println(conta) ;		
		
		sc.close();

		
	}

}
