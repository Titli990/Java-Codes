package Test5;
//3.Create a class Shape with a method draw() that prints "Drawing Shape". Extend this class with subclasses Circle and Rectangle.
// Override the draw() method in both subclasses to print "Drawing Circle" and "Drawing Rectangle" respectively. Access Modifiers:
class Shape1{
    public void draw(){
        System.out.println("Drawing shape: ");
    }
}
class Circle1 extends Shape1{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Circle");
    }
}
class Rectangle1 extends Shape1 {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Rectangle");
    }
}
public class DrawShape {
    public static void main(String[] args) {
        Circle1 a=new Circle1();
        a.draw();
        Rectangle1 b=new Rectangle1();
        b.draw();
    }
}
