package br.com.msansone.exemplo.DesignPatterns.strategy;

public class Animal {

	private String name;
	private double heght;
	private int weight;
	private String favFood;
	private double speed;
	private String soung;
	private Flys flyingType;
	
	
	public Flys getFlyingType() {
		return flyingType;
	}
	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	public Animal() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeght() {
		return heght;
	}
	public void setHeght(double heght) {
		this.heght = heght;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSoung() {
		return soung;
	}
	public void setSoung(String soung) {
		this.soung = soung;
	}
	
	
}
