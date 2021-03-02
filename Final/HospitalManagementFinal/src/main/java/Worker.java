import java.io.IOException;

/**
 * Worker.java
 * @author Jeremy Krovitz
 * 
 * Adds a new worker to the system and lists all of the workers in the
 * system. 
 * 
 * This code was modified from Hospital Management
 * System Project in Java by Ghanendra Yadav on 6 Nov. 2017. Original
 * source code available here:
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class Worker extends Staff {

	void createWorker() throws IOException {
		super.newStaff("Worker.csv");
	}
	
	void workerInfo() throws IOException {
		super.staffInfo("Worker.csv");
	}
}
