package io.sadeq;

public class Section {
	private int id;
	private String name;

	Section(int id, String name) {
		this.id = id;
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	protected void setName(String name) {
		this.name = name;
	}

}