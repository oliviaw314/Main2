import java.util.Scanner;
public class zodiac {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year you were born in");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("You will be/are "+ (2023-year)+"-years old this year.");
    }
}
