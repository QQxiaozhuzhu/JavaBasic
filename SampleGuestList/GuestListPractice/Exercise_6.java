package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

/*
Exercise 6
Print a number beside each guest from 1 to 10.

End Result:

1. Jacob
2. Edward
3. Rose
4. Molly
5. Christopher
6. --
7. --
8. --
9. --
10. --
 */

import java.util.Scanner;
public class Exercise_6 {

    static   Scanner input = new Scanner(System.in);
    static    String[] guests = new String[10];
    public static void main(String [] args) {
        do {
            displayMenu();
            int option =  getOption();

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

    public static void displayMenu(){
        System.out.println("------------------------");
        System.out.println("-Menu-");
        System.out.println("1 - Display All Guests");
        System.out.println("2 - Add Guest");
        System.out.println("3 - Remove Guest");
        System.out.println("4 - Exit the program");
    }
    public static int getOption(){
        System.out.print("Option: ");
        int option = input.nextInt();
        return option;
    }

    public static void displayGuest(String[] guest){
        for (int i = 0; i < guest.length; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(guest[i] == null? "--" : guest[i]);

//                    if(guests[i] == null){
//                        System.out.println("--");
//                    } else
//                    System.out.println(guests[i]);
        }
    }
}
