package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.venda;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto.Boleto;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.nfe.NFE;

public interface VendaFactory {
	
	NFE criarNFE();
	Boleto criarBoleto();

}
