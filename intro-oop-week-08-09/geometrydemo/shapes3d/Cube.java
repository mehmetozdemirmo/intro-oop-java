package lab9.shapes3d;


import lab9.shapes2d.Square;

public class Cube extends Square {


    public Cube(double side) {
        super(side);
    }
    public double area(){
        return 6*super.area();
    }
    public double volume(){
        return super.area()*side;
    }
    public String toString() {
        return "Cube: " + "volume=" + volume() + "/ area: " + area();
    }
}
