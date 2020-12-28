package JavaBasic.Chapter_1_Intro.OOP.OOPDoor;

public class Main {
    public static void main(String[] args){
        Door door = new Door();
        door.name = "Driver";

        door.open();
        door.printStatus();

        Door passageDoor = new Door();
        passageDoor.name ="Passenger";
        passageDoor.open();
        passageDoor.printStatus();
        passageDoor.close();
        passageDoor.printStatus();


//        if(door.isOpen){
//            System.out.println("Driver`s door is open.");
//        } else {
//            System.out.println("Driver`s close is closed.");
//        }

    }
}
