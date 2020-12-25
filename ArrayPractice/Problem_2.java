package JavaBasic.Chapter_1_Intro.ARRAYS.ArrayPractice;

public class Problem_2 {
    public static void main(String [] args){
        /*
        Exercise 2
        Use a loop to populate an array with integers from 1 to 20. Use another loop to
        print the contents of the array (the elements) backwards.
         */

        int [] arr = new int[20];
        //assigning array
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        //displaying from backwards
        System.out.println("Display array from backwards");
        for(int b = arr.length - 1; b >= 0 ; b--){
            System.out.println(arr[b]);
        }


    }
}
