package airport;

public class Door {

    public int width ;
    public int height ;
    boolean open;

    void openDoor(){
        open = true;
    }

    void closeDoor(){
        open = false;
    }

    void printOpen(){
        System.out.println("Current status of Door OPen : " + open);
    }

    void calculateSurface(int width, int height){
        System.out.println(width * height);
    }

    public static void main (String [] args) {
        System.out.println("Test");

        Door myObj = new Door();
        myObj.openDoor();
        myObj.printOpen();
        myObj.closeDoor();
        myObj.calculateSurface(36, 45);
    }
}