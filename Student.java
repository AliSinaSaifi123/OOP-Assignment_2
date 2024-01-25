// Class representing a student, extending the Person class
class Student extends Person {
    private double gpa;

    // Default constructor calls the super constructor
    public Student() {
        super();
    }

    // Parameterized constructor with additional GPA
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // Getter and setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // String representation of the student
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Payment amount for a student (considering stipend)
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 42000.00 : 0.0;
    }
}
