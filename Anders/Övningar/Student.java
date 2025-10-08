package Anders.Övningar;

class Student {

String name;
    int age;
    double grade;

public Student(String name,int age ,double grade){
   this.name = name;
    this.age = age;
   this.grade =grade;
}
public void printOut(){
    System.out.println("Namn " +name);
    System.out.println("ålder " +age);
    System.out.println("Betyg " +grade);
}

    public static void main(String[] args) {
    
 Student nyStudent = new Student("Anders", 48, 5.0);

nyStudent.printOut();
    

     
     

    

    
    
    }
    
}
