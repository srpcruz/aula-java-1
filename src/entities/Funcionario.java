package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double SalarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public void AumentoSalario(double percentagem) {
		this.salarioBruto += (percentagem / 100) * this.salarioBruto;
	}
	
	public String toString() {
		return this.nome
			 + ", $" + String.format("%.2f", SalarioLiquido());
	}
}
