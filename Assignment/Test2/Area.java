package Test1;
//2. Write a program to calculate the area of a circle, square, rectangle and cylinder using the concept of method overloading.
public class Area {
    public static double area(double n){
        return 3.14*n*n;
    }
    public static float area(int x){
        double area = x*x;
        return (int) area;
    }
    public static double area(double a,double b){
        return a*b;
    }
    public static double area(float r,float h){
        double area = (2*3.14*r)+(2*3.14*h);
        return area;
    }
    public static void main(String[] args) {
        Area ob1=new Area();
        System.out.println("Area of a Circle = "+ob1.area(5.5));
        Area ob2=new Area();
        System.out.println("Area of a Square = "+ob1.area(5));
        Area ob3=new Area();
        System.out.println("Area of a Rectangle = "+ob3.area(5.5,8.5));
        Area ob4=new Area();
        System.out.println("Area of a Cylinder = "+ob4.area(2.5f,3.5f));
    }
}