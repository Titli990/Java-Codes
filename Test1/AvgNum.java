package Test2;

import java.util.Scanner;

public class AvgNum {
    public static void main(String args[]) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        System.out.println("Enter the number: ");
        b = sc.nextInt();
        System.out.println("Enter the number: ");
        c = sc.nextInt();
        int avg =(a+b+c)/3;
        System.out.println("Average of the numbers is:\n"+avg);
    }
}
