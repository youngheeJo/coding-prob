import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length + i; j++) {
                if (length - i - 1 == j || length + i - 1 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println("*".repeat(length * 2 - 1));
    }
}
