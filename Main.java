import java.util.ArrayList;
import java.util.Collections;

// Main class for testing the Person, Employee, and Student classes
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store people
        ArrayList<Person> people = new ArrayList<>();

        // Add employees and students to the list
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Myrzan", "Myrzakhan", 2.5));
        people.add(new Student("Ali Sina", "Saifi", 3.0));

        // Sort the list based on the payment amount
        Collections.sort(people);

        // Call the printData method
        printData(people);
    }

    // Method to print data for each person
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
