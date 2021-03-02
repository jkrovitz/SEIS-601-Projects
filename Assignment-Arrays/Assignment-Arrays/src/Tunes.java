/**
 * Tunes.java Java Foundations Modified by Jeremy Krovitz for SEIS-601
 * Assignment-Arrays.
 *
 * Demonstrates the use of an array of objects.
 */

public class Tunes {
	/**
	 * Creates a CDCollection object and adds some CDs to it. Prints reports on the
	 * status of the collection.
	 */
	public static void main(String[] args) {
		CDCollection music = new CDCollection();

		// Instantiates artist objects and passes each of them as
		// arguments into the addCD method calls
		Artist billy = new Artist("Billy", "O", "Joel");
		Artist shania = new Artist("Shania", "", "Twain");
		Artist garth = new Artist("Garth", "", "Brooks");
		Artist les = new Artist("Les", "Miserables");
		
		music.addCD("Storm Front", 14.95, 10, billy, shania, garth);
		music.addCD("Come On Over", 14.95, 16, shania);
		music.addCD("Soundtrack", 17.95, 33, les, shania);

		// Passes a variable-length list of Strings as arguments
		// into the addCD methods calls
		music.addCD("Graceland", 13.90, 11, "Paul Simon", "Garth Brooks");
		music.addCD("Double Live", 19.99, 26, "Garth Brooks");
		music.addCD("Greatest Hits", 15.95, 13, "Jimmy Buffet", "Billy O Joel");

		System.out.println(music);
	}

}
