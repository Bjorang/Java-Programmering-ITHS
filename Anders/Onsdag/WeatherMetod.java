package Anders.Onsdag;
import java.util.Random;
public class WeatherMetod {

    

 
       
   
   String[] city = new String[4];{
  city [0] =  "Malmö";
  city [1] = "Göteborg";
  city [2] = "Umeå";
  city [3] = "Stockholm";
 
   }
   {
   String[] veckodagar = new String [7];

    veckodagar [0]="MÅNDAG";
    veckodagar [1]="TISDAG";
    veckodagar [2]="ONSDAG";
    veckodagar[3]= "TORSDAG";
   veckodagar [4] = "FREDAG";
   veckodagar [5] ="LÖRDAG";
   veckodagar [6] = "SÖNDAG";
   
   }

    
 
   
private Random rand = new Random();
    int degree =rand.nextInt( 20) -5;
 
 
      String[] weather = new String[5];{
  weather [0] =  "soligt";
  weather [1] = "molnigt";
  weather [2] = "regnar";
  weather [3] = "snöar";
  weather [4] = "blandat mellan sol och molnigt";
  }
 public String[] valdCity(){
    String[] city = new String[4];
  city [0] =  "Malmö";
  city [1] = "Göteborg";
  city [2] = "Umeå";
  city [3] = "Stockholm";

  return city;
    }
 
 
 public String[] dagVald(){
 String[] veckodagar = new String [7];

    veckodagar [0]="MÅNDAG";
    veckodagar [1]="TISDAG";
    veckodagar [2]="ONSDAG";
    veckodagar[3]= "TORSDAG";
   veckodagar [4] = "FREDAG";
   veckodagar [5] ="LÖRDAG";
   veckodagar [6] = "SÖNDAG";

   return veckodagar;
 
}

    public int temp (){
    Random rand = new Random();
    int degree =rand.nextInt( 20) -5;
    return degree;
    }
   
 
    public String väder(){
      String[] weather = new String[5];
    weather [0] =  "soligt";
    weather [1] = "molnigt";
    weather [2] = "regningt";
    weather [3] = "snöigt";
    weather [4] = "blandat mellan sol och molnigt";
    Random we =new Random();
    int wh = we.nextInt(weather.length);
    String weat = weather [wh];
    return weat;
 
  }
}




