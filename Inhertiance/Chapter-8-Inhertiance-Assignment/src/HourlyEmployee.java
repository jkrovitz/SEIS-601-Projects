import java.text.NumberFormat;

public class HourlyEmployee extends Employee implements IPayrollCalculator {
    protected double hoursWorked;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public HourlyEmployee(double salary, int id, String name,
            double hoursWorked) {
        super(salary, id, name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayroll() {
        return this.salary * this.hoursWorked;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\t\t"
                + formatter.format(this.salary) + "/Hour\t" + (0.0 * 100)
                + "%\t\t" + (int) this.hoursWorked + "\t\t\t\t"
                + formatter.format(this.calculatePayroll())
                + " - For this week";
    }
}
