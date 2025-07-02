package personapp;

public class Person {
    public String name;
    public int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

