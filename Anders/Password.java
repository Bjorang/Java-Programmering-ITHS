package Anders;
import java.util.Scanner;
import java.lang.Exception;
// import java.util.InputMismatchException; // Denna behövs inte för string-input
public class Password {

 private static int KORREKT_LÄNGD = 5; // Använda 'final' är bra stil för konstanter

public static void main(String[] args) {

 System.out.println("Skriv ett lösenord som innehåller " + KORREKT_LÄNGD + " tecken:");
 String password = createPassword();
 System.out.println("Ditt lösenord är: " + password);
 }

    // 1. Metoden MÅSTE returnera en String (lösenordet)
 public static String createPassword(){ 
Scanner sc = new Scanner(System.in);
        String setPassword = ""; // Initiera variabeln
        boolean success = false; // Lägg till en flagga för att kontrollera loopen

        // 2. Använd en while-loop för att upprepa inmatningen tills den är korrekt
 while (!success){
 // Flytta inmatningen hit så att den läses in varje gång loopen körs
            String currentInput = sc.nextLine();
            int längd = currentInput.length();

            try {
                // 3. Kontrollera längden och kasta exception INUTI try-blocket
                if(längd != KORREKT_LÄNGD){
                    // Kasta undantaget
                    throw new Exception("SKRIV ETT LÖSENORD SOM ÄR EXAKT " + KORREKT_LÄNGD + " TECKEN!");
                }
                
                // Om vi når hit är längden korrekt.
                setPassword = currentInput; // Spara det korrekta lösenordet
                success = true; // Sätt flaggan till true för att avsluta loopen

            }
            // 4. Fånga och hantera exception
            catch(Exception e){
                System.out.println("--- FEL ---");
                System.out.println(e.getMessage()); // Skriv ut felmeddelandet
                System.out.println("Försök igen:");
            }
 }
sc.close();
        // Stäng scannern och returnera det giltiga lösenordet sc.close(); 
        return setPassword; 
 }
}
