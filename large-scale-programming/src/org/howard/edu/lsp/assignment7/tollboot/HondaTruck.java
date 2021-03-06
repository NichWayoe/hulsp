package org.howard.edu.lsp.assignment7.tollboot;

public class HondaTruck implements Truck {
	private int weightAdded = 0;
	private int orginalTruckWeight;
	private int numberOfAxle;

	public HondaTruck(int numberOfAxle, int weight) {
		this.orginalTruckWeight = weight;
		this.numberOfAxle = numberOfAxle;
	}

	@Override
	public int getweight() {
		return this.weightAdded + this.orginalTruckWeight;	
	}

	@Override
	public int getnumberOfAxles() {
		return this.numberOfAxle;	
	}

	@Override
	public void loadItems(int weight) {
		this.weightAdded += weight;

	}

	@Override
	public void unloadItems(int weight) {
		if (weight > this.weightAdded) {
			this.weightAdded = 0;
		}
		else {
			this.weightAdded -= weight;
		}
	}


	@Override
	public void offLoadAllitems() {
		this.weightAdded = 0;

	}



}
