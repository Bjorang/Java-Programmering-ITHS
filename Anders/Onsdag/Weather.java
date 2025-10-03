package Anders.Onsdag;

import javax.swing.JOptionPane;
public class Weather {
    
    public static void main(String[] args) {
        
        
WeatherMetod wMetod =new WeatherMetod();

Object valdStader=JOptionPane.showInputDialog(
    null,
    "Välj en Stad",
    "Stadsval",
    JOptionPane.QUESTION_MESSAGE,
    null,
    wMetod.valdCity(),
wMetod.valdCity()[0]

);
    


  Object dag=JOptionPane.showInputDialog(
        null,
        "Välj veckodag",
        "dag",
        JOptionPane.QUESTION_MESSAGE,
        null,
        wMetod.dagVald(),
        wMetod.dagVald()[0]
    );

    WeatherMetod grader = new WeatherMetod();
        int gd = grader.temp();
 
        WeatherMetod OK = new WeatherMetod();
        String väd = OK.väder();

    if (valdStader != null && dag !=null  ) {
            System.out.println("Vädret i: " + valdStader +" på " + dag + " är " +väd + " och " + gd + " grader.");

        }
        
    }
}
 

