package JavaBasic.Chapter_1_Intro.Loops.CodeChallenge;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String [] args) {
        /*
        Write a program which prints numbers from 89 to 117.
         */
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

        System.out.println("\n");
        /*
        Exercise 2
        Write a program which prints numbers from 1 to 40. After every third number,
        print “Quack.”.
         */
        int count = 0;
        for (int i = 1; i <= 40; i++) {
            System.out.println(i);
//            if(i % 3 == 0){
//                System.out.println("Quack");
//            }
            count++;
            if (count == 3) {
                System.out.println("Quack");
                count = 0;
            }
        }
        /*
        Exercise 3
        Write a program which asks the user for a password. Make the password “shark50”.
        Each time the user enters
        the password incorrectly, prompt them for a password again. When the user
        enters the password correctly, print “ACCESS APPROVED”.
         */
        System.out.println();
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("Please enter a password:");
            password = input.next();
        } while (!password.equals("shark50"));

        System.out.println("ACCESS APPROVED");

        /*
        Exercise 4
        Write a program which makes use of a loop to print the following output:
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
         */

        for (int j = 0; j <= 10; j++) {
            System.out.print(j + ", ");

        }
        //\b is backspace character. It moves the cursor one character back with or without deleting the character
        System.out.println("\b\b.");



        /*
        Exercise 5
        Create a game where the program picks a random number from 1 to 100 and the player has to guess it. Each time
        the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
        If the player correctly guesses the number, print “CORRECT”, then end the game.
        You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        Exercise 6
        Modify the program in Exercise 5 so that once the game is won, it informs
        the player how many guesses it took them.
         */


        System.out.println("Exercise 5");
        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        int guessNum;
        int numberOfTimeGuessed = 0;
        do {
            System.out.print("Please enter a guess number: ");
            guessNum = input.nextInt();
            if (guessNum < randomNum)
                System.out.println("Higher");

            if (guessNum > randomNum)
                System.out.println("Lower");
            numberOfTimeGuessed++;
        }
        while (!(guessNum == randomNum));
        System.out.println("Correct!");
        System.out.println("Number of time guessed is: " + numberOfTimeGuessed);

    }

}
