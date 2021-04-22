package org.howard.edu.lsp.exam.question40;

public abstract class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {
		this.name = "Animal";
	}
	public void  move() {
		System.out.println("This " + this.name + " moves forward");
	}
	
	public void speak() {
		System.out.println("This " + this.name + "speaks");
	}

}
