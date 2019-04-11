package br.com.msansone.exemplo.DesignPatterns.factory.method.abstractf.produto;

import java.math.BigDecimal;

public class ProdutoBuider {
	
	private String nome;
	private int quantidade;
	private BigDecimal valorUnitario;
	
	public ProdutoBuider setNome(String nome) {
		this.nome=nome;
		return this;
	}
	
	public ProdutoBuider setQuantidade(int quantidade) {
		this.quantidade=quantidade;
		return this;
	}
	
	public ProdutoBuider setValorUnitario(BigDecimal valor) 
	{
		this.valorUnitario=valor;
		return this;
	}
	
	public Produto getProduto() {
		Produto produto = new Produto();
		produto.setNome(this.nome);
		produto.setQuantidade(this.quantidade);
		produto.setValorUnitario(this.valorUnitario);
		return produto;
	}

}
