package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class DadosRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		System.out.println("Entre largura e altura do retangulo:");
		x.largura = sc.nextDouble();
		x.altura  = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n" , x.area());
		System.out.printf("Perimetro: %.2f%n" , x.perimetro());
		System.out.printf("Diagonal: %.2f%n" , x.diagonal());
	
		sc.close();
		
	}

}
