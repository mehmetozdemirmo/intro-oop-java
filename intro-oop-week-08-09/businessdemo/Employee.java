package deneme5;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "name = " + name +"salary = " + salary;
    }
}
