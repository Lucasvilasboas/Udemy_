package util;

public class conta {
	private int numero_conta;
	private String nome;
	private double saldo;
	public double teste;
	public conta(int numero_conta, String nome, double saldo) {
		this.numero_conta = numero_conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public conta() {
		
	}
	
	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double Setdeposito(double deposito) {
		return this.saldo = saldo + deposito;
	}
	public double Setsaque(double saque) {
	return this.saldo = saldo -saque -5.00;
	
}
	}
