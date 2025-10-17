package Anders.Math;

import java.util.Scanner;

public class CountBinary {

    int binaryNr = 1;

    int[] numbers = new int[8];

    

    /*
     * private int binaryCal(){
     * for (int i=0; i<8; i++ ){
     * binaryNr = binaryNr *2 ;
     * 
     * }
     * return binaryNr;
     * }
     */

    private void fillArray() {
        int currentPowerOfTwo = 1;
        for (int j = 0; j < 8; j++) {
            numbers[j] = currentPowerOfTwo;
            currentPowerOfTwo = currentPowerOfTwo * 2;
        }
    }

    private void binArry() {
        int currentPowerOfTwo = 1;
        for (int j = 7; j >= 0; j--) {
           

            System.out.println("Index " + j + " = " + numbers[j]);

        }
    

    }
    private int inputEq(){
        int NrInput;
        System.out.println("Skriv in en siffra mellan 1-100");
        Scanner sc = new Scanner(System.in);
        NrInput=sc.nextInt();
        sc.close();
        return NrInput;
         
    }
   

public static void main(String[] args) {
 
    CountBinary calculator = new CountBinary();
    calculator.inputEq();
    calculator.fillArray();    
    calculator.binArry();
}
}
