package Test4;
//6:Define a class Shape with a method area(). Create subclasses like Circle, Rectangle, and Triangle.
// Implement the area() method in each subclass and demonstrate polymorphism by calculating and displaying the area of different shapes.
import java.util.Scanner;

class Shape{
    public float calculateArea(){
        return (float) 0.0;
    }
}
class Circle extends Shape{
    float r;
    @Override
    public float calculateArea() {
        return (float) 3.14*r*r;
    }
}
class Rectangle extends Shape{
    float l,w;

    @Override
    public float calculateArea() {
        return (float) l*w;
    }
}
class Triangle extends Shape{
    float h,b;

    @Override
    public float calculateArea() {
        return (float) (h*b)/2;
    }
}
public class calculateArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter the radius:\t");
        c.r=sc.nextFloat();
        System.out.println("Area of the Circle is: "+c.calculateArea());
        Rectangle r = new Rectangle();
        System.out.println("Enter the length:\t");
        r.l=sc.nextFloat();
        System.out.println("Enter the width:\t");
        r.w=sc.nextFloat();
        System.out.println("Area of the Rectangle is: "+r.calculateArea());
        Triangle t=new Triangle();
        System.out.println("Enter the base:\t");
        t.b=sc.nextFloat();
        System.out.println("Enter the height:\t");
        t.h= sc.nextFloat();
        System.out.println("Area of the Triangle is: "+t.calculateArea());
    }
}
