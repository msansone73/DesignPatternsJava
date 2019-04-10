package br.com.msansone.exemplo.DesignPatterns.strategy;

public class EntryPoint {

	public static void main(String[] args) {
		
		Dog toto = new Dog();
		System.out.println(toto.getFlyingType().fly());
		
		Duck tale = new Duck();
		System.out.println(tale.getFlyingType().fly());

	}

}
