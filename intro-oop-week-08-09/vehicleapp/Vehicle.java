package deneme2;

public class Vehicle {
    public String brand;
    public int year;

    Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }

    public void startEngine(){
        System.out.println("Engine started.");
    }

}
