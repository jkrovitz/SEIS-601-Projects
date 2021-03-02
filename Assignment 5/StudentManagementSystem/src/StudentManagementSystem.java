/**
 * StudentManagementSystem.java
 * @author Jeremy Krovitz
 * 
 * Prints information describing three different students.
 *
 */
public class StudentManagementSystem {
	/**
	 * This method instantiates nine objects of type Address, three objects of type StudentHighSchoolInformation,
	 * and three objects of type Student. The objects representing the school address get passed into each of the
	 * StudentHighSchoolInformation constructors. Two address objects, representing a home and work address, and 
	 * one StudentHgihSchoolInformation object get passed into each of the associated Student objects. For each 
	 * Student object  the toString method in the Student class is invoked through a reference to a Student object 
	 * and the toString method in the StudentHighSchoolInformation class is invoked through a reference to a
	 * StudentHighSchoolInformation object. These invocations are concatenated together and printed.
	 */
	public static void main(String[] args) {
		
		Address aHomeAddress = new Address("16312 70th Avenue North", " ", "Maple Grove", "MN", "55311");
		Address aWorkAddress = new Address("110 Cheshire Lane", "Suite 300", "Minnetonka", "MN", "55305");
		Address aSchoolAddress = new Address("9800 Fernbrook Ln N", " ", "Maple Grove", "MN", "55369");
		
		StudentHighSchoolInformation aHSInfo = new StudentHighSchoolInformation(aSchoolAddress, 4.00);
		
		Student a = new Student("Jeremy", "Andrew", "Krovitz", aWorkAddress, aHomeAddress, "763-567-8851", aHSInfo);
		
		Address bHomeAddress = new Address("9464 SE. Wild Rose Drive", " ", "Jamaica", "NY", "114325");
		Address bWorkAddress = new Address("7311 Shady St.", " ", "Forest Hills", "NY", "11375");
		Address bSchoolAddress = new Address("957 Miller Street", "", "Rochester", "NY", "14609");
		
		StudentHighSchoolInformation bHSInfo = new StudentHighSchoolInformation(bSchoolAddress, 3.50);
		
		Student b = new Student("Sue", "", "Peterson", bWorkAddress, bHomeAddress, "516-399-3136", bHSInfo);
		
		Address cHomeAddress = new Address("17 Oklahoma Rd.", " ", "Riverside", "CA", "92503");
		Address cWorkAddress = new Address("9957 Smith Court", " ","San Francisco", "CA", "94122");
		Address cSchoolAddress = new Address("119 N. Pilgrim Street", " ", "Milpitas", "CA", "95035"); 
		
		StudentHighSchoolInformation cHSInfo = new StudentHighSchoolInformation(cSchoolAddress, 3.00);
		
		Student c = new Student("Bob", "B.", "Smith", cWorkAddress, cHomeAddress, "626-390-4603", cHSInfo);
		
		System.out.println(a.toString() + aHSInfo.toString());
		System.out.println(b.toString() + bHSInfo.toString());
		System.out.println(c.toString() + cHSInfo.toString());
	}
	
}
