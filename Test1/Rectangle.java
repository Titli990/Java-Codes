package Test2;

public class Rectangle {
        public double perimeter(double a,double b){
            double perimeter = 2*(a+b);
            return perimeter;
        }
        public double area(double a,double b){
            double area = a*b;
            return area;
        }
        public static void main(String args[]){
            Rectangle obj=new Rectangle();
            System.out.println("Perimeter = "+obj.perimeter(5.5,8.5));
            Rectangle obj1=new Rectangle();
            System.out.println("Area = "+obj1.area(5.5,8.5));
        }
    }