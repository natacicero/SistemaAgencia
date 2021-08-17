package br.com.turmasi.modelo;

/**
 * Esta classe relaciona todas as vendas da agência de carros novos e usados, <br>
 * seus vendedores e carros.
 * 
 * @see.br.com.turmasi.modelo.Carro
 * @see.br.com.turmasi.modelo.Vendedor
 
 @version 1.0
 @since 1.0
 
 * @author Natã
 */

public class Venda {
		
	//Propriedades
	private Vendedor vendedor;
	private Carro carro;
	private static double vendaTotal;
	
	//Método
	/**
	 * Para que o registro de uma venda seja possivel, é necessario informar ao método o vendedor e o carro comercializado. <br>
	 * Este método envia as informações para que o vetor relacione a venda e obtenha o valor total do periodo.
	 * 
	 * @param vendedor
	 * @param carro
	 */
	public void registravenda(Vendedor vendedor,Carro carro) {
		this.vendedor = vendedor;
		this.carro = carro;
		Venda.vendaTotal += carro.getPreco();
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public Carro getCarro() {
		return carro;
	}

	public static double getVendaTotal() {
		return vendaTotal;
	}
}
