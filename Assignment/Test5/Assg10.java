package Day1;

import java.util.Scanner;

public class Assg10 {
    public static void main(String[] args) {
        int dividend = 17;
        int divisor = 5;

        int result = divideAndRoundUp(dividend, divisor);
        System.out.println("Result: " + result);
    }

    public static int divideAndRoundUp(int dividend, int divisor) {
        return (int) Math.ceil((double) dividend / divisor);
    }
}
