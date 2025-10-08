package Collections;

public class Student {
    
    String namn;
    int tnr;
    boolean aktiv; 

    Student(String namn, int tnr, boolean aktiv){
    this.namn = namn;
    this.tnr=tnr;
    this.aktiv=aktiv;
}
@Override
public String toString(){
    return "Student{" + 
    "namn='" +namn + '\'' +
", tnr=" + tnr +
", aktiv="+  aktiv + '}'+"\n";
        
    }
  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // Vi bestämmer att två studenter är lika om de har samma tnr (personnummer/studentnummer)
        return tnr == student.tnr; 
    }

    @Override
    public int hashCode() {
        // Generera en hashcode baserat på fältet vi använder i equals
        return tnr; 
    }*/

}
    

