import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);				// 1
        System.out.println("Enter your age");	// 2
        int age = Integer.parseInt(scanner.nextLine());					// 3
        System.out.println(age+ "-year olds should date somebody who is at least " + (7+(age/2)) + " years old.");
    }
}
