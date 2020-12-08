package JavaBasic.Chapter_1_Intro;
import java.util.Scanner;
public class main {
    public static void main(String [] args){
    /*
    It prints “You’ve lived x years. In another x years you’ll be 2x years old.”, where x is their age.

    It informs the user of how many characters are in their name.
     */
    Scanner input = new Scanner(System.in);
    String name;
    int age;
        System.out.println("what's your name?");
        name = input.nextLine();
        System.out.println("my name is " + name + " and it has " + name.length() + "" +
                " characters in it.");

        System.out.println("\nWhat is your age: ");
        age = input.nextInt();
        System.out.println("You've lived " + age + " tears. In another " + age + " years" +
                " you'll  be " + 2 * (age) +" years old.");


    }
}
