package Anders;

public class Unicorn {
    
        
       private int age;
        String color,mood;
        boolean horn,alive;
        

        Unicorn(int age, String color, boolean horn, String mood, boolean alive) {
            this.age=age;
            this.color=color;
            this.horn=horn;
            this.mood=mood;
            this.alive=alive;
        }
        void setage (int age){
            this.age=age;
        }
        int getAge(){
            return age;

        }
        void runWild(){}
    }

