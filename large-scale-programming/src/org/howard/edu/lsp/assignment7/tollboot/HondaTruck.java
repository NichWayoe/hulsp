package org.howard.edu.lsp.assignment7.tollboot;

public class HondaTruck implements Truck {
	private String make;
	private int weight;
	private int numberOfAxle;

	public HondaTruck(String make, int numberOfAxle, int weight) {
		this.make = make;
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
		// TODO Auto-generated method stub
		this.weight += weight;

	}

	@Override
	public void unloadItems(int weight) {
		if (weight > this.weight) {
			this.weight = 0;
		}
		else {
			this.weight -= weight;
		}
	}


@Override
public void offLoadAllitems() {
	this.weight = 0;

}



}
