package JavaBasic.Chapter_1_Intro.ARRAYS.ArrayPractice;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
    /*
    Exercise 1
    Create an integer array of 10 elements and give each element an arbitrary value.
    Print out the entire array using a loop.
     */
        int[] array = new int[10];
        array [0]= 10;
        array [1] = 20;
        array [2] = 30;
        array [3] = 40;
        array [4] = 50;
        array [5] =  60;
        array [6] = 70;
        array [7] = 80;
        array [8] = 90;
        array [9] = 100;

        for(int i = 0 ; i < array.length; i++){
            System.out.println("Array index " + i + " = " + array[i]);
        }
    }
}
