import java.util.Scanner;

public class Student extends Person {
    private double gpa;

    public Student() {
        Scanner in = new Scanner(System.in);
        setGpa(in.nextDouble());
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}
