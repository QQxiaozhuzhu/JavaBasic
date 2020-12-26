package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

import java.util.Scanner;
public class Exercise_2 {
    public static void main(String [] args) {
        //Creating sample guest list program
        /*
Exercise 2
Above the guests and the menu, add some sort of title. Below is one possible solution which uses a series of
underscores to form a line which acts as a separator. Underneath these lines are suitable titles with two dashes
either side.
______________________________
- Menu -

1 - Display All Guests
2 - Add Guest
3 - Remove Guest
4 - Exit
Option: 1
______________________________
- Guests -

Jacob
Michelle
Rose
Molly
Christopher
--
--
--
--
--
______________________________
- Menu -

1 - Display All Guests
2 - Add Guest
3 - Remove Guest
4 - Exit
Option:

         */
        Scanner input = new Scanner(System.in);
        String[] guests = new String[10];

        do {
            System.out.println("------------------------");
            System.out.println("-Menu-");
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
                        System.out.println("------------------------");
                        System.out.println("- Guests - ");
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
