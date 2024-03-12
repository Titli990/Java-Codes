package Day1;

import java.util.Scanner;

public class Assg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1= sc.nextInt();
        System.out.println("Enter num2: ");
        int num2= sc.nextInt();
        int result = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result);
    }
    public static int multiply(int num1, int num2) {
        int product = 0;
        if (num1 < 0 && num2 >= 0) {
            return multiply(-num1, num2);
        } else if (num1 >= 0 && num2 < 0) {
            return multiply(num1, -num2);
        } else if (num1 < 0 && num2 < 0) {
            return multiply(-num1, -num2);
        }
        for (int i = 0; i < num2; i++) {
            product += num1;
        }
        return product;
    }
}
