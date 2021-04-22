package org.howard.edu.lsp.assignment7.tollboot;

public class AccraTollBooth implements TollBooth {
	int totalNUmberOfTracks = 0;
	double totalReceipts = 0;

	public double getTotalReceipts() {
		return totalReceipts;
	}

	public int getTotalNUmberOfTrucks() {
		return totalNUmberOfTracks;
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		return this.toString();
	}

	@Override
	public void reset() {
		System.out.println("*** Collecting receipts  ***\n");
		this.toString();
		this.totalNUmberOfTracks = 0;
		this.totalReceipts = 0;
	}

	@Override
	public double calculateToll(Truck truck) {
		int weight = truck.getweight();
		int numberOfAxles = truck.getnumberOfAxles();
		double toll = (weight/2) *10 + numberOfAxles * 5; 
		System.out.println("Truck arrival - Axles: " + numberOfAxles + " Total weight: " + weight + " Toll due: $"+ toll);
		return toll;
	}
	
	@Override
	public void payToll(double amount) {
		totalNUmberOfTracks += 1;
		this.totalReceipts += amount;
	}


	public String toString() {
		return ("Total since last collection - Receipts: $" + this.totalReceipts + " Trucks: " + this.totalNUmberOfTracks); 
	}


}
