import java.util.Scanner;

public class word_lastindex {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a word");
            String input = scanner.nextLine();
            int LastIndex = input.length() - 1;
            System.out.println("The index of the last letter is " + LastIndex + ".");
            double castToDouble = Double.parseDouble(String.valueOf(LastIndex));
            System.out.println("Converted to double: " + castToDouble);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }
    }
}
