package br.com.msansone.exemplo.DesignPatterns.strategy;

public class Dog extends Animal{
	
	public Dog() {
		super();
		setSoung("au au");
		this.setFlyingType(new CantFly());
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}


}
