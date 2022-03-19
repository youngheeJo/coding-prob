import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startNumber = scanner.nextInt();
        String formatString = "%" + startNumber + "s\n";
        
        for (int i = startNumber; i > 0; i--) {
            System.out.printf(formatString, "*".repeat(i));
        }
    }
}
