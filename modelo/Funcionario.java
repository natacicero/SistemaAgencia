package br.com.turmasi.modelo;

public abstract class Funcionario {
	//Propriedades ou M�todos
	private int matricula;
	private String nome;
	private double salarioBruto;
	
	//M�todo
	public double calcularBonificacao(){
		return this.salarioBruto * 0.05;
	}
	
	//Sobreescrevendo o m�todo toString()
	
	  @Override
	public String toString() {
		  
		  String funcionarioPadrao = "matricula: " + this.matricula+
				  					"\nNome: " + this.nome +
				  					"\nSal�rio Bruto: " + this.salarioBruto +
				  					"\nBonifica��o: " + this.calcularBonificacao();
	return funcionarioPadrao;
	} 
	
	//M�todos Getters e Setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
}
