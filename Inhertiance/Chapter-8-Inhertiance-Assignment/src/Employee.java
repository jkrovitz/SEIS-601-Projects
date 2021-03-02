abstract class Employee {
    protected int id;
    protected String name;
    protected double salary;

    Employee(double salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public double calculatePayroll() {
        return this.salary;
    };
}
