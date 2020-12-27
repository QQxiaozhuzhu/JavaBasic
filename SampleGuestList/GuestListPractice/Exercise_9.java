package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

/*
Exercise 9
We no longer want to print elements which are null. Modify the program so only names are printed.
Therefore any null values should be ignored and no dashes should be printed.

End result:

1. Jacob
2. Edward
3. Rose
4. Molly
5. Christopher
 */

import java.util.Scanner;
public class Exercise_9 {

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
                String [] temp = new String[guests.length];
                int tempIndex = 0;
                for(int i = 0; i < guests.length; i++){
                    if(guests[i] !=null){
                        temp[tempIndex] = guests[i];
                        tempIndex++;
                    }
                }
                guests = temp;
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
            if(guest[i] !=null) {
                System.out.println(i + 1 + ". " + guest[i]);
            }

        }
    }
}
