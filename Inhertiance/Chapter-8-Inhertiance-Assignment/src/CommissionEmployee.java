import java.text.NumberFormat;

public class CommissionEmployee extends SalaryEmployee
        implements IPayrollCalculator {

    private double commission;

    public CommissionEmployee(double salary, int id, String name,
            double commission) {
        super(salary, id, name);
        this.commission = commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double calculatePayroll() {
        return (super.calculatePayroll() * this.commission)
                + super.calculatePayroll();
    }

    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return this.id + "\t" + this.name + "\t" + formatter.format(this.salary)
                + "/Year\t" + (this.commission * 100) + "%\t\tNo minimum hours"
                + "\t\t" + formatter.format(this.calculatePayroll());
    }
}
