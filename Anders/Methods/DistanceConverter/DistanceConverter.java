package Anders.Methods.DistanceConverter;
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        System.out.println("Please input a distance to convert;");
        Scanner scan =new Scanner(System.in);
        double distance =scan.nextDouble();

        milesToKilometer(distance);
       scan.close(); 
    }
    
    static void milesToKilometer(double miles){
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
        
    }
    static void kilometersToMiles(double kilometers){
        double miles=kilometers / 1.60934;
        System.out.println(miles);
        

        
    }
    
}

