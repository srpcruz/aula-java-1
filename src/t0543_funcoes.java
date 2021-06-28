import java.util.Locale;
import java.util.Scanner;

public class t0543_funcoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = maxHigher(a, b, c);
		
		imprimirMaior(higher);		
		
		sc.close();
		
	}

	public static int maxHigher(int x, int y, int z) {
		
		int aux = 0;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void imprimirMaior(int valor) {
		
		System.out.println("Valor maior e: " + valor);
		
	}
}
