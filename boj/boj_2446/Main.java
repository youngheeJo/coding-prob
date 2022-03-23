import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int targetNumber = 0;
        String formatString = "%" + inputNumber + "s%s\n";

        for (int i = 0; i < inputNumber * 2 - 1; i++) {
            if (inputNumber > i) {
                targetNumber = inputNumber - i;
            } else {
                targetNumber = i - inputNumber + 2;
            }

            System.out.printf(formatString, "*".repeat(targetNumber), "*".repeat(targetNumber - 1));
        }
    }
}
