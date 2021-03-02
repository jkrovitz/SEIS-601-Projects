import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Scanner;
import com.opencsv.CSVReader;


/**
 * Lab.java
 * @author Jeremy Krovitz
 * 
 * Adds a new lab to the system and lists all of the labs in the system.
 * 
 * This code was adapted and modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Lab {
	private String facilityStr;
	private int labCost;
	private Facility facilityObject;
	
	Lab(){}
	
	Lab(String facilityString, int labCost) {
		this.facilityStr = facilityString;
		this.labCost = labCost;	
	}
	
	Lab(String facilityString, int labCost, Facility facilityObject) {
		this.facilityStr = facilityString;
		this.labCost = labCost;
		this.facilityObject = facilityObject;	
	}

	void newFacility() throws IOException {
		
		Integer labCostInteger;
		labCostInteger = labCost;
		String labCostString = labCostInteger.toString();
		
		String facilityString;
		if (!(facilityObject == null)) {
			facilityString = facilityObject.toString();
		}
		else {
			facilityString = " ";
		}
		
		Scanner input = new Scanner(System.in);
		
		FileWriter writer = new FileWriter("Lab.csv", true);

		if (!(facilityString.equals(" "))){
			String[] labElement = {facilityStr, labCostString, facilityString};
			String[] labElementString = {"facilityStr", "lab cost", "facilityStr name" };
			
			for (int i = 0; i < labElement.length; i++) {
				System.out.println(labElementString[i] + ":- ");
				labElement[i] = input.next();
				labElement[i] += input.nextLine();
			}
			for (int i = 0; i < labElement.length; i++) {
				writer.append(HandleFile.escapeSpecialCharacters(labElement[i]));
				writer.append(",");
			}
			writer.append("\n");
		}
		
		else {
			String[] labElement = {facilityStr, labCostString};
			String[] labElementString = {"Facility", "labCost"};
			
			for (int i = 0; i < labElement.length; i++) {
				System.out.println(labElementString[i] + ":- ");
				labElement[i] = input.next();
				labElement[i] += input.nextLine();
			}
			for (int i = 0; i < labElement.length; i++) {
				writer.append(HandleFile.escapeSpecialCharacters(labElement[i]));
				writer.append(",");
			}
			writer.append("\n");
			
		}
		writer.close();
			
	}	

	void facilityList() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("Lab.csv"));
		
		System.out.println(
				"--------------------------------------------------------------------------------");
		System.out.println("Facilities\t\t Cost");
		System.out.println(
				"--------------------------------------------------------------------------------");
		
		String row[];
		while ((row = reader.readNext()) != null) {
			Integer costInt = Integer.parseInt(row[1]);
			NumberFormat money = NumberFormat.getCurrencyInstance();
			if (row.length == 3) {
				System.out.println(row[0] + ", " + money.format(costInt) + ", " + row[2]);
			}
			else {
				System.out.println(row[0] + ", " + money.format(costInt));
			}
		}	
	}	
}
