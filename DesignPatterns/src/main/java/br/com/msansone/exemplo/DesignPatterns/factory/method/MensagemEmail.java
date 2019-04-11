package br.com.msansone.exemplo.DesignPatterns.factory.method;

public class MensagemEmail implements Mensagem{
	
	public void enviar(String mensagem) {
		System.out.println("Email: "+mensagem);
		
	}

}
