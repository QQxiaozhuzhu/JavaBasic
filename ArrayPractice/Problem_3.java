package JavaBasic.Chapter_1_Intro.ARRAYS.ArrayPractice;

public class Problem_3 {
    public static void main(String [] args){

        /*
        Exercise 3
        Create an array of five doubles and give each element some value. Calculate the sum of all
        the elements and print the result. Calculate the mean/average of the all the elements and print that too.
         */

        double [] arr = new double [5];
        double totalSum = 0;
        double average = 0;
        System.out.println("Assigning values to array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + Math.random() * 100;
            totalSum = totalSum + arr[i];
        }
        //display array elements
        for(int j = 0; j< arr.length; j++){
            System.out.println("Array index: " + j + " = " + arr[j]);
        }
        System.out.println();
        average = totalSum / arr.length;
        System.out.println("Total Sum is: " + totalSum);
        System.out.print("Total average is: " + average);
    }
}
