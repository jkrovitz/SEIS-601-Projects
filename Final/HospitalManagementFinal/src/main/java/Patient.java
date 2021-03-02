import java.util.Scanner;
import java.io.*;
import com.opencsv.CSVReader;

/**
 * Patient.java
 * @author Jeremy Krovitz
 * 
 * Adds a new patient to the system and lists all of the patients in the
 * system. 
 * 
 * This code was adapted and modified from Hospital Management
 * System Project in Java by Ghanendra Yadav on 6 Nov. 2017. Original
 * source code available here:
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Patient

{
    private String pId, pName, disease, sex, admitStatus;
    private int age;

    void newPatient() throws IOException {
        Integer ageInteger;
        ageInteger = age;
        String ageString = ageInteger.toString();

        FileWriter writer = new FileWriter("Patient.csv", true);

        Scanner input = new Scanner(System.in);

        String[] patientElement = { pId, pName, disease, sex, admitStatus, ageString };
        String[] patientElementString = { "Id", "Name", "Disease", "Sex", "Admit Status", "Age" };
        for (int i = 0; i < patientElement.length; i++) {
            System.out.println(patientElementString[i] + ":- ");
            patientElement[i] = input.next();
            patientElement[i] += input.nextLine();
        }
        for (int i = 0; i < patientElement.length; i++) {
            writer.append(HandleFile.escapeSpecialCharacters(patientElement[i]));
            writer.append(",");
        }
        writer.append("\n");
        writer.close();
    }

    void patientInfo() throws IOException {
        Integer ageInteger;
        ageInteger = age;
        String ageString = ageInteger.toString();
        String[] patientElement = { pId, pName, disease, sex, admitStatus, ageString };
        String[] patientElementString = { "Id", "Name", "Disease", "Sex", "Admit Status", "Age" };

        patientInfoHelper(patientElement, patientElementString, "Patient.csv");

    }

    private void patientInfoHelper(String[] instanceArray, String[] instanceArrayString, String fileName)
            throws IOException {

        CSVReader reader = new CSVReader(new FileReader(fileName));
        String row[];

        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < instanceArrayString.length; i++) {
            System.out.print(instanceArrayString[i] + ", ");
        }
        System.out.print("\n--------------------------------------------------------------------------------");

        while ((row = reader.readNext()) != null) {
            System.out.println();
            for (int i = 0; i < instanceArray.length; i++) {
                System.out.print(row[i] + ", ");
            }
        }
    }

}
