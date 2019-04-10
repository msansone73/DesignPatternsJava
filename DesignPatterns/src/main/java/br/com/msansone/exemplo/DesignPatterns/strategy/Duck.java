package br.com.msansone.exemplo.DesignPatterns.strategy;

public class Duck extends Animal{

	public Duck() {
		super();
		setSoung("qua qua");
		setFlyingType(new ItsFly());
	}
	
	
}
