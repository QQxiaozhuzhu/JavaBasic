package JavaBasic.Chapter_1_Intro.Practice;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise_3 {
    public static void main(String [] args){
/*
Exercise 3
Back in “Coding Challenge 4 - Loops”, for Exercise 5, you were tasked to write a guess-my-number game. The program
picked a random number from 1 and 100 and you had to guess it.
This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries to guess it.
Type “higher” if the program guesses too low, or “lower” if the program guesses too high. Have the program make
subsequent guesses based on this information. When the program guesses your number type “correct” and end the program.

Hint: Remember, if you need it, you can use the following line of code to generate a random number
int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
 */
    Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your pick number");
        int pickNumber = userInput.nextInt();
        while(true){
            int guessNumberFromPc = ThreadLocalRandom.current().nextInt(1,101);
            if(pickNumber < guessNumberFromPc){
                System.out.println("Guess number too low, Try Higher");
            } else if( pickNumber > guessNumberFromPc){
                System.out.println("Guess number too high, Try Lower");
            } else if ( pickNumber == guessNumberFromPc){
                System.out.println("Correct");
                break;
            } else{
                System.out.println("invalid number");
            }
        }

    }
}
