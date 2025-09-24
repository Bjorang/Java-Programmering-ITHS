package codealongs.Scanner;
import java.util.Scanner;
 

public class LearningScanner {
public static void main(String[] args){

    System.out.println("Please input your age");
    Scanner scan = new Scanner (System.in);
    byte age =scan.nextByte();

    System.out.println("please insert your name:");
    String name = scan.next();

    scan.close();
}
}