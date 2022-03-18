import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startNumber = scanner.nextInt();
        
        for (int i = startNumber; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
