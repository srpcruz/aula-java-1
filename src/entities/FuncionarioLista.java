package entities;

public class FuncionarioLista {

	private Integer id;
	private String nome;
	private Double salary;
	
	public FuncionarioLista(Integer id, String nome, Double salary) {
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void aumentarSalario(double perc) {
		this.salary *= (1 + perc / 100);
	}
	
}
