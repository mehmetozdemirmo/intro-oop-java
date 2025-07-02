public class Main {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 5000);
        Employee partTime = new PartTimeEmployee("Bob", 20, 100);

        fullTime.displayInfo();
        System.out.println("Monthly Salary: $" + fullTime.calculateSalary());

        System.out.println();

        partTime.displayInfo();
        System.out.println("Monthly Salary: $" + partTime.calculateSalary());
    }
}
