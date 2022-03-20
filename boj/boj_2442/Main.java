import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputNumber = scanner.nextInt();
        String formatString = "%" + inputNumber + "s%s\n";
        
        for (int i = 1; i <= inputNumber; i++) {
            System.out.printf(formatString, "*".repeat(i), "*".repeat(i - 1));
        }
    }
}
