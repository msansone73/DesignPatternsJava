package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.venda;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto.Boleto;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.nfe.NFE;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.Produto;

public class Venda {

	private NFE notaFiscal;
	private Boleto boleto;
	
	
	public Venda(VendaFactory vendaFactory) {
		this.notaFiscal=vendaFactory.criarNFE();
		this.boleto=vendaFactory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto) {
		double imposto=notaFiscal.calcularImposto(produto);
		boleto.emitir(produto, imposto);
	}
	
}
