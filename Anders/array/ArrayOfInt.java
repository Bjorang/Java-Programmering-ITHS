package Anders.array;

import java.util.Random;

public class ArrayOfInt {
    public static void main(String[] args) {

        randomArray();
    }

    static int[] randomInt;

    public static void randomArray() {
        randomInt = new int[100];
        Random rand = new Random();
        for (int i = 0; i < randomInt.length; i++)
            randomInt[i] = rand.nextInt(100) + 1;
        int randomindex = rand.nextInt(randomInt.length);
        int randomNr = randomInt[randomindex];

        int randomIndex2 = rand.nextInt(randomInt.length);
        int randomNr2 = randomInt[randomIndex2];

        System.out.println("Första slumpade talet: " + randomNr);
        System.out.println("Andra slumpade talet: " + randomNr2);

    }

}
