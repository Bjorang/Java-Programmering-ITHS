import java.util.Scanner;

public class LearningMethods {
    public static void main(String[] args) {

        new LearningMethods().welcomeMessage();
        new LearningMethods().getUserInfo();
        new LearningMethods().indoorOrOutdoor();
    }

    private static boolean indoorPerson = false;
    private static boolean outdoorPerson = false;
    public static Scanner sc = new Scanner(System.in);

    public void welcomeMessage() {

        System.out.println("Hello! I want to show you how to use methods!");

    }

    public void getUserInfo() {
        System.out.println("First off, what is your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("That means you where born in " + (2025 - age) + "!");
    }

    private void indoorOrOutdoor() {
        System.out.println("Are you an indoor or outdoor person?");
        sc.nextLine();
        String answer = sc.nextLine();
        if (answer.matches("indoor") || answer.matches("Indoor")) {
            indoorPerson = true;
        } else if (answer.matches("outdoor") || answer.matches("Outdoor")) {
            outdoorPerson = true;
        } else {
            System.out.println("That was an unexpected answer! O.o");
        }
        if (indoorPerson == true) {
            System.out.println("Awesome! What is it that you do indoors?");
        } else if (outdoorPerson == true) {
            System.out.println("Wow cool! Thats unusual nowadays. What is it you like about the great outdoors?");
        } else {
            System.out.println("Lets start over!");
        }

        sc.close();

    }
}
