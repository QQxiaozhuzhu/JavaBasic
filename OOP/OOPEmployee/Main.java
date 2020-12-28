package JavaBasic.Chapter_1_Intro.OOP.OOPEmployee;

public class Main {
    public static void main(String [] args ){
        Employee employee = new Employee();

        employee.name = "Chen";
        employee.age = 27;
        employee.jobTitle ="Student";

        bar(employee);
        System.out.println("Employee age is : " + employee.age);
    }
    public static void bar(Employee employee){
        System.out.println(employee.name + " is " + employee.age + " years old  and is a " + employee.jobTitle );
        employee.age = 28;
    }
}
// state: what kind of data can you collect with chair
//behavior: often have an effect
