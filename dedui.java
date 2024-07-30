public class JavaStudy08 {

    // Fields (variables) - These could represent attributes of your class
    private String name;
    private int age;
    private double salary;

    // Constructor - Initializes the object when it is created
    public JavaStudy08(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Methods - These define the behavior of your class
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Creating an object of the JavaStudy08 class
        JavaStudy08 employee = new JavaStudy08("John Doe", 30, 50000);

        // Calling methods on the object
        employee.displayDetails();

        // Modifying salary using a setter method
        employee.setSalary(55000);
        System.out.println("Updated Salary: $" + employee.salary);
    }
}
