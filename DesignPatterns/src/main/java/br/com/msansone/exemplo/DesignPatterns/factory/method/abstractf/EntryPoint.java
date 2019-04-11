package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf;

import java.math.BigDecimal;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.loja.LojaCentroDaInformatica;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.Produto;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.ProdutoBuider;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.venda.Venda;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.venda.VendaFactory;

public class EntryPoint {

	public static void main(String[] args) {
		
		Produto produto = new ProdutoBuider()
				.setNome("cadeira")
				.setQuantidade(3)
				.setValorUnitario(new BigDecimal(50))
				.getProduto();
		
		VendaFactory factory= new LojaCentroDaInformatica();
		Venda venda = new Venda(factory);
		venda.realizarVenda(produto);
		
	}

}
