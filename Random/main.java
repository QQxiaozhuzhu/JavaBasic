package JavaBasic.Chapter_1_Intro.CodingChallenege.IfElse;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String [] args){
        /*
        Exercise 1:
        Coding Challenge from Udemy: Java for absolute beginners
        Write a program with two int variables, int x and int y,
        and give each one a value. Depending on their values, print
        “x is bigger than y”, “x is smaller than y”, or “x and y are
        the same”. Change the values and run the program a few times
        to check it works.

        Exercise 2

        Modify the program from Exercise 1 so it also prints the difference between x and y.Exercise 2

        Modify the program from Exercise 1 so it also prints the difference between x and y.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = input.nextInt();
        System.out.println("Enter y value");
        int y = input.nextInt();
        if(x < y){
            System.out.println("x is smaller than y");
            System.out.println("The difference between x and y is : " + (x - y));
        } else if ( x > y){
            System.out.println("x is larger than y");
            System.out.println("The difference between x and y is : " + (x - y));
        } else if( x == y){
            System.out.println("x is equal to y");
            System.out.println("The difference between x and y is : "+ (x - y));
        } else {
            System.out.println("invalid number");
        }
          */
        /*
        Exercise 3
        Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.

        If the player guesses right, print “Correct! Aren’t you lucky.“.

        If the player guesses wrong, print “Hard luck! Maybe next time.“.

        You can use the line of code below which produces a random number from 1 to 5 and
        stores it in a variable called randomNumber.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1-6");
        int guessNumber = input.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6  );
//        int randomNumber = (int)(1+ Math.random()*5);

        if(guessNumber == randomNumber){
            System.out.println("Correct! Aren't you lucky.");
        } else {
            System.out.println("Hard Luck! Maybe next time.");
            System.out.println("Random Number is: " + randomNumber);
            System.out.println("One more Chance");
            guessNumber = input.nextInt();
            if(guessNumber == randomNumber){
                System.out.println("Yay!~ Finally.");
            } else {
                System.out.println("Wrong Again! maybe next time");
                System.out.println("Random Number is: " + randomNumber);
            }
        }


    }
}
