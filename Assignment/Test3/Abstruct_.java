package Test5;
//7:Create an abstract class Shape with an abstract method calculateArea(). Implement this class with two subclasses, Circle and Rectangle.
// Additionally, create an interface Drawable with a method draw(). Implement this interface in the Circle class.
// Demonstrate the use of abstract classes and interfaces.
abstract class Shape{
    abstract void calculateArea();
}
class Circle extends Shape implements Drawable{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    @Override
    void calculateArea() {
        double a = Math.PI*radius*radius;
        System.out.println("Area of the Circle is: "+a);
    }

    @Override
    public void draw() {
        System.out.println("This is a Circle");
    }
}
class Rectangle extends Shape{
    float length,width;
    Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    @Override
    void calculateArea() {
        double b=length*width;
        System.out.println("Area of the Rectangle is: "+b);
    }
}
interface Drawable{
    void draw();
}

public class Abstruct_ {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.calculateArea();
        c.draw();
        Rectangle r=new Rectangle(6,2);
        r.calculateArea();
    }
}
