 package Anders.Challenges1;
import java.util.Scanner;
public class ThreeNumbers {

    public static void main(String[] args) {
        
    
int tal1,tal2,tal3;
    Scanner sc = new Scanner(System.in);{
        System.out.println("Skriv in 3 st tal.");
        System.out.println("Första talet");
        tal1=sc.nextInt(); 
        //sc.nextLine();
        System.out.println("Skriv in andra talet");
        tal2=sc.nextInt();
        //sc.nextLine();
        System.out.println("Skriv in sista talet");
        tal3=sc.nextInt();
        sc.close();
    }
// hitta högsta talet
if (tal1 > tal2 && tal1 > tal3){
    System.out.println("Tal 1 "+ tal1 +" är större än tal 2 och tal 3 " + tal2 + " " + tal3);
  
}
else
{System.out.println("Tal 1 " +tal1+ " är mindre än tal 2 och 3 " + tal2 +" "+ tal3);}
if (tal3>tal2){
    System.out.println("Tal 3 är störst");

}
else {System.out.println("tal 2 är störst");}
}
}




    

