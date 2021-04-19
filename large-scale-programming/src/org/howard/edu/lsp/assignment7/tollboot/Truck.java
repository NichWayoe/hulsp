package org.howard.edu.lsp.assignment7.tollboot;

public interface Truck {
	public String getMakeofTruck();

	public int getweight();

	public int getnumberOfAxles();

	public void loadItems(int weight);

	public void unloadItems(int weight);

	public void offLoadAllitems();



}
