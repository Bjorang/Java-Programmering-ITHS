package Anders.GeometryTester;

import java.lang.Math;
public class circle {
    
    double pi=Math.PI;
    double radien;
    
      
    public circle(double radien){
        this.radien=radien; 
    }
    

    public circle(int diameter){
        this((double)diameter/2);
    }
        
    
    public double getArea(){
         return pi*(radien*radien);
        
    }
    public double getCircumference() {
         return 2*pi*radien;
    }
}
