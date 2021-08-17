package br.com.turmasi.modelo;

public abstract class Funcionario {
	//Propriedades ou Métodos
	private int matricula;
	private String nome;
	private double salarioBruto;
	
	//Método
	public double calcularBonificacao(){
		return this.salarioBruto * 0.05;
	}
	
	//Sobreescrevendo o método toString()
	
	  @Override
	public String toString() {
		  
		  String funcionarioPadrao = "matricula: " + this.matricula+
				  					"\nNome: " + this.nome +
				  					"\nSalário Bruto: " + this.salarioBruto +
				  					"\nBonificação: " + this.calcularBonificacao();
	return funcionarioPadrao;
	} 
	
	//Métodos Getters e Setters
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
