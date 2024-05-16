import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    System.out.println("Enter your name");

    String userName = userData.nextLine();
    System.out.println("Your name is: " + userName);

    }
}
