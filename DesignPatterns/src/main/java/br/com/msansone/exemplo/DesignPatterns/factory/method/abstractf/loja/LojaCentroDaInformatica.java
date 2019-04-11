package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.loja;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto.Boleto;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto.BoletoBancoBrasil;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.nfe.NFE;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.nfe.NFESaoPaulo;
import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.venda.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory {

	@Override
	public NFE criarNFE() {

		NFE notaFiscal = new NFESaoPaulo();

		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {


		Boleto boleto = new BoletoBancoBrasil();
		
		return boleto;
	}

}
