public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
    }
}
