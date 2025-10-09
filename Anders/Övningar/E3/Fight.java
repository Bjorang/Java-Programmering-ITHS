package Anders.Övningar.E3;

public class Fight {
    public static void main(String[] args) {
        Character fantomen = new Character("Fantomen", 10, true);
        Container myVessel = new Container();
        Character bamse = myVessel.ash;
       System.out.println( myVessel.conan.name +" styrka " + myVessel.conan.strenght);
       System.out.println(myVessel.ash.name+ " styrka " + myVessel.ash.strenght );
       System.out.println(fantomen.name + " Styrka " + fantomen.strenght);
       System.out.println(bamse.strenght );
        
    }
    

}
