import java.util.Scanner;
public class printNummer {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int mittNummer;
    System.out.println("Skriv in ett nummer ");
    mittNummer = scanner.nextInt();
    scanner.close();
    if (mittNummer < 0) {
        System.out.println("Ditt nummer är negativ");
    }    
        else if (mittNummer == 0) {
            System.out.println("Ditt nummer är 0");
        }
            else{System.out.println("Ditt nummer är positivt");}

   } 
}
