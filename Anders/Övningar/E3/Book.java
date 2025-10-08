package Anders.Övningar.E3;

public class Book {

    String title;
         String author;
         int year;

    public static void main(String[] args) {
     Book book1 = new Book ();
     

     System.out.println(book1.title);   
     System.out.println(book1.author);
     System.out.println(book1.year);

    }   

        
    
    public Book(){
      this.title = "okänd titel";
      this.author ="okänd författare";
      this.year = 0;
    
    }
}
