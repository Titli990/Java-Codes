package Day1;

import java.util.Scanner;

public class Assg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int a = sc.nextInt();

        int sum = 0;
        int num = a;

        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;
        }
        System.out.println("The sum of all digits in " + num + " is " + sum);
        sc.close();
    }
}
