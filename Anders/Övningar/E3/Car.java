package Anders.Övningar.E3;

public class Car {
    
    String model,make,color;
    int year;

    
    public Car (String make, String color, String model, int year){
        this.make=make;
        this.color=color;
        this.model=model;
        this.year=year;
        
    
    }

      public Car(String make){
        this(make, "vit","Okänd", 2025);
    }
    public Car(String make, String color){
        this(make, color,"okänd", 2025);
    } 

    public Car(){
        
    }

    
    
    public void printOut(){
System.out.println("model "+ make);
System.out.println("Make a " + color +" "+ make + " in " + year);
    
}
    
public static void main(String[] args) {
    
    Car car1 = new Car("Volvo");
car1.printOut();
}

}
