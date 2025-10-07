
package E6;
import java.util.Random;
public class SeaVehicle extends Fordon{

    private double longitud;
    private double latitud;

    private Random randomGPS = new Random();

    public SeaVehicle(int vikt, double pris, double initLat, double initLong){
        super(vikt, pris);
        this.latitud =initLat;
        this.longitud = initLong;
        System.out.println( "Båt skapad vid GPS: (" + latitud +", " + longitud + ")");
    }
    
}
