package E6;

public class Motorcykel extends LandVehicle{
    
           public Motorcykel(int vikt, double pris){
        super(vikt, pris);
       } 
    
    

public static void main(String[] args) {
    Motorcykel HD = new Motorcykel(1500, 25000.0);
    System.out.println("HD startar med " + HD.getKmCount() + " km på räknaren.");
    
    HD.drive(50);
    HD.drive(100);

    System.out.println("Volvon har nu kört " + HD.getKmCount() + " km");
    
}
}

