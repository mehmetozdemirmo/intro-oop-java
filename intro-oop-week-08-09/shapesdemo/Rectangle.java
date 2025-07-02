package deneme3;

public class Rectangle extends Shape{
    public double widht,height;

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(widht+height);
    }

    @Override
    double calculateArea() {
        return height*widht;
    }
}
