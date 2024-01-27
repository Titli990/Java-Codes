package Test4;
//1:Create a class Vehicle with attributes like make, model, and year. Then, create two subclasses, Car and Motorcycle.
//Implement appropriate constructors and methods to showcase inheritance.

class Vehicle{
    String make;
    String model;
    int year;
}
class Car extends Vehicle {
    String make;
    String model;
    int year;
        Car(String make,String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Car info:");
    }
}
class Motorcycle extends Vehicle {
    String make;
    String model;
    int year;
     Motorcycle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Motorcycle info:");
    }
}
public class VehicleInfo {
    public static void main(String[] args) {
        Car ob1=new Car("Maruti Suzuki","Alto 800",2017);
        System.out.println(ob1.make+" "+ob1.model+" "+ob1.year);
        Motorcycle ob2=new Motorcycle("Honda"," SP 125 ",2015);
        System.out.println(ob2.make+" "+ob2.model+" "+ob2.year);
    }
}
