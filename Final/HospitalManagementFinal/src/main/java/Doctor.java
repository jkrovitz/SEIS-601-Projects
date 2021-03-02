import java.util.Scanner;
import java.io.*;
import com.opencsv.CSVReader;

/**
 * Doctor.java
 * @author Jeremy Krovitz
 * 
 * Adds new doctor to the system and lists all doctors in the system.
 * 
 * This code was adapted and modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Doctor {
    private String dId, dName, specialist, appoint, docQual;
    private int droom;

    void newDoctor() throws IOException, DoctorException {
        Integer droomInteger;
        droomInteger = droom;
        String droomString = droomInteger.toString();

        FileWriter writer = new FileWriter("Doctor.csv", true);

        Scanner input = new Scanner(System.in);

        DoctorException aDoctorException = new DoctorException("Doctor must start with Dr. or dr.");

        String[] doctorElement = { dId, dName, specialist, appoint, docQual, droomString };
        String[] doctorElementString = { "dId", "dName", "specialist", "appoint", "docQual", "droom" };
        for (int i = 0; i < doctorElement.length; i++) {
            System.out.println(doctorElementString[i] + ":- ");
            doctorElement[i] = input.next();
            doctorElement[i] += input.nextLine();
            if (doctorElementString[i].equals("dName")) {
                if ((!(doctorElement[i].startsWith("Dr."))) && (!(doctorElement[i].startsWith("dr.")))) {
                    writer.close();
                    throw aDoctorException;
                }
            }
        }
        for (int i = 0; i < doctorElement.length; i++) {
            writer.append(HandleFile.escapeSpecialCharacters(doctorElement[i]));
            writer.append(",");

        }
        writer.append("\n");
        writer.close();
    }

    void doctorInfo() throws IOException {

        CSVReader reader = new CSVReader(new FileReader("Doctor.csv"));
        String row[];

        System.out.print("name" + "\t" + "specialist" + "\t Timing \t Qualification \t Room No.");

        System.out.println("\n--------------------------------------------------------------------------------");
        while ((row = reader.readNext()) != null) {
            System.out.println(row[0] + ", " + row[1] + ", " + row[2] + ", " + row[3] + ", " + row[4] + ", " + row[5]);
        }

    }

}

