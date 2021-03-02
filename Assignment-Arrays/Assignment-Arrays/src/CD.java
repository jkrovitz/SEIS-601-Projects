/**
 * CD.java       Java Foundations
 * Modified by Jeremy Krovitz for SEIS-601 Assignment-Arrays.
 *
 * Represents a compact disc.
 */

import java.text.NumberFormat;
import java.util.Arrays;

public class CD {
	private String title;
	private double cost;
	private int tracks;
	private Artist[] artists;
	private String[] singers;

	/**
	 * Constructor: creates a new CD with the specified information, 
	 * including an array of the Artist class.
	 */
	public CD(String title, double cost, int tracks, Artist ... artists) {
		this.title = title;
		this.cost = cost;
		this.tracks = tracks;
		this.artists = artists;
	}
	
	/**
	 * Constructor: creates a new CD with the specified information, 
	 * including a String array.
	 */
	public CD(String title, double cost, int tracks, String ... singers) {
		this.title = title;
		this.cost = cost;
		this.tracks = tracks;
		this.singers = singers;
	}
	
	/**
	 * Returns a string description of this CD.
	 */
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String description;
		StringBuilder sBuilder = new StringBuilder();
		
		String musician;

		description = title + "\t";
		
		if (artists != null || singers != null) {
			if (artists != null && artists.length > 0) {
				for (Artist artist : artists) {
					sBuilder.append(artist.toString());
					sBuilder.append(", ");
				}
			}
			else {
				for (int i=0; i < singers.length; i++) {
					sBuilder.append(singers[i].toString());
					sBuilder.append(", ");
				}
			}
			musician = sBuilder.toString();
			musician = musician.substring(0, musician.length() - (", ").length());
			description += musician;
		}
		
		return description;
	}
	
}
