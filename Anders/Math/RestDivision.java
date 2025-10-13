package Anders.Math;

public class RestDivision {
    public static void main(String[] args) {
        
       
//skapa array
    int[] numbers = new int[10];

    //Fyll array
    for (int i = 0; i < 10; i++) {
        numbers[i]= i +1;
    }
    // Skriv ut array baklänges
    for(int j = 9; j>= 0;j--){
        System.out.println(numbers[j]);
    }
    //skrivut array framlänges.
    for (int k : numbers){
        System.out.println(numbers[k-1]);
    }


    }
}

