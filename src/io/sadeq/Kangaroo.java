package io.sadeq;

public class Kangaroo extends Animal {

	Kangaroo(String name, int weight, int birthYear, String sex, Section livingArea) {
		super(name, weight, birthYear, sex, livingArea);
	}

	// polymorphism has 2 types
	// by overriding method of parent class
	public void jump() {
		System.out.println("kangaroo Jumping High");
	}

	// or by creating 2 forms of same function
	public void jump(String place) {
		System.out.println("kangaroo jumping on " + place);
	}


	// mandatory - this methods need to be implemented
	@Override
	public void eat() {
		System.out.println("kangaroo eating grass");
	}

	@Override
	public void walk() {
		System.out.println("kangaroo walking");
	}

}