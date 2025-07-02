package deneme2;

public class Car extends Vehicle{
    public String fuelType;

    Car(String brand,int year,String fuelType){
        super(brand,year);
        this.fuelType=fuelType;
    }

    public void startEngine(){
        System.out.println("starting "+ fuelType +" engine of "+brand );
    }
}
