import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();


        people.add(new Employee("Elvis", "Presley", "Director", 35000.00));  
        people.add(new Employee("David", "Bowie", "Senior Developer", 60000.00));  
        people.add(new Student("Mick", "Jagger", 3.0));  
        people.add(new Student("Freddie", "Mercury", 3.8));  



        Collections.sort(people, (p1, p2) -> Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount()));


        printData(people);
    }

    public static void printData(Iterable<Payable> list) {
        for (Payable p : list) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}
