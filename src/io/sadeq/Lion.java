package io.sadeq;

public class Lion extends Animal {

	// constructor
	Lion(String name, int weight, int birthYear, String sex, Section livingArea) {
		super(name, weight, birthYear, sex, livingArea);
	}

	// specific methods for child class
	public void attack(Animal animal) {
		System.out.println(this.getName() + " attacking " + animal.getName());
	}

	public void roar() {
		System.out.println(this.getName() + " Roaaaaaaaaaaaaaaaaar");
	}


	// mandatory - this methods need to be implemented
	@Override
	public void eat() {
		System.out.println(this.getName() + " Eating Meat");
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " Walking");
	}
}