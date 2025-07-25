package deneme3;

public class Circle extends Shape{
    public double radius;

    Circle(double radius){
        this.radius=radius;

    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
