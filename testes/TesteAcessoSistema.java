package br.com.turmasi.testes;

import br.com.turmasi.modelo.Gerente;
import br.com.turmasi.modelo.Parceiro;
import br.com.turmasi.modelo.VendedorNivel1;
import br.com.turmasi.sistema.SistemaInterno;

public class TesteAcessoSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(3010,"Domenico Geoge",6500);
		gerente.setSenha(1234);
		
		VendedorNivel1 vendedor = new VendedorNivel1(2010,"Francisco Lopes",3000);
		vendedor.setSenha(1234);
		
		Parceiro parceiro = new Parceiro();
		parceiro.setSenha(1234);
		
		SistemaInterno si = new SistemaInterno();
		si.loginRestrito(gerente);
		si.loginRestrito(vendedor);
		si.loginRestrito(parceiro);		

	}

}
