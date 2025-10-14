package Anders;
import java.lang.Exception;
import java.util.Scanner;
public class TestPw {
    
    


    // Konstanter för den önskade längden
    private static final int KORREKT_LÄNGD = 5;

    public static void main(String[] args) {
        
        String lösenord = "";
        boolean giltigtLösenord = false;
        
        Scanner sc = new Scanner(System.in);

        // Fortsätt att fråga tills ett giltigt lösenord har matats in
        while (!giltigtLösenord) {
            System.out.println("Vänligen ange ett lösenord på exakt " + KORREKT_LÄNGD + " tecken:");
            
            try {
                // Läser in användarens input
                String inmatning = sc.nextLine();
                int längd = inmatning.length();

                // Kasta ett exception om längden är fel
                if (längd != KORREKT_LÄNGD) {
                    // Vi kastar ett generellt Exception och skickar med ett felmeddelande
                    throw new Exception("Lösenordet måste vara exakt " + KORREKT_LÄNGD + " tecken långt. Du angav " + längd + " tecken.");
                }

                // Om vi når hit är längden korrekt
                lösenord = inmatning;
                giltigtLösenord = true; // Bryt loopen

            } catch (Exception e) {
                // Fånga och skriv ut felmeddelandet
                System.out.println("--- Fel vid inmatning ---");
                System.out.println(e.getMessage()); // Skriver ut meddelandet vi skickade med i 'throw new Exception'
                System.out.println("Vänligen försök igen.");
            }
        }
        
        // Här vet vi att 'lösenord' är giltigt
        System.out.println("\n*** Lösenord accepterat! ***");
        System.out.println("Ditt lösenord är: " + lösenord);
        
        sc.close();
    }
}

