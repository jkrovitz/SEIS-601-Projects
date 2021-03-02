import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;
import com.opencsv.CSVReader;

/**
 * Staff.java
 * 
 * @author Jeremy Krovitz
 * 
 *         Parent class creates new staff of type Nurse, Worker, and Security as
 *         well as lists all of the instances for each type—Nurse, Worker, and
 *         Security— in the system.
 * 
 *         This code was adapted and modified from Hospital Management System
 *         Project in Java by Ghanendra Yadav on 6 Nov. 2017. Original source
 *         code available here:
 *         https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Staff {
    private String sID, sName, desg, sex;
    private int salary;

    protected void newStaff(String fileName) throws IOException {

        Integer salaryInteger;
        salaryInteger = salary;
        String salaryString = salaryInteger.toString();

        Scanner input = new Scanner(System.in);

        FileWriter writer = new FileWriter(fileName, true);

        String[] staffAttributes = { sID, sName, desg, sex, salaryString };
        String[] staffAttributeStrings = { "id", "name", "designation", "sex", "salary" };

        for (int i = 0; i < staffAttributes.length; i++) {
            System.out.println(staffAttributeStrings[i]);
            staffAttributes[i] = input.next();
            staffAttributes[i] += input.nextLine();
        }

        for (int i = 0; i < staffAttributes.length; i++) {
            writer.append(HandleFile.escapeSpecialCharacters(staffAttributes[i]));
            writer.append(",");
        }
        writer.append("\n");
        writer.close();
    }

   protected void staffInfo(String fileName) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String row[];

        while ((row = reader.readNext()) != null) {
            Integer staffSalaryInt = Integer.parseInt(row[4]);
            NumberFormat money = NumberFormat.getCurrencyInstance();
            System.out.println(row[0] + ", " + row[1] + ", " + row[2] + ", " + row[3] + ", " + money.format(staffSalaryInt));
        }
    }
}
