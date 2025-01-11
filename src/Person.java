import java.util.Scanner;

public class Person implements Payable {
    private static int id = 0;
    private int id_gen;
    private String name;
    private String surname;

    public Person() {
        Scanner sc = new Scanner(System.in);
        this.id_gen = id++;
        setName(sc.nextLine());
        setSurname(sc.nextLine());
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId_gen() {
        return id_gen;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return id_gen + " ." + name + " " + surname;
    }
}
