import java.io.*;
import java.util.*;
import java.util.Calendar;

/**
 * HospitalMgmtSystem.java
 * @author Jeremy Krovitz
 * 
 * Driver class that handles navigation through the Hospital Management System software.
 * 
 * This code was adapted and modified from Hospital Management System Project in Java by Ghanendra Yadav
 * on 6 Nov. 2017. Original source code available here: 
 * https://www.programmingwithbasics.com/2017/11/hospital-management-system-project-in.html
 */
class HospitalMgmtSystem {
    
   public static void main(String args[]) throws IOException, DoctorException {

        int choice, status = 1;
        Scanner input = new Scanner(System.in);
        
        welcome();

        while (status == 1)  {
            mainMenu();

            choice = input.nextInt();
            switch (choice) {

                case 1: {
                    doctorOption();
                    break;
                }

                case 2: {
                    patientOption();
                    break;
                }

                case 3: {
                    medicalOption();
                    break;
                }

                case 4: {
                    labOption();
                    break;
                }

                case 5:  {
                    facilityOption();
                    break;
                }

                case 6: {
                    staffOption();
                    break;
                }

            }

        }
        input.close();
    }

    private static void welcome() {
        String months[] = {

                "Jan", "Feb", "Mar", "Apr",

                "May", "Jun", "Jul", "Aug",

                "Sep", "Oct", "Nov", "Dec" };

        Calendar calendar = Calendar.getInstance();

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println(" *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " "
                + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND));
    }

    private static void mainMenu() {
        System.out.println("\n MAIN MENU");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1.Doctors 2. Patients 3.Medicines 4.Laboratories 5. Facilities 6. Staff ");
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    private static void doctorOption() throws IOException, DoctorException {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **DOCTOR SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        int s1 = 1, c1 = 1;
        Scanner input = new Scanner(System.in);

        while (s1 == 1) {
            System.out.println("1.Add New Entry\n2.Existing Doctors List");
            c1 = input.nextInt();
            switch (c1)

            {
                case 1: {
                    Doctor[] d = new Doctor[25];
               
                    for (int i = 0; i < 25; i++) {
                        d[i] = new Doctor();
                    }
                    
                    int doctorCount = HandleFile.countFromFile("Doctor.csv");
                    d[doctorCount].newDoctor();
                    doctorCount++;
                    break;
                }
                case 2: {
                    Doctor dr = new Doctor();
                    dr.doctorInfo();

                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s1 = input.nextInt();
        }
        
    }
    
    private static void patientOption() throws IOException {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **PATIENT SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        
        int c1, s2 = 1;
        Scanner input = new Scanner(System.in);
        

        while (s2 == 1) {
            System.out.println("1.Add New Entry\n2.Existing Patients List");
            c1 = input.nextInt();
            switch (c1) {
                case 1: {
                    Patient[] p = new Patient[100];
                    
                    for (int i = 0; i < 100; i++) {

                        p[i] = new Patient();
                    }
                    
                    int patientCount = HandleFile.countFromFile("Patient.csv");
                    p[patientCount].newPatient();
                    patientCount++;
                    break;
                }

                case 2: {
                    Patient pat = new Patient();
                    pat.patientInfo();
                    break;
                }

            }
            System.out.println();
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s2 = input.nextInt();
        }
    }
    
    private static void medicalOption() throws IOException {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **MEDICINE SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        int c1, s3 = 1;
        Scanner input = new Scanner(System.in);
        
        
        while (s3 == 1) {
            System.out.println("1.Add New Entry\n2. Existing Medicines List");
            c1 = input.nextInt();

            switch (c1) {

                case 1: {
                    
                    Medicine[] m = new Medicine[100];
                    
                    for (int i = 0; i < 100; i++) {
                        m[i] = new Medicine();
                    }
                    
                    int medicalCount = HandleFile.countFromFile("Medicine.csv");
                    m[medicalCount].newMedi();
                    medicalCount++;
                    break;
                }

                case 2: {

                    Medicine medi = new Medicine();
                    medi.findMedi();
                    break;
                }

            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s3 = input.nextInt();
        }
    }
   
    private static void labOption() throws IOException {
        int c1, s4 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **LABORATORY SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        while (s4 == 1)

        {
            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
            c1 = input.nextInt();

            switch (c1)

            {
                case 1: {
                    Lab[] l = new Lab[20];
                    for (int i = 0; i < 20; i++) {
                        l[i] = new Lab();
                    }
                    int labCount = HandleFile.countFromFile("Lab.csv");
                    l[labCount].newFacility();
                    labCount++;
                    break;
                }

                case 2:

                {
                    Lab aLab = new Lab();
                    aLab.facilityList();
                    break;
                }
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s4 = input.nextInt();
        }
    }
    
    private static void facilityOption() throws IOException {
        int c1, s5 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **HOSPITAL FACILITY SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        while (s5 == 1)

        {
            System.out.println("1.Add New Facility\n2.Existing Facilities List");
            c1 = input.nextInt();

            switch (c1)

            {
                case 1: {
                    Facility[] f = new Facility[20];
                    for (int i = 0; i < 20; i++) {
                        f[i] = new Facility();
                    }
                    
                    int facilityCount = HandleFile.countFromFile("Facility.csv");
                    f[facilityCount].addFacility();
                    facilityCount++;
                    break;
                }
                case 2: {

                    Facility facility = new Facility();
                    facility.showFacility();
                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s5 = input.nextInt();
        }
        
        
    }
    
    
    private static void staffOption() throws IOException {
       String c2;
       int s6 = 1;
       Scanner input = new Scanner(System.in);

        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println(" **STAFF SECTION**");
        System.out.println(
                "--------------------------------------------------------------------------------");

        while (s6 == 1)

        {
            final String a = "a", b = "b", c = "c";
            System.out.println("a.Nurses\nb.Workers\nc.Security");

            System.out.println("\nFor Main Menu, Press 0");

            if ((input.hasNextInt()) && (input.nextInt() != 1)) {
                break;
            }

            else if (input.hasNext()) {

                c2 = input.next();

                switch (c2)

                {

                    case a: {
                        nurseOption();
                        break;

                    }

                    case b: {
                        workerOption();
                        break;

                    }

                    case c: {
                        securityOption();
                        break;

                    }

                }
            }

        }
    }
    
    private static void nurseOption() throws IOException {
        int sub1 = 1, c3;
        Scanner input = new Scanner(System.in);
        
        while (sub1 == 1) {
        System.out.println("1.Add New Entry \n2.Existing Nurses List");

        c3 = input.nextInt();

        switch (c3) {

            case 1: {
                Nurse[] n = new Nurse[100];
                

                for (int i = 0; i < 100; i++) {

                    n[i] = new Nurse();
                }
                
                int nurseCount = HandleFile.countFromFile("Nurse.csv");
                n[nurseCount].createNurse();
                nurseCount++;
                break;
            }
            case 2: {
                System.out.println(
                        "--------------------------------------------------------------------------------");
                System.out.println("id \t Name \t Gender \t Salary");
                System.out.println(
                        "--------------------------------------------------------------------------------");

                Nurse aNurse = new Nurse();
                aNurse.nurseInfo();

                break;
            }
        }
        System.out.println("\nPress 1 to go back or press 0 to return to Staff Menu");

        if ((input.hasNextInt()) && (input.nextInt() != 1)) {
            break;
        }

    }
    System.out.println("\nReturn to Staff Menu, Press 1");
    input.nextInt();
    }
    
    private static void workerOption() throws IOException {
        int sub2 = 1, c3;
        Scanner input = new Scanner(System.in);
        
        while (sub2 == 1) {

            System.out.println("1.Add New Entry \n2.Existing Worker List");
            c3 = input.nextInt();

            switch (c3) {
                case 1: {
                    
                    
                    Worker[] work = new Worker[100];
                    for (int i=0; i < 100; i++) {
                        work[i] = new Worker();
                    }

                    int workerCount = HandleFile.countFromFile("Worker.csv");
                    work[workerCount].createWorker();
                    workerCount++;
                    break;
                }
                case 2: {
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("id \t Name \t Gender \t Salary");
                    System.out.println(
                            "--------------------------------------------------------------------------------");

                    Worker aWorker = new Worker();
                    aWorker.workerInfo();
                    break;
                }
            }
            System.out.println("\nPress 1 to go back or press 0 to return to Staff Menu");

            if ((input.hasNextInt()) && (input.nextInt() != 1)) {
                break;
            }

        }
        System.out.println("\nReturn to Staff Menu, Press 1");
        input.nextInt();
    }
    
   private static void securityOption() throws IOException {
       
       int sub3 = 1, c3; 
       Scanner input = new Scanner(System.in);
       
        while (sub3 == 1) {

            System.out.println("1.Add New Entry \n2.Existing Security List");
            c3 = input.nextInt();

            switch (c3) {
                case 1: {

                    Security[] sec = new Security[100];
                    for (int i = 0; i < 100; i++) {
                        sec[i] = new Security();
                    }
                    
                    int securityCount = HandleFile.countFromFile("Security.csv");
                    sec[securityCount].createSecurity();
                    securityCount++;
                    break;
                }
                case 2: {
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("id \t Name \t Gender \t Salary");
                    System.out.println(
                            "--------------------------------------------------------------------------------");

                    Security aSecurityGuard = new Security();
                    aSecurityGuard.securityInfo();
                    break;
                }
            }

            System.out.println("\nPress 1 to go back or press 0 to return to Staff Menu");

            if ((input.hasNextInt()) && (input.nextInt() != 1)) {
                break;
            }

        }
        System.out.println("\nReturn to Staff Menu, Press 1");
        input.nextInt();
    }
}
