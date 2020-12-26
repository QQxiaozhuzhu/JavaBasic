package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

import java.util.Scanner;
public class Exercise_1 {
    public static void main(String [] args) {
        //Creating sample guest list program
        /*
Exercise 1
Whenever a null is encountered in the array, don’t print null, print two dashes instead.
End result:
--
Michelle
--
Molly
Christopher
--
--
--
--
--
         */
        Scanner input = new Scanner(System.in);
        String[] guests = new String[10];

        do {
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit the program");
            System.out.print("Option: ");
            int option = input.nextInt();
            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    System.out.println(guests[i] == null? "--" : guests[i]);
//                    if(guests[i] == null){
//                        System.out.println("--");
//                    } else
//                    System.out.println(guests[i]);
                }
                // condition ? a : b
            }else if( option == 2){
                for(int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        String names = input.next();
                        guests[i] = names;
                        break;
                    }
                }
            } else if ( option == 3){
                System.out.print("Name: ");
                String name = input.next();
                for(int i = 0; i < guests.length; i++){
                    if(guests[i] != null && guests[i].equals(name) ){
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if(option == 4){
                System.out.println("Exiting....");
                break;
            }
            System.out.println();
        } while (true);
    }
}
