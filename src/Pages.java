import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
       Scanner myscanner = new Scanner(System.in);
        try {
            System.out.println("Do you want to know how many pages you should read before giving up on a book? If yes, press enter");
            new Scanner(System.in).nextLine();
            System.out.println("Enter your age");
            int age = Integer.parseInt(myscanner.nextLine());
            System.out.println(age + "-years old should read at least " + (100 - age) + " pages before giving up on a book.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }

    }
}
