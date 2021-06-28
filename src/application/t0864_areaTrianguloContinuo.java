package application;
import java.util.Locale;
import java.util.Scanner;

public class t0864_areaTrianguloContinuo {

	public static void main(String[] args) {

	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os lados do triangulo X:");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();

		double xp = (xa + xb + xc) / 2;
		
		double x = Math.sqrt(xp*(xp - xa)*(xp - xb)*(xp - xc));
		
		System.out.println("Informe os lados do triangulo Y:");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();

		double yp = (ya + yb + yc) / 2.0 ;
		
		double y = Math.sqrt(yp*(yp - ya)*(yp - yb)*(yp - yc));
		
		System.out.printf("Triangulo X area: %.4f%n" , x);
		System.out.printf("Triangulo Y area: %.4f%n" , y);
		
		System.out.println( x > y ? "Maior area: X" : "Maior area: Y");

		
		sc.close();
		
	}

}
