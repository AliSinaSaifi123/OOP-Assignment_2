// Class representing an employee, extending the Person class
class Employee extends Person {
    private String position;
    private double salary;

    // Default constructor calls the super constructor
    public Employee() {
        super();
    }

    // Parameterized constructor with additional position and salary
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getter and setter for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter and setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // String representation of the employee
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Payment amount for an employee
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
