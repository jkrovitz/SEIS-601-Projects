/**
 * CDCollection.java       Java Foundations
 * Modified by Jeremy Krovitz for SEIS-601 Assignment-Arrays.
 * 
 * Represents a collection of compact discs.
 */

import java.text.NumberFormat;

public class CDCollection {
	private CD[] collection;
	private int count;
	private double totalCost;

	/**
	 * Constructor: Creates an initially empty collection.
	 */
	public CDCollection() {
		collection = new CD[100];
		count = 0;
		totalCost = 0.0;
	}

	/**
	 * Adds a CD to the collection, increasing the size of the collection if
	 * necessary.
	 *  
	 * @param title		the title of the CD
	 * @param cost		the cost of the CD
	 * @param tracks	the number of tracks the CD has
	 * @param artists	the artists on the CD of type Artist
	 */
	public void addCD(String title, double cost, int tracks, Artist ... artists) {
		if (count == collection.length)
			increaseSize();

		collection[count] = new CD(title, cost, tracks, artists);
		totalCost += cost;
		count++;
	}
	
	/**
	 * Adds a CD to the collection, increasing the size of the collection if
	 * necessary.
	 *  
	 * @param title		the title of the CD
	 * @param cost		the cost of the CD
	 * @param tracks	the number of tracks the CD has
	 * @param singers	the artists on the CD of type String
	 */
	public void addCD(String title, double cost, int tracks, String ... singers) {
		if (count == collection.length)
			increaseSize();

		collection[count] = new CD(title, cost, tracks, singers);
		totalCost += cost;
		count++;
	}

	/**
	 * Returns a report describing the CD collection.
	 */
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My CD Collection\n\n";

		report += "Number of CDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost / count);

		report += "\n\nCD List:\tArtists:\n\n";

		for (int cd = 0; cd < count; cd++)
			report += collection[cd].toString() + "\n";
		
		return report;
	}

	/*
	 * Increases the capacity of the collection by creating a larger array and
	 * copying the existing collection into it.
	 */
	private void increaseSize() {
		CD[] temp = new CD[collection.length * 2];

		for (int cd = 0; cd < collection.length; cd++)
			temp[cd] = collection[cd];

		collection = temp;
	}
}
