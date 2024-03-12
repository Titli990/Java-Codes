package Day1;
import java.util.Scanner;
public class Assg6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int a = sc.nextInt();
            sc.close();

            String binaryString = Integer.toBinaryString(a);
            System.out.println("Binary representation: " + binaryString);

            int countZeroBits = countZeroBits(binaryString);
            System.out.println("Number of zero bits: " + countZeroBits);
        }

        public static int countZeroBits(String binaryString) {
            int count = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    count++;
                }
            }
            return count;
        }
}
