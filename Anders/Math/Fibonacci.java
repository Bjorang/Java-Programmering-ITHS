package Anders.Math;

public class Fibonacci {
    
    int fnumber =1 ;

    public Fibonacci (int fnumber){
        this.fnumber=fnumber;
    }
    public int getFib(){
         if (fnumber==0){
            return 0;}

            if (fnumber==1){
                return 1;
            }
        int nrGrow = 1;

        while (fnumber > 1) {

            nrGrow = fnumber + nrGrow;
             fnumber=nrGrow;
            nrGrow++;
            
        }
         return nrGrow;
    }
}
