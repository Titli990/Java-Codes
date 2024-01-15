package Test2;

public class Circle {
    public double perimeter(double n){
        double perimeter = 2*3.14*n;
        return perimeter;
    }
    public double area(double n){
        double area = 3.14*n*n;
        return area;
    }
    public static void main(String args[]){
        Circle obj=new Circle();
        System.out.println("Perimeter is = "+obj.perimeter(7.5));
        Circle obj1=new Circle();
        System.out.println("Area is = "+obj1.area(7.5));
    }
}
