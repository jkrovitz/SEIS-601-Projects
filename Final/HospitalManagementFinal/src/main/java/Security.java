import java.io.IOException;

/**
 * Security.java
 * @author Jeremy Krovitz
 * 
 * Adds new security guards to the system and lists all of the security guards in the
 * system. 
 * 
 * This code was modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here:
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Security extends Staff {
	
	void createSecurity() throws IOException {
		super.newStaff("Security.csv");
	}
	
	void securityInfo() throws IOException {
		super.staffInfo("Security.csv");
	}

}
