//Program som känner av om lösenordet är rätt.  pw="Test" är korrekt lösenord.
package Anders;


import java.util.Scanner;

public class Exceptioned {
    private static String pw = "Test";

    private static String checkPW() {
        String pwTry = pw;

        if (pwTry == pw){
System.out.println("Korrekt lösenord");
        }else {System.out.println("Fel lösenord var god försök igen");}
       return pwTry;
    }
        
        private static String checkString(){
            Scanner sc = new Scanner(System.in);
           String writePassword="";
           Boolean pwMatches = false;
do{
    System.out.println("Skriv in ditt lösenord");
    pwMatches = writePassword.equals(checkPW());
    if (!pwMatches){System.out.println("Fel lösenord, försök igen");
    }

        }while (!pwMatches) ;
            System.out.println("Skriv in ditt lösenord");
             String newPassword =sc.nextLine();
               
            
           if (newPassword==writePassword){
            System.out.println("korrekt");
           }
           return writePassword;
        }
    

    public static void main(String[] args) {
        
        String passWord = checkString(); 
        System.out.println("Skriv in ditt lösenord ");
    
    
         
            
            
            

     /*    while (writePassword != Exception.checkPW()) {
try {System.out.println("Fel lösenord ");
 writePassword = sc.nextLine();   */ 

   
            

           

        
           
   
    }
        }

