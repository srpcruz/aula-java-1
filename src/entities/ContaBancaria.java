package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nome;
	private double saldo;
	private static final double taxa = 5.0;
	
	public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(saldoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nomeo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor + taxa);
	}
	
	public String toString() {
		return  "Conta: " 
				+ this.getNumeroConta()
				+ ", Correntista: "
				+ this.getNome()
				+ ", Saldo: $"
				+ String.format("%.2f" , this.getSaldo());

	}
}
