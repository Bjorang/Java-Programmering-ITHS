package E6;

public class Boat extends SeaVehicle {
    
    public Boat (int vikt, double pris){
        super (vikt,pris);
    }
    public static void main(String[] args) {
        Boat boat1 = new Boat(250, 25000.50);
    System.out.println( "Båten befinner sig " + boat1.randomGPSlat()+ " och "+ boat1.randomGPSLong());
    }
}