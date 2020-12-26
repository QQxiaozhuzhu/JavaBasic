package JavaBasic.Chapter_1_Intro.Practice;

import java.util.Scanner;
public class Exercise_1 {
    public static void main(String [] args){
        /*
Exercise 1

You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
The users are teachers who will input each student’s score, and any other necessary data. Store the scores in an array.
The program should output:
Each student’s score and percentage for the exam
The mean (average) score and percentage of the exam

Hints:
Have the program ask how many students took the exam, so it knows how many scores to process.

The program will also need to know the maximum possible score that can be achieved.

It will also need to ask the user to input each student’s score (you can refer to each student as a number, e.g.
“Student 1”, “Student 2”, etc, rather than asking for names.)
         */
        Scanner input = new Scanner(System.in);
        int student_Size = 0;
        double percentage = 0 ;
        System.out.println("Teachers: Please enter your class size: ");
        student_Size = input.nextInt();
        System.out.println("Enter student score below:");
        double [] studentScores = new double[student_Size];
        for(int i = 0; i < studentScores.length ; i++){
            studentScores[i] = input.nextInt();
        }

        int sum = 0;
        for(int j = 0;  j < studentScores.length; j++ ){
            double studentScore = studentScores[j];
            percentage = ((studentScores[j] / 100) * 100);
            System.out.println("Student " + (j + 1) + ": " + studentScore + "/" + " (" + percentage + "%)");
            sum += studentScore;
        }

        double mean = sum / studentScores.length;
        double meanPercentage  = (mean / 100) * 100 ;
        System.out.println("Mean is: " + mean + " percentage is: " + meanPercentage);

    }
}
