package Test4;
//2:Define a class Animal with methods like eat and sleep. Create two subclasses, Mammal and Bird, representing different types of animals.
// Demonstrate single inheritance, multi-level inheritance, and hierarchical inheritance.

class Animal {
    void eat(){
        System.out.println("I am eating");
    }
    void sleep() {
        System.out.println("Sleeping at night");
    }
}
class Mammal extends Animal {

}
class Bird extends Animal {

}
public class AnimalInfo {
    public static void main(String[] args) {
        Mammal Human = new Mammal();
        System.out.println("Mammal=>");
        Human.eat();
        Human.sleep();
        Bird Parrots = new Bird();
        System.out.println("Bird=>");
        Parrots.eat();
        Parrots.sleep();
    }
}
