package confusing;

import java.util.Scanner;
import java.lang.Exception;


public class Password {
    public static String pwLength = "nyttVärde";
    private static String korrektLängd ="mamma";  

    public static String pwlength() {

        if (pwLength.length() == 5) {
            korrektLängd = pwLength;
        } else {
            System.out.println("Lösenordet måste vara "+korrektLängd.length()+ " tecken långt");
        }
        return pwLength;
    }

    public static void main(String[] args) {

        System.out.println("Skriv ett lösenord som innehåller " + korrektLängd.length() + " tecken:");
        String password = createPassword();
        System.out.println("Ditt lösenord är: " + password);
    }

    // 1. Metoden MÅSTE returnera en String (lösenordet)
    public static String createPassword() {
        Scanner sc = new Scanner(System.in);
        String setPassword = ""; // Initiera variabeln
        boolean success = false; // Lägg till en flagga för att kontrollera loopen

        // 2. Använd en while-loop för att upprepa inmatningen tills den är korrekt
        while (!success) {
            // Flytta inmatningen hit så att den läses in varje gång loopen körs
            String currentInput = sc.nextLine();
            

            try {
                // 3. Kontrollera längden och kasta exception INUTI try-blocket
                if (currentInput.length() != korrektLängd.length()) {
                    // Kasta undantaget
                    throw new Exception("SKRIV ETT LÖSENORD SOM ÄR EXAKT " + korrektLängd.length() + " TECKEN!");
                }

                // Om vi når hit är längden korrekt.
                setPassword = currentInput; // Spara det korrekta lösenordet
                success = true; // Sätt flaggan till true för att avsluta loopen

            }
            // 4. Fånga och hantera exception
            catch (Exception e) {
                System.out.println("--- FEL ---");
                System.out.println(e.getMessage()); // Skriv ut felmeddelandet
                System.out.println("Försök igen:");
            }
        }

        //sc.close();
        return setPassword;
    }
}
