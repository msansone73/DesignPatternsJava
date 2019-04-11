package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.Produto;

public interface Boleto {
	
	void emitir(Produto produto, double imposto);

}
