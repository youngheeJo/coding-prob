import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        String formatString = "%-" + inputNumber + "s%" + inputNumber + "s\n";
        StringBuilder printString = new StringBuilder();

        for (int i = 0; i < inputNumber * 2 - 1; i++) {

            if (i < inputNumber) {
                printString.append("*");
            } else {
                printString.delete(printString.length() - 2, printString.length() - 1);
            }

            System.out.printf(formatString, printString.toString(), printString.toString());
        }
    }
}
