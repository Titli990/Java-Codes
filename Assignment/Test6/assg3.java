package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class assg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.out.println("Enter 1st string: ");
        a=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        b=sc.nextLine();
        int l1=a.length();
        int l2=b.length();
        if(l1==l2){
            char[] ch1=a.toCharArray();
            char[] ch2=b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<ch1.length;i++){
                System.out.println(ch1[i]+" ");
            }
            for(int j=0;j<ch2.length;j++){
                System.out.println(ch2[j]+" ");
            }
            if(ch1.length==ch2.length){
                System.out.println("Equal");
            }
        }
    }
}
