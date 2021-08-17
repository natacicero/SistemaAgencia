 package br.com.turmasi.testes;

import br.com.turmasi.modelo.Gerente;
import br.com.turmasi.modelo.Venda;
import br.com.turmasi.modelo.Carro;
import br.com.turmasi.modelo.VendedorNivel1;
import br.com.turmasi.modelo.VendedorNivel2;
import br.com.turmasi.modelo.VendedorNivel3;

public class TesteNiveisVendedores {

	public static void main(String[] args) {
		
		//Carros da Agência
		Carro fox = new Carro("VW","Fox","Preto",25000);
		Carro cobalt = new Carro("Chevrolet","Cobalt","Chumbo",45000);
		Carro mobi = new Carro("Fiat","Mobi","Vermelho",27000);
		Carro doblo = new Carro("Fiat","Doblo","Prata",54000);
		Carro eco = new Carro("Ford","Eco Sport","Amarelo",56000);
		
		//Vendedores da Agência
		VendedorNivel1 vendn1 = new VendedorNivel1(2010,"Francisca Vieira",3000);
		VendedorNivel2 vendn2 = new VendedorNivel2(2020,"Pedro Guilherme",3000);
		VendedorNivel3 vendn3 = new VendedorNivel3(2030,"Flaviana Nunes",3000);
		Gerente ger = new Gerente(3010,"Domenico George",6500);
		
		//VENDAS DOS CARROS
		Venda[] vendas = new Venda[5];
		vendas[0] = new Venda();
		vendas[0].registravenda(vendn1, fox);
		
		vendas[1] = new Venda();
		vendas[1].registravenda(vendn1, mobi);
		
		vendas[2] = new Venda();
		vendas[2].registravenda(vendn3, cobalt);
		
		vendas[3] = new Venda();
		vendas[3].registravenda(vendn2, eco);
		
		vendas[4] = new Venda();
		vendas[4].registravenda(vendn2, doblo);
		
		System.out.println("=========================RELATÓRIO DE VENDAS=================================");
		System.out.println("Vendedor Nivel1 (Matricula/Nome/Carro/Valor):"  +
				vendas[0].getVendedor().getMatricula()+"/" +
				vendas[0].getVendedor().getNome()+"/" +
				vendas[0].getCarro().getModelo()+ "/" + 
				vendas[0].getCarro().getPreco());
		
		System.out.println("Vendedor Nivel1 (Matricula/Nome/Carro/Valor):"  +
				vendas[1].getVendedor().getMatricula()+"/" +
				vendas[1].getVendedor().getNome()+"/" +
				vendas[1].getCarro().getModelo()+ "/" + 
				vendas[1].getCarro().getPreco());
		
		System.out.println("Vendedor Nivel3 (Matricula/Nome/Carro/Valor):"  +
				vendas[2].getVendedor().getMatricula()+"/" +
				vendas[2].getVendedor().getNome()+"/" +
				vendas[2].getCarro().getModelo()+ "/" + 
				vendas[2].getCarro().getPreco());
		
		System.out.println("Vendedor Nivel2 (Matricula/Nome/Carro/Valor):"  +
				vendas[3].getVendedor().getMatricula()+"/" +
				vendas[3].getVendedor().getNome()+"/" +
				vendas[3].getCarro().getModelo()+ "/" + 
				vendas[3].getCarro().getPreco());
		
		System.out.println("Vendedor Nivel2 (Matricula/Nome/Carro/Valor):"  +
				vendas[4].getVendedor().getMatricula()+"/" +
				vendas[4].getVendedor().getNome()+"/" +
				vendas[4].getCarro().getModelo()+ "/" + 
				vendas[4].getCarro().getPreco());
		System.out.println("**************************************************************");
		System.out.println("Total em Vendas: " + Venda.getVendaTotal());
		System.out.println();
	
		System.out.println("------ VENDEDOR NÍVEL 1 ------------");
		System.out.println(vendn1);
		
		double valorVendas=0;
		for(int i=0;i<vendas.length;i++) {
		
			if(vendn1 == vendas[i].getVendedor()) {
			valorVendas += vendas[i].getCarro().getPreco();	
			}
		}
		
		System.out.println("ValorVendas =============>" + valorVendas);
		System.out.println("Comissão: " + vendn1.calcularComissao(valorVendas));
		System.out.println("Salário + Bonificação + Comissão: " + (vendn1.getSalarioBruto() + vendn1.calcularBonificacao() + vendn1.calcularComissao(valorVendas)));
		
		System.out.println();
		
		System.out.println("------ VENDEDOR NÍVEL 2 ------------");
		System.out.println(vendn2);
		
		valorVendas=0;
		for(int i=0;i<vendas.length;i++) {
		
			if(vendn2 == vendas[i].getVendedor()) {
			valorVendas += vendas[i].getCarro().getPreco();	
			}
		}
		
		System.out.println("ValorVendas =============>" + valorVendas);
		System.out.println("Comissão: " + vendn2.calcularComissao(valorVendas));
		System.out.println("Salário + Bonificação + Comissão: " + (vendn2.getSalarioBruto() + vendn2.calcularBonificacao() + vendn2.calcularComissao(valorVendas)));
		
		System.out.println();
		
		System.out.println("------ VENDEDOR NÍVEL 3 ------------");
		System.out.println(vendn3);
		
		valorVendas=0;
		for(int i=0;i<vendas.length;i++) {
		
			if(vendn3 == vendas[i].getVendedor()) {
			valorVendas += vendas[i].getCarro().getPreco();	
			}
		}
		
		System.out.println("ValorVendas =============>" + valorVendas);
		System.out.println("Comissão: " + vendn1.calcularComissao(valorVendas));
		System.out.println("Salário + Bonificação + Comissão: " + (vendn3.getSalarioBruto() + vendn3.calcularBonificacao() + vendn3.calcularComissao(valorVendas)));
		
		System.out.println();
		
		System.out.println("------ GERENTE ------------");
		System.out.println(ger);
		System.out.println("Comissão: " + ger.calcularComissao(Venda.getVendaTotal()));
		System.out.println("Salário + Bonificação + Comissão: " + (ger.getSalarioBruto() + ger.calcularBonificacao() + ger.calcularComissao(Venda.getVendaTotal())));

	}

}
