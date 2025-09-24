package Anders.Math;
public class Factorial {
 
    int fnumber;

    public Factorial (int fnumber){
        this.fnumber=fnumber;
    }
    public int getNumber(){
        if (fnumber == 0){
            return 1;
        }

        int resultat = 1; 
        while (fnumber > 0) {
           resultat = resultat*fnumber;
           fnumber --;
           
        }
         return resultat;
    }
}
