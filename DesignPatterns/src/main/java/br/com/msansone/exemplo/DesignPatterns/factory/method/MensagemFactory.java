package br.com.msansone.exemplo.DesignPatterns.factory.method;

public class MensagemFactory {
	
	public static Mensagem getInstance(String tipo) {
		
		switch (tipo) {
		case "email":
			return new MensagemEmail();
		case "sms":
			return new MensagemSms();
		default:
			return null;
		}
	}

}
