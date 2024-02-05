package Test5;

//2.Define a superclass Vehicle with attributes speed and capacity. Create a subclass Car that inherits from Vehicle and adds a new attribute
// model. Implement a method displayDetails() in Car that displays all attributes including those from the superclass. Inheritance:
abstract class Vehicle{
    abstract void Speed();
    abstract void Capacity();
}
class Car extends Vehicle{
    String speed, capacity,model;
    Car(String speed,String capacity,String model){
        this.speed=speed;
        this.capacity =capacity;
        this.model=model;
    }
    @Override
    void Speed () {
        System.out.println("Speed of this car is:\t"+speed);
    }
    @Override
    void Capacity () {
        System.out.println("Fuel Tank Capacity of this car is:\t"+ capacity);
    }
    public void Model () {
        System.out.println("Model of this car is:\t"+model);
    }
    public void displayDetails(){
        System.out.println("All information of the car is:\n");
        Speed();
        Capacity();
        Model();
    }
}
public class CarInfo {
    public static void main(String[] args) {
        Car x=new Car( "145 Kmph","35 litres","Maruti Suzuki Alto k10");
        x.displayDetails();
    }
}
