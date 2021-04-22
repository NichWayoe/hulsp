package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	
	public Goose() {
		super("Goose");
	}
	
	@Override
	public void fly() {
		System.out.println("This Goose flies");
		
	}

}
