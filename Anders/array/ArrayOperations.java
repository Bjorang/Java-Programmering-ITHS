package Anders.array;
import java.util.Random;
public class ArrayOperations {
    
    private int[] intArray;

    public ArrayOperations (){
        intArray = new int[10];
         Random rand = new Random();
         for(int i =0; i < intArray.length; i++){
            intArray[i]=rand.nextInt(100)+1;
         }

    }
     public int[] getIntArray() {
        return intArray;
    }    
        
       

    

        public void substitute(int pos1, int pos2)
{}    

}
