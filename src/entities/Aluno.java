package entities;

public class Aluno {

	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaTotal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public String resultado() {
		
		if (this.notaTotal() > 60.0) {
			return "APROVADO";
		} else {
			return "REPROVADO";
		}
		
	}
	
	public String toString() {
		
		String texto;
		
		texto =  "Nota final: " +  String.format("%.2f", this.notaTotal())
		      + "\n" + this.resultado();

		if (this.notaTotal() <= 60.0) {
			texto += "\n"  + "FALTANDO " + String.format("%.2f", 60 - this.notaTotal());
		}
		
		return texto;
	}
}
