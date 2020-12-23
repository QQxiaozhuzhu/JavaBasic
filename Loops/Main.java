package JavaBasic.Chapter_1_Intro.Loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String [] args){
        //while Loop
        int count = 0;
        while(count < 10){
            if( count  == 3){
                System.out.println("Count 3 is reached");
            break;
            }
            System.out.println("HI");
            count++;
        }

        //Do while Loop
        System.out.println("\nDo While Loop Condition: ");
        Scanner input = new Scanner(System.in);
        String repeat;

        do{
            int num = ThreadLocalRandom.current().nextInt(1,7   );
            System.out.println("You rolled a " + num + ". ");
            System.out.println("Roll again? Y/N:");
            repeat = input.nextLine();
        }while(repeat.equals("Y"));
    }
}
