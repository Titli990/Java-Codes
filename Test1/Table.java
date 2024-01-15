package Test2;

import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}