import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.opencsv.CSVReader;

/**
 * Facility.java
 * @author Jeremy Krovitz
 * 
 * Adds a new facility to the system and lists all of the facilities in the system.
 * 
 * This code was adapted and modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Facility

{
	private String nameOfFacility;

	void addFacility() throws IOException

	{
		FileWriter writer = new FileWriter("Facility.csv", true);

		Scanner input = new Scanner(System.in);

		System.out.print("Facility:-");
		nameOfFacility = input.next();
		nameOfFacility += input.nextLine();

		writer.append(HandleFile.escapeSpecialCharacters(nameOfFacility));
		writer.append("\n");
		writer.close();

	}

	void showFacility() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("Facility.csv"));
		String row[];

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Hospital Facility are:");
		System.out.println("--------------------------------------------------------------------------------");

		while ((row = reader.readNext()) != null) {
			System.out.println(row[0]);
		}
	}
}
