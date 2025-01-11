public class Employee extends Person {
    private double salary;
    private String position;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}
