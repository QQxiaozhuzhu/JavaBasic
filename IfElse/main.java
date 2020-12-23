package JavaBasic.Chapter_1_Intro.CodingChallenege.IfElse;
import java.util.Scanner;
public class main {
    public static void main(String [] args){
        /*
        Exercise 1: Coding Challenge from Udemy: Java for absolute beginners
        Write a program with two int variables, int x and int y,
        and give each one a value. Depending on their values, print
        “x is bigger than y”, “x is smaller than y”, or “x and y are
        the same”. Change the values and run the program a few times
        to check it works.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = input.nextInt();
        System.out.println("Enter y value");
        int y = input.nextInt();
        if(x < y){
            System.out.println("x is smaller than y");
        } else if ( x > y){
            System.out.println("x is larger than y");
        } else if( x == y){
            System.out.println("x is equal to y");
        } else {
            System.out.println("invalid number");
        }

    }
}
