import java.util.Scanner;
public class Long_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            long number = Long.parseLong(scanner.nextLine());
            if (number % 2 == 0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }
    }
}
