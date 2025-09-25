import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        
        String [] fruits;
        fruits = new String[4];
        fruits [0] ="apple";
        fruits[1] ="pear";
        fruits[2] ="orange";
        fruits[3] ="grape";

        System.out.println(fruits.length);

        String[] moreFruits;
             
        moreFruits=Arrays.copyOf(fruits,6); 
            moreFruits [4] ="citron";
            moreFruits [5]= "Gurka";
         System.out.println( moreFruits.length);
       int element = 0;
    while (element < moreFruits.length ){
        System.out.println("More fruits is " +moreFruits[element]); 
        element++;

    }
        String[] lessFruits;
        lessFruits=Arrays.copyOf(fruits,2);
        
        for (String lF : lessFruits)
    {System.out.println("Lessfruit is " + lF); }
   

        
    }
}
