package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class T0867_Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre dados do produto: ");
		System.out.print("Nome:");
		String name = sc.nextLine();

		System.out.print("Preco: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);		
		
		System.out.println("Dados do produto: " + product);
		
		System.out.println("");
		System.out.print("Quantidade a ser adicionada: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Produto atualizado: " + product);
		
		System.out.println("");
		System.out.print("Quantidade a ser removida: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Produto atualizado: " + product);
		
		System.out.println("---------------");
		System.out.print("Alterando descricao: ");
		String novoNome  = "computer";
		System.out.println(novoNome);

		System.out.println(" ");
		product.setName(novoNome);
		System.out.println("Novo nome : " + product.getName());
		System.out.println("Produto atualizado: " + product);
		
		sc.close();
		
	}

}
