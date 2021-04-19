package org.howard.edu.lsp.assignment7.tollboot;

public interface TollBooth {
	String displayData();
	void reset();
	double calculateToll(Truck truck);
	void payToll(double amount) ;
	public int getTotalNUmberOfTracks();
	public double getTotalReceipts();


}
