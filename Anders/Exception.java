package Anders;
import java.util.Scanner;

public class Exception {
    String pw="Test";
    public Exception(String string) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
         
         
         
        
            
         }
    
         public String checkPassword(String writePassword){
         
            Scanner sc =new Scanner(System.in);
            writePassword = sc.nextLine();
            sc.close();
            
            while (writePassword != "Test") {
try {System.out.println("Fel lösenord ");
 writePassword = sc.nextLine();    

}


            }
            return writePassword;

    
}

        }
    

