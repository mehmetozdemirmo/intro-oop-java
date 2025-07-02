package personapp;

public class Student extends Person{
    public int studentId;

    public Student(int age, String name, int studentId) {
        super(age, name);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
