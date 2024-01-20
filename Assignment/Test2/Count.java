package Test1;
//3. Write a program to return a count of the total number of students in a class using the concept of static variable and static method.
public class Count {
    static int noOfstudent=0;
    Count(){
        noOfstudent++;
//        System.out.println( noOfstudent);
    }
    public static void main(String[] args) {
        Count ob=new Count();
        Count ob1=new Count();
        Count ob2=new Count();
        System.out.println( noOfstudent);
    }
}
