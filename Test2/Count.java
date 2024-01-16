package Test1;
import java.util.Scanner;

//3. Write a program to return a count of the total number of students in a class using the concept of static variable and static method.
public class Count {
    static int noOfstudent=0;
    Count(){
        noOfstudent++;
//        System.out.println( noOfstudent);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter the number of Students:\t");
        int n=sc.nextInt();
        Count ob[]=new Count[n];
        for(int i=1;i<=n;i++) {
            Count c1 = new Count();
            System.out.println( noOfstudent);
        }
        System.out.println( noOfstudent);
    }
}
