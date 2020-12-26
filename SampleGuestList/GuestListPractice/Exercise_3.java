package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

import java.util.Scanner;
public class Exercise_3 {
    public static void main(String [] args) {
        //Creating sample guest list program
        /*
Exercise 3
Move the section of code which displays the guests into its own method called displayGuests(),
and call the method instead.

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
                displayGuest(guests);
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

    public static void displayGuest(String[] guest){
        for (int i = 0; i < guest.length; i++) {
            System.out.println(guest[i] == null? "--" : guest[i]);
//                    if(guests[i] == null){
//                        System.out.println("--");
//                    } else
//                    System.out.println(guests[i]);
        }
    }
}
