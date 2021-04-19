package org.howard.edu.lsp.assignment7.tollboot;


public class KiaTruck implements Truck {
	private String make;
	private int weight;
	private int numberOfAxle;

	public KiaTruck(String make, int numberOfAxle, int weight) {
		//		this.make = make;
		this.weight = weight;
		this.numberOfAxle = numberOfAxle;
	}

	@Override
	public String getMakeofTruck() {
		return this.make;
	}

	@Override
	public int getweight() {
		return this.weight;	
	}

	@Override
	public int getnumberOfAxles() {
		return this.numberOfAxle;	
	}

	@Override
	public void loadItems(int weight) {
		this.weight += weight;
	}

	@Override
	public void unloadItems(int weight) {
		// TODO Auto-generated method stub
		if (weight > this.weight) {
			this.weight = 0;
		}
		else {
			this.weight -= weight;
		}

	}

	@Override
	public void offLoadAllitems() {
		// TODO Auto-generated method stub
		this.weight = 0;
	} 
}
