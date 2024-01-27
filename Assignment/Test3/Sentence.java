package Test4;

import java.util.Scanner;

//3: Write a program that takes a sentence as input and prints the following:
//Number of words in the sentence.
//Number of vowels and consonants.
//The sentence in reverse order
public class Sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:\t");
        String str=sc.nextLine();

        //Number of words in the sentence.
        System.out.println("Number of words=\t"+str.length());

        //Number of vowels and consonants.
        int v=0,c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
                    str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("Number of vowels= "+v);
        System.out.println("Number of consonants= "+c);

        //The sentence in reverse order
        String s=" ";
        for(int i=str.length()-1; i>=0; i--){
            s=s+str.charAt(i);
        }
        System.out.println("Reversed sentence is= "+s);
    }
}
