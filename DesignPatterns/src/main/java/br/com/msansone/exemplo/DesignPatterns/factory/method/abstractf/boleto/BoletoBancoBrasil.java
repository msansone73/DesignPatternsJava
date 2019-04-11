package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.boleto;

import br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		
		System.out.println("Banco do Brasil");
		System.out.println("=========================");
		System.out.println("Descrição : " + produto.getNome());
		System.out.println("Quantidade : " + produto.getQuantidade());
		System.out.println("Valor Unitario : " +produto.getValorUnitario());
		System.out.println("Valor Total : " +produto.getValorTotal(imposto));
		System.out.println("Valor Imposto : " +imposto);
		
	}

}
