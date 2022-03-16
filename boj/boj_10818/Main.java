import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputLength = scanner.nextInt();
        int minNumber = scanner.nextInt();
        int maxNumber = minNumber;
        
        for (int i = 1; i < inputLength; i++) {
            int nextNumber = scanner.nextInt();
            minNumber = Math.min(minNumber, nextNumber);
            maxNumber = Math.max(maxNumber, nextNumber);
        }
        
        System.out.printf("%d %d", minNumber, maxNumber);
    }
}
