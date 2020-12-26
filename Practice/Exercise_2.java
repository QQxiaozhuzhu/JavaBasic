package JavaBasic.Chapter_1_Intro.Practice;
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String [] args){
        /*
Exercise 2
Write a quiz program with five true-or-false questions. Display a question to the user, and ask the user to enter either
true or false, then move on to the next question. At the end of the quiz display the user’s score.
Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean array
for the user’s answers.

Hints:
You can use the Scanner’s nextBoolean() method to get the user’s input
Because the questions, answers, and user’s answers are stored in three separate arrays, you can use their indexes to
associate them (e.g. index 1 in the answers array correlates to index 1 in the questions array)
         */
        Scanner userInput = new Scanner(System.in);
        String [] strings = new String[5];
        Boolean[] booleans = new Boolean[5];
        Boolean[] boolAns = new Boolean[5];
        int i = 0;
        int score = 0;
        System.out.println("True/False questions below: 5 Questions only");
        strings[0] = " 5 + 5 = 10 ?";
        strings[1] = " 10 + 12 = 22 ?";
        strings[2]= " 1 + 3 = 5 ?";
        strings[3]= " 10 * 10 = 100 ?";
        strings[4] = " 20 * 20 = 20 ?";

        for(int k = 0; k < strings.length; k++){
            System.out.println("Question " + k  + " is: " + strings[k]);
        }
        //Storing Answers
        booleans[0] = true;
        booleans[1] = true;
        booleans[2] = false;
        booleans[3] = true;
        booleans[4] = false;

        System.out.println("Student Answers: ");
        for (i = 0; i < strings.length; i++) {
            boolAns[i] = userInput.nextBoolean();

            if (booleans[i] == boolAns[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer for question " + i + " is " + booleans[i]);
            }
        }
        System.out.println("Total score is: " + score);
    }
}
