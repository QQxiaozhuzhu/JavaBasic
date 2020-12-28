package JavaBasic.Chapter_1_Intro.OOP.OOPDoor;

public class Door {
    String name;
    boolean isOpen;

    void open(){
        isOpen = true;
    }
    void  close(){
        isOpen = false;
    }
    void printStatus(){
        if(isOpen){
            System.out.println(name +" Door is open.");
        } else {
            System.out.println( name + " door is closed.");
        }
    }
}
