package deneme6;

public class Intern extends Person implements Payable{

    public Intern(String name, int age) {
        super(name, age);
    }

    @Override
    public void paySalary() {
        System.out.println("Interns don't receive a salary");
    }


}
