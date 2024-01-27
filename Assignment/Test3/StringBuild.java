package Test4;
//5:Create a program that uses StringBuilder to perform the following operations:
//Concatenate two strings.
//Reverse a string.
//Replace a substring with another substring.
public class StringBuild {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("Hello Everyone");
        StringBuilder str2=new StringBuilder(" I'm Supriti");

        //Concatenate two strings.
        str1.append(str2);
        System.out.println(str1);

        String s=" ";
        //Reverse a string.
        for(int i=str1.length()-1; i>=0; i--){
            s=s+str1.charAt(i);
        }
        System.out.println(s);

        //Replace a substring with another substring.
        str1.replace(6,14,"World");
        System.out.println(str1);
    }
}
