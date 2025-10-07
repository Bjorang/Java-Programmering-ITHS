package E6;

public class Bil extends LandVehicle {

    
       public Bil(int vikt, double pris){
        super(vikt, pris);
       } 
    
    

public static void main(String[] args) {
    Bil volvo = new Bil(1500, 25000.0);
    System.out.println("Volvo startar med " + volvo.getKmCount() + " km på räknaren.");
    
    volvo.drive(50);
    volvo.drive(120);

    System.out.println("Volvon har nu kört " + volvo.getKmCount() + " km");
    
}
}