import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ", it's nice to meet you!");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite color, " + name + " ?");
        String color = scan.nextLine();
        System.out.println("Oh I like " + color + " too!");

        Scanner hi = new Scanner(System.in);
        System.out.println("What is your favorite sport, " + name + " ?");
        String sport = scan.nextLine();
        System.out.println("Oh wow, " + sport + " is really fun!");

        Scanner bye = new Scanner(System.in);
        System.out.println("What is your favorite food, " + name + " ?");
        String food = scan.nextLine();
        System.out.println(food + " is delicious :)");

        Scanner inp = new Scanner(System.in);
        System.out.println("What is your favorite subject, " + name + " ?");
        String sub = scan.nextLine();
        System.out.println("Awesome. I like " + sub + " too!");


        scan.close();
    }
}
