package org.howard.edu.lsp.assignment7.tollboot;

public interface TollBooth {
	/**
	 * displays the current state of the toll boot.- number of trucks and total receipts
	 * @return 
	  */
	String displayData();
	
	/**
	 * resets the number of trucks and receipts 
	 * prints the total number of trucks  and receipts before reset
	 */
	void reset();
	
	/**
	 * calculates the toll due for a particular track
	 * @param truck
	 * @return toll due
	 */
	
	double calculateToll(Truck truck);
	
	/**
	 * pays the amount for a toll
	 * @param amount
	 */
	
	void payToll(double amount) ;
	
	/**
	 * method to get the number of trucks since the last collection by supervisor
	 * @return
	 */
	
	int getTotalNUmberOfTrucks();
	
	/**
	 * gets the total receipts recorded since the last collection by supervisor
	 * @return 
	 */
	public double getTotalReceipts();


}
