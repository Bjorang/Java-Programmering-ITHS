package Anders;

public class MakeUnicorns {
    public static void main(String[] args) {
      Unicorn bengt = new Unicorn(5,"Blå", true, "Glad", true);  
        Unicorn ilse = new Unicorn(4,"Gul",false,"Deprimerad",false);
/* 
        System.out.println("\nThis is bengt; ");
        System.out.println(bengt.getAge());
        bengt.setage(6);;
        System.out.println(bengt.getAge());
        */
        System.out.println("\nThis is a Unicorn; ");
        
        if (ilse.horn == true) {System.out.println("Ilse is a unicorn");
        
          }
          else {
            System.out.println("Ilse is an imposter, she is just a horse");
          }
        
    }
}
