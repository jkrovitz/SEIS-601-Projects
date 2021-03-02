import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

import com.opencsv.CSVReader;

/**
 * Medicine.java
 * @author Jeremy Krovitz
 * 
 * Adds a new medicine to the system and lists all of the medicines in the system.
 * 
 * This code was adapted and modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Medicine {
	private String medName, medComp, expDate;
	private int medCost, count;

	public void newMedi() throws IOException {

		Scanner input = new Scanner(System.in);

		FileWriter writer = new FileWriter("Medicine.csv", true);
		
		Integer medCostInteger;
		medCostInteger = medCost;
		String medCostString = medCostInteger.toString();
		
		Integer countInteger;
		countInteger = count;
		String countString = countInteger.toString();
		
		String[] medicalAttribute = {medName, medComp, expDate, medCostString, countString};
		String[] medicalAttributeString = {"name", "comp", "expDate", "cost", "no of unit"};

		for(int i = 0; i < medicalAttribute.length; i++) {
			System.out.println(medicalAttributeString[i] + ":- ");
			medicalAttribute[i] = input.nextLine();
			medicalAttribute[i] += input.nextLine();
		}
        
		for (int i = 0; i < medicalAttribute.length; i++) {
			writer.append(HandleFile.escapeSpecialCharacters(medicalAttribute[i]));
			writer.append(",");
		}


		
		writer.append("\n");
		writer.close();
	}
	
	public void findMedi() throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("Medicine.csv"));
		System.out.println(
				"--------------------------------------------------------------------------------");
		System.out.println("Name \t Company \t Expiry Date \t Cost");
		System.out.println(
				"--------------------------------------------------------------------------------");
		
		String row[];
		
		while((row = reader.readNext()) != null) {
			double doubleMedCost;
			Integer medCostInt = Integer.parseInt(row[3]);
			doubleMedCost = medCostInt.doubleValue();
		    NumberFormat money = NumberFormat.getCurrencyInstance();
			
			Integer countInt = Integer.parseInt(row[4]);
			
			System.out.println(row[0] + ", " + row[1] + ", " + row[2] + ", " + money.format(doubleMedCost) + ", " + countInt);
		   
		}
		
	}
}

/*
 * Reference and Credits: https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
