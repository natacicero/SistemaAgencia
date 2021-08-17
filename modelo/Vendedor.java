package br.com.turmasi.modelo;

public abstract class Vendedor extends Funcionario {
	
	public Vendedor(int matricula,String nome,double salarioBruto) {
		super.setMatricula(matricula);
		super.setNome(nome);
		super.setSalarioBruto(salarioBruto);
	}
	
	public abstract double calcularComissao(double valorVendas);
		
	}

