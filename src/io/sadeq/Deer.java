package io.sadeq;

public class Deer extends Animal {

	private String type;

	// constructors
	public Deer(String name, int weight, int birthYear, String sex, Section livingArea, String type) {
		super(name, weight, birthYear, sex, livingArea);
		this.type = type;
	}


	// getters and setters
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}


	// mandatory - this methods need to be implemented
	@Override
	public void eat() {
		System.out.println("Deer Eating Grass");
	}

	@Override
	public void walk() {
		System.out.println("Deer Walking on the hill");
	}
}