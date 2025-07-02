package deneme6;

public class Employee extends Person implements Payable{
    public double salary;

    public Employee(String name,int age,double salary){
        super(name,age);
        this.salary=salary;
    }

    public void paySalary(){
        System.out.println("paying salary"+ salary);
    }
}
