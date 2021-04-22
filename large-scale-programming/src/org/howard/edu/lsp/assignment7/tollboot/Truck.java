package org.howard.edu.lsp.assignment7.tollboot;

public interface Truck {

	/*
	 * Method for getting the total weight of the truck
	 * @return the weight  
	 */

	public int getweight();

	/*
	 * Method for getting the number of Axles
	 * @return  numberOfAxles
	 */

	public int getnumberOfAxles();


	/*
	 * Method for adding weight onto the truck
	 * unit of weight is tonnes
	 * @param weight
	 */
	public void loadItems(int weight);


	/*
	 * Method for removing weight from the added weight of the truck
	 * if weight to be removed is greater than added weight on truck,
	 * set added weight to zero
	 * unit of weight is tonnes
	 * @param weight 
	 */
	public void unloadItems(int weight);


	/*
	 * Totally removes all the added weight 
	 * unit of weight is tonnes
	 * @param weight 
	 */
	public void offLoadAllitems();



}
