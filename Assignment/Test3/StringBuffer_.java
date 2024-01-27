package Test4;
//4:Implement a program that uses StringBuffer to perform the following operations:
//Append two strings.
//Insert a string at a specific position.
//Delete a substring from the buffer.

public class StringBuffer_ {
    public static void main(String[] args) {
        //Append two strings.
        StringBuffer a=new StringBuffer("Hello ");
        a.append(" I'm Supriti");
        System.out.println(a);

        //Insert a string at a specific position.
        a.insert(5," Everyone");
        System.out.println(a);

        //Delete a substring from the buffer.
        a.delete(6,15);
        System.out.println(a);
    }
}
