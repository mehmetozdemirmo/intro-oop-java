package lab9.shapes3d;

import lab9.shapes2d.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius,double height) {
        super(radius);
        this.height=height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public double area(){
        return 2 * super.area() + height * 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Cylinder: "+"volume=" + volume() + "/ area: " + area();
    }
}
