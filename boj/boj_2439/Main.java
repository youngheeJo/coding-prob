import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        String formatString = "%" + length + "s\n";
        StringBuilder printString = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            printString.append("*");
            System.out.printf(formatString, printString.toString());
        }
    }
}
