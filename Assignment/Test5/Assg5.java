package Day1;
import java.util.Scanner;
public class Assg5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Input 1st integer: ");
            int a = sc.nextInt();
            System.out.print("Input 2nd integer: ");
            int b = sc.nextInt();
            sc.close();

            int sum = a + b;
            int difference = a - b;
            int product = a * b;
            double average = (double) (a + b) / 2;
            int distance = Math.abs(a - b);
            int maxInt = Math.max(a, b);
            int minInt = Math.min(a, b);

            System.out.println("Output: ");
            System.out.println("Sum of two integers: " + sum);
            System.out.println("Difference of two integers: " + difference);
            System.out.println("Product of two integers: " + product);
            System.out.printf("Average of two integers: %.2f\n", average);
            System.out.println("Distance of two integers: " + distance);
            System.out.println("Max integer: " + maxInt);
            System.out.println("Min integer: " + minInt);
        }
    }

