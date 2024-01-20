package Test1;

import java.util.Scanner;

//6.Develop a TemperatureConverter class with static methods to convert temperatures between Celsius and Fahrenheit.
// Create an App class that uses these methods to convert temperatures entered by the user.
public class Temperature {
    static float converter1(float F){
        return ((F * 9) / 5) + 32;
    }
    static float converter2(float C){
        return ((C - 32) / 9) * 5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius temperature:");
        float a=sc.nextFloat();
        System.out.println("Fahrenheit temperature is: "+converter1(a));
        System.out.println("Enter the fahrenheit temperature:");
        float b=sc.nextFloat();
        System.out.println("Celsius temperature is: "+converter2(b));
    }
}