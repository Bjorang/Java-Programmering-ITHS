package Anders.array;
import java.util.Random; 

public class ArrayOfInt {
    
    int[] javaInt = {1,2,3,4,5,6,7,8,9,10};


    public void randomArray (){ ;
        Random rand = new Random();

        
        
        int randomindex = rand.nextInt(javaInt.length);
        int randomNr =javaInt[randomindex];
        System.out.println("slumpa ett tal "+ randomNr);
    
    }
}
