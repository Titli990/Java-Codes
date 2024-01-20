package Test1;
//4.Create an Employee class with attributes empId, empName, empSalary. Implement constructor overloading to initialize the employee
// attributes based on different parameters. Use a static variable totalEmployees to keep track of the number of employees created.

public class Employee {
    int  empId;
    String empName;
    float empSalary;
    static int totalEmployees;
    Employee(int empId,String empName,float empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
        totalEmployees++;
    }
    public static void main(String[] args) {
        Employee ob=new Employee(110,"Ram",5000.21f);
        Employee ob1=new Employee(124,"Shyam",9000);
        Employee ob2=new Employee(210,"Sunny",8542.85f);
        System.out.println("Id is= "+ob.empId+" \tName= "+ob.empName+" \tSalary= "+ob.empSalary);
        System.out.println("Id is= "+ob1.empId+" \tName= "+ob1.empName+" \tSalary= "+ob1.empSalary);
        System.out.println("Id is= "+ob2.empId+" \tName= "+ob2.empName+" \tSalary= "+ob2.empSalary);
        System.out.println("Number of employees= "+totalEmployees);
    }
}
