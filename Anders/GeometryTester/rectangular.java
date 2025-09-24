package Anders.GeometryTester;
public class rectangular {
    
    double length, width;

    rectangular(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    

    }
    public double getPerimiter(){
      return length+length+width+width;
    
    }
}
