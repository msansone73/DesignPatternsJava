package br.com.msansone.exemplo.DesignPatterns.factory.method;

public class EntryPoint {

	public static void main(String[] args) {
		
		MensagemFactory.getInstance("sms").enviar("minha mensagem");
		Mensagem msgemail = MensagemFactory.getInstance("email");
		msgemail.enviar("minha mensagem de email");

	}

}
