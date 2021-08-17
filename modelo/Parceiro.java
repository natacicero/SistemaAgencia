package br.com.turmasi.modelo;

import br.com.turmasi.util.AutenticadorUtil;

public class Parceiro implements Autenticavel {
	
	private AutenticadorUtil autenticador;
	
	public Parceiro() {
		this.autenticador = new AutenticadorUtil();
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
