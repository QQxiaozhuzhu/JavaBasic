package JavaBasic.Chapter_1_Intro.ARRAYS.ArrayPractice;
import java.util.Scanner;
public class Problem_4 {
    public static void main(String [] args){
        /*
        Exercise 4
        Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        However, create the array so it can only hold a maximum of three strings. After the user enters the third item, print
        “No more memory available.”, then print out the contents of the array.

        Note: For this program use scanner.nextLine() when grabbing input from the user. This is because if the user enters a
        food such as “Ice cream” then scanner.next() will interpret that as two separate strings, due to the space.
        This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another. However,
        if you use scanner.nextLine(), it will return the entire line as a single string.
         */
        String [] array = new String[3];
        System.out.println("Please enter your top five Favorite foods: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< array.length; i++) {
            array [i] = input.nextLine();
            if( i == 2){
                System.out.println("\nNo more Memory available");
            }
        }
        System.out.println("Displaying your favorite foods");
        for(int j = 0; j < array.length; j++){
            System.out.println("Array contents: " + array[j]);
        }
    }
}
