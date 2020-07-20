package airport;

public class Aeroplane {

    String modelName = "Airbus A380";
    int passengers = 0;
    int maxPassengers = 100;
    int seats = 150;
    String[] passengerList = new String[150];
    boolean isFlying = false;
    int cruiseSpeed = 9000;

    void addPassengers(int numberOfPassengers) {

        int tempPassengers = this.passengers + numberOfPassengers;
        if(tempPassengers < maxPassengers){
            this.passengers += numberOfPassengers;
            System.out.println(numberOfPassengers + " Passengers OnBoarded, so Total Passengers : " + this.passengers );
        }
        else{
            System.out.println("AeroPlane " + this.modelName + " is only having room for " + (maxPassengers-this.passengers) + " Passengers");
            this.passengers += (maxPassengers-this.passengers);
        }
    }

    int getPassengersCount(){
        System.out.println("AeroPlane " + this.modelName + " is only having room for " + (maxPassengers-this.passengers) + " Passengers");
        return this.passengers;
    }

    void unloadPassengers(){

        this.passengers -= 0;
        System.out.println("Passengers are OffBoarded");
    }

    boolean getIsFlying(){
        System.out.println("AeroPlane " + this.modelName + " is flying : " + isFlying);
        return isFlying;
    }

    void takeOff(){
        if(this.isFlying == false) {
            this.cruiseSpeed = 7000;
            isFlying = true;
            System.out.println("AeroPlane " + this.modelName + " is take off with : " + this.passengers + " Passengers");
        }
        else
        {
            System.out.println("AeroPlane " + this.modelName + " cannot take off because it is already in flight");
        }
    }

    void land(){
        if(this.isFlying == true){
            this.cruiseSpeed = 0;
            isFlying = false;
            System.out.println( "AeroPlane "+this.modelName+ " is landing with : " + this.passengers + " Passengers");
        }
        else{
            System.out.println("AeroPlane " + this.modelName + " cannot land because it is already landed");
        }
    }

    void setModelName(String name) {
        this.modelName = name;
    }

//    public static void main (String [] args) {
//        System.out.println("Test");
//
//            Application aeroplaneOne = new Application();
//
//        aeroplaneOne.addPassengers(90);
//        aeroplaneOne.addPassengers(5);
//        aeroplaneOne.addPassengers(20);
//
//            aeroplaneOne.takeOff();
//            aeroplaneOne.takeOff();
//
//            aeroplaneOne.land();
//            aeroplaneOne.land();
//
//        aeroplaneOne.unloadPassengers();
//
//    }

}
