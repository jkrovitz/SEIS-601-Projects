public class EmployeePayDriver {
    public static void main(String[] args) {
        
        System.out.println(
                "Id\tName\t\tSalary\t\tCommission\tHours Worked\t\t\tTotal Payout\n");

        CommissionEmployee commissionEmployeeA = new CommissionEmployee(20000,
                1, "Ali Naqvi", 0.05);
        SalaryEmployee salaryEmployeeA = new SalaryEmployee(14000, 2,
                "John Page");
        CommissionEmployee commissionEmployeeB = new CommissionEmployee(44000,
                3, "Lynn Johnson", 0.05);
        HourlyEmployee hourlyEmployeeA = new HourlyEmployee(19.00, 4, "Nina A",
                43);

        System.out.println(commissionEmployeeA.toString() + "\n");
        System.out.println(salaryEmployeeA.toString() + "\n");
        System.out.println(commissionEmployeeB.toString() + "\n");
        System.out.println(hourlyEmployeeA.toString() + "\n");
    }
}
