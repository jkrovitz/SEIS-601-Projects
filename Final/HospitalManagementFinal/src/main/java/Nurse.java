import java.io.IOException;

/**
 * Nurse.java
 * @author Jeremy Krovitz
 * 
 * Adds a new nurse to the system and lists all of the nurses in the system.
 * 
 * This code was modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Nurse extends Staff {
	
	void createNurse() throws IOException {
		super.newStaff("Nurse.csv");
	}
	
	void nurseInfo() throws IOException {
	    super.staffInfo("Nurse.csv");
	}
}
