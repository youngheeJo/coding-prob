import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputNumber = scanner.nextInt();
        String formatString = "%" + inputNumber + "s\n";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < inputNumber * 2 - 1; i++) {
            if (i < inputNumber) {
                sb.append("*");
            } else {
                sb.delete(sb.length() - 2, sb.length() - 1);
            }
            System.out.printf(formatString, sb.toString());
        }
    }
}
