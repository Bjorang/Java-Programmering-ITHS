package Anders.GeometryTester;
public class GeometryTester {
    public static void main(String[] args) {
        
        circle c_area =new circle(10);
        System.out.println("Skriv ut arean på en cirkel och rektangel");
        System.out.println("cirkelns area är "+ c_area.getArea());

        circle c_circ = new circle(20);
        System.out.println("cirkelns omkrets är "+ c_circ.getCircumference());

        rectangular r_area = new rectangular(10, 10);
        System.out.println("rektangelns area är " + r_area.getArea());

        rectangular p_Rectangular = new rectangular(10, 10);
        System.out.println("Rektangelns omkrets är " + p_Rectangular.getPerimiter());
        

    }
    
    
}
