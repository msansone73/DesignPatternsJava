package br.com.msansone.exemplo.DesignPatterns.factory.method;

public class MensagemSms implements Mensagem{

	public void enviar(String mensagem) {
		System.out.println("SMS: "+mensagem);
		
	}

}
