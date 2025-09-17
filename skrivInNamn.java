import java.util.Scanner;

public class skrivInNamn {
    public static void main(String[] args) {
       


        
        // Skapa ett Scanner-objekt för att läsa input från tangentbordet
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ditt förnamn: ");
        String firstName = scanner.nextLine();

        System.out.print("Ange ditt efternamn: ");
        String lastName = scanner.nextLine();

        System.out.print("Ange din ålder: ");
        int age = scanner.nextInt();

        // Stäng Scanner-objektet när du är klar
        scanner.close();

        System.out.println("\n--- Din information ---");
        System.out.println("Förnamn: " + firstName);
        System.out.println("Efternamn: " + lastName);
        System.out.println("Ålder: " + age + " år");
    
    }
}
