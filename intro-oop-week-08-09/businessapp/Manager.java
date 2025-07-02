package businessapp;

public class Manager extends Employee{
    public String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("department = " + department);
    }
}
