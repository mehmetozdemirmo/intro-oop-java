package deneme6;

abstract class Person {
    public String name;
    public int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
