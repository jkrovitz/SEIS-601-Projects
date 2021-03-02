import java.text.NumberFormat;

public class SalaryEmployee extends Employee implements IPayrollCalculator {

    public SalaryEmployee(double salary, int id, String name) {
        super(salary, id, name);
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return this.id + "\t" + this.name + "\t"
                + formatter.format(this.salary) + "/Year\t" + (0.0 * 100) + "%"
                + "\t\tMinimum 40 hours a week" + "\t\t"
                + formatter.format(super.calculatePayroll());
    }

}
