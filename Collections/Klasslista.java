package Collections;
import java.util.*;

public class Klasslista {
    public static void main(String[] args) {
        Set<Student> klasslistan =new HashSet<>(); 

        Student tom =new Student("Tom",12345,true);
        Student anders = new Student("Anders", 12346, true);
        
        klasslistan.add(tom);
        klasslistan.add(anders);
        
        
        System.out.println(klasslistan);
    }
    
}
