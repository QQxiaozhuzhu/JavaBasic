package JavaBasic.Chapter_1_Intro.SampleGuestList.GuestListPractice;

/*
Exercise 8
Currently, when a name is removed from the list, the element set to null and two dashes appear in its place.
This can leave a gap if the name was in the middle of the list. For example, if the list looks like this:

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
Then if Edward is removed the list will look like this:

1. Jacob
2. --
3. Rose
4. Molly
5. Christopher
6. --
7. --
8. --
9. --
10. --
Instead, modify the program so that when a name is removed, all subsequent elements are shifted up to fill the gap.
Therefore when Edward is removed the list should look like this:

1. Jacob
2. Rose
3. Molly
4. Christopher
5. --
6. --
7. --
8. --
9. --
10. --
 */

import java.util.Scanner;
public class Exercise_8 {

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
            System.out.print(i + 1 + ". ");
            System.out.println(guest[i] == null? "--" : guest[i]);

//                    if(guests[i] == null){
//                        System.out.println("--");
//                    } else
//                    System.out.println(guests[i]);
        }
    }
}
