package Test1;
//1. Write a program to print the roll number and average marks of each student in three subjects (each out of 100).
// The marks are entered by user. [ use array of objects]
import java.util.Scanner;

public class Result {
    int roll;
    Result(int roll){
        this.roll=roll;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int math;
        int eng;
        int geo;
        System.out.println("Enter the no. of Students:\t");
        n=sc.nextInt();;
        for(i=1;i<=n;i++){
            Result ob=new Result(i);
            System.out.println("Student roll number is = "+ob.roll);
            System.out.println("Enter the number of math for roll "+ob.roll+":\t");
            math=sc.nextInt();
            System.out.println("Enter the number of for roll "+ob.roll+" eng:\t");
            eng=sc.nextInt();
            System.out.println("Enter the number of for roll "+ob.roll+" geo:\t");
            geo=sc.nextInt();
            int avg=(math+eng+geo)/3;
            System.out.println("Student "+ob.roll+" marks is = "+avg);
        }

    }
}
