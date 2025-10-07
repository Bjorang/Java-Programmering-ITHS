package E6;

public class LandVehicle extends Fordon {
    public  int kmCount = 0;
    

    public LandVehicle (int vikt, double pris){
        super(vikt, pris);
    }
    //Metod
        public void drive(int kms){
       if (kms>0 ){
        this.kmCount += kms;
        System.out.println("Kört " + kms + " km. Total km" + this.kmCount);

       } else {
        System.out.println("Kan inte köra negativa km");
       }
    }
public int getKmCount(){
return kmCount;
}

    
}
