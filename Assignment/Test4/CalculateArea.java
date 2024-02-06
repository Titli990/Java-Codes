package Test5;
//1.Create a class Circle with a final variable PI initialized to 3.14. Implement a method calculateArea() that calculates and
// returns the area of a circle given its radius.
class Circle2{
    final float PI= 3.14F;
    public float area(float radius){
        float area = (float) (PI*radius*radius);
        return area;
    }
}
public class CalculateArea {
    public static void main(String[] args) {
        Circle2 a=new Circle2();
        System.out.println("Area of a Circle=> "+a.area(5));
    }
}
