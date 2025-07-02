package deneme3;

public class Main {

    public static void main(String[] args) {
        Shape c=new Circle(5);
        Shape r=new Rectangle(5,5);

        r.display();
        System.out.println("r.calculateArea() = " + r.calculateArea());
        System.out.println("r.calculatePerimeter() = " + r.calculatePerimeter());

        c.display();
        System.out.println("c.calculatePerimeter() = " + c.calculatePerimeter());
        System.out.println("c.calculateArea() = " + c.calculateArea());
    }
    
    
    
    
}
