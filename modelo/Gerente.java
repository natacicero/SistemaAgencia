package br.com.turmasi.modelo;

import br.com.turmasi.util.AutenticadorUtil;

public class Gerente extends Vendedor implements Autenticavel {
	
	private AutenticadorUtil autenticador;
	
	public Gerente(int matricula,String nome,double salarioBruto) {
		super(matricula,nome,salarioBruto);
		this.autenticador = new AutenticadorUtil();
	}
	
	@Override
	public double calcularComissao(double valorVendas) {
		return valorVendas * 0.005;
	}
	
	@Override
	public double calcularBonificacao(){
		return super.calcularBonificacao() + 500;
	}

	//Métodos Getters e Setters (Contrato da Interface)
		@Override
		public int getSenha() {
			return this.autenticador.getSenha();
		}
		
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}
	
}
