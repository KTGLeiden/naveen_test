package airport;

public class Application {

    public static void main (String [] args) {


        Airport myAirport = new Airport();

        myAirport.airportName = "Schipol";
        myAirport.Aeroplanes[0] = new Aeroplane();
        myAirport.Aeroplanes[0].setModelName("Boeing 777");
        myAirport.Aeroplanes[0].addPassengers(55);
        myAirport.Aeroplanes[0].takeOff();
        myAirport.Aeroplanes[0].land();
        myAirport.Aeroplanes[0].unloadPassengers();

        myAirport.Aeroplanes[1] = new Aeroplane();
        myAirport.Aeroplanes[1].setModelName("AirBus A380");
        myAirport.Aeroplanes[1].addPassengers(95);
        myAirport.Aeroplanes[1].takeOff();
        myAirport.Aeroplanes[1].land();
        myAirport.Aeroplanes[1].unloadPassengers();
        myAirport.Aeroplanes[1].getIsFlying();

        myAirport.Aeroplanes[2] = new Aeroplane();
        myAirport.Aeroplanes[2].setModelName("Cessna 206");
        myAirport.Aeroplanes[2].addPassengers(5);
        myAirport.Aeroplanes[2].getIsFlying();


        Airport myAirportTwo = new Airport();

        myAirportTwo.airportName = "New Delhi";
        myAirportTwo.Aeroplanes[0] = new Aeroplane();
        myAirportTwo.Aeroplanes[0].setModelName("Boeing 777");
        myAirportTwo.Aeroplanes[0].addPassengers(44);
        myAirportTwo.Aeroplanes[0].takeOff();
        myAirportTwo.Aeroplanes[0].land();
        myAirportTwo.Aeroplanes[0].unloadPassengers();

        myAirportTwo.Aeroplanes[1] = new Aeroplane();
        myAirportTwo.Aeroplanes[1].setModelName("AirBus A380");
        myAirportTwo.Aeroplanes[1].addPassengers(88);
        myAirportTwo.Aeroplanes[1].takeOff();
        myAirportTwo.Aeroplanes[1].land();
        myAirportTwo.Aeroplanes[1].unloadPassengers();
        myAirportTwo.Aeroplanes[1].getIsFlying();

        myAirportTwo.Aeroplanes[2] = new Aeroplane();
        myAirportTwo.Aeroplanes[2].setModelName("Cessna 206");
        myAirportTwo.Aeroplanes[2].addPassengers(4);
        myAirportTwo.Aeroplanes[2].getIsFlying();

    }
}