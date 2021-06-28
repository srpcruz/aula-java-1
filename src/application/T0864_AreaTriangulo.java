package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class T0864_AreaTriangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x , y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe os lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Informe os lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n" , areaX);
		System.out.printf("Triangulo Y area: %.4f%n" , areaY);
		
		System.out.println( areaX > areaY ? "Maior area: X" : "Maior area: Y");

		
		sc.close();
		
	}

}
