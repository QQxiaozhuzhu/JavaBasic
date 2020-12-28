package JavaBasic.Chapter_1_Intro.OOP;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Thing thing = new Thing();
        //setting num  = 5;
        thing.num = 5;
        //setting word = " Hi"
        thing.word = "Hi";

        //same here
        Thing thing2 = new Thing();
        thing2.num = 10;
        thing2.word = "HI Hi";

        //adding num 1 and num 2 together
        System.out.println(thing.num + thing2.num );
        //calling foo method
        thing.foo();
    }
}
/*
Notes:
* Objects are created from classes
* A class serves as a blueprint from which you can create one or more objects
*
 */
