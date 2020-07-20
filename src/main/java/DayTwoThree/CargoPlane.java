package DayTwoThree;

import airport.Aeroplane;
import airport.Airport;

public class CargoPlane extends Aeroplane {

    int cargoArea = 20;

    private void unloadCargo(){
        this.cargoArea = 0;
        System.out.println("Cargo has been unloaded");
    }

    private void loadCargo(int val){
        this.cargoArea += val;
        System.out.println("Cargo has been loaded with new load of " + val + " tons making it a new load of " + this.cargoArea + " tons");
    }

}
