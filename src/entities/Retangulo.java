package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return this.largura * this.altura;
	}
	
	public double perimetro() {
		return (this.largura * 2) + (this.altura * 2);
	}
	
	public double diagonal() {
		return Math.sqrt( Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
	}

}
