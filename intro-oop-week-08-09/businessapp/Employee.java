package businessapp;

public class Employee extends Person{
    public double salary;

    Employee(String name,int age,double salary){
        super(name,age);
        this.salary=salary;

    }

    void printInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
    }
}
