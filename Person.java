import java.util.ArrayList;
import java.util.Collections;

// Base class representing a person
class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String surname;

    // Default constructor increments the ID counter
    public Person() {
        this.id = idCounter++;
    }

    // Parameterized constructor with name and surname
    public Person(String name, String surname) {
        this();  // Calls the default constructor to set ID
        this.name = name;
        this.surname = surname;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getters and setters for name and surname
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // String representation of the person
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // Default position for a person
    public String getPosition() {
        return "Person";
    }

    // Default payment amount for a person
    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    // Comparison based on payment amount for sorting
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
