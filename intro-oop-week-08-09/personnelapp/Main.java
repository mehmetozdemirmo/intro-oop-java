package deneme6;

public class Main {
    public static void main(String[] args) {
        Payable[] people=new Payable[2];
        people[0]=new Employee("john",25,5000);

        people[1]=new Intern("kevin",22);
        for (Payable person: people){
            ((Person)person).displayInfo();
            person.paySalary();
            System.out.println();
        }

    }
}
