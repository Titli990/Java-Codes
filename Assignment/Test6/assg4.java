package Day2;

import java.util.Scanner;

public class assg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=arr.length+1;
        int ts=(p*(p+1))/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        int missing =ts-arrsum;
        System.out.println("The missing number is: "+missing);
    }
}
