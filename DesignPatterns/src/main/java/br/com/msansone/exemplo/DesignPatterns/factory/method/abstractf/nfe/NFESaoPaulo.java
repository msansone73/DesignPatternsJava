package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.nfe;

import java.math.BigDecimal;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.Produto;

public class NFESaoPaulo implements NFE {

	@Override
	public double calcularImposto(Produto produto) {

		BigDecimal imposto= new BigDecimal(0.18);
		imposto = imposto.multiply(produto.getValorUnitario());
		return imposto.doubleValue();
	}

}
