package io.sadeq;
import java.util.Calendar;

abstract class Animal {

	// Attributes
	private String name;
	private int weight;
	private int birthYear;
	private int id;
	private String sex;
	private Section livingArea;

	// Constructor
	Animal(String name, int weight, int birthYear, String sex, Section livingArea) {
		this.name = name;
		this.weight = weight;
		this.birthYear = birthYear;
		this.sex = sex;
		this.livingArea = livingArea;
	}

	// ==================================================================
	// getters
	// ==================================================================
	public Section getLivingArea() {
		return this.livingArea;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setLivingArea(Section livingArea) {
		this.livingArea = livingArea;
	}

	public String getSex() {
		return this.sex;
	}

	// ==================================================================
	// setters
	// ==================================================================
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// ==================================================================
	// normal methods
	// ==================================================================
	public int calcAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year - this.birthYear;
	}

	public void jump() {
		System.out.println("Animal Jumped");
	}


	// ==================================================================
	// abstract methods
	// ==================================================================
	public abstract void eat();

	public abstract void walk();

}