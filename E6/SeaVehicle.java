
package E6;

import java.util.Random;

public class SeaVehicle extends Fordon {

    private double longitud;
    private double latitud;

    private Random rand = new Random();
    double gPSLong = rand.nextDouble(180.0) - 180.0;
    double gPSlat = rand.nextDouble(90) - 90;

    public SeaVehicle(int vikt, double pris) {
        super(vikt, pris);
        //this.latitud = initLat;
        //this.longitud = initLong;
       System.out.println("Båt skapad vid GPS: (" + latitud + ", " + longitud + ")");
    }

    public double randomGPSLong(){ 
     Random rand = new Random();
    double longitud = rand.nextDouble(180.0) - 180.0;
    //System.out.println("Båten befinner sig på " + longitud);
        return longitud;
    }
     public double randomGPSlat(){
     Random rand =new Random();
    double latitud = rand.nextDouble(90) - 90;
   // System.out.println(" och " + latitud);
        return latitud;
    }
    }

