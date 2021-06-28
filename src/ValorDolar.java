import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ValorDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe preco do dolar: ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos dolares quer comprar?: ");
		double qtDolar = sc.nextDouble();
		
		System.out.print("");
		System.out.printf("Total a pagar em reais: %.2f", CurrencyConverter.currencyConverter(valorDolar, qtDolar));
		
		sc.close();

	}

}
