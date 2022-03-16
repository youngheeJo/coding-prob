import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputLength = scanner.nextInt();
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        
        for (int i = 0; i < inputLength; i++) {
            int nextNumber = scanner.nextInt();
            minNumber = Math.min(minNumber, nextNumber);
            maxNumber = Math.max(maxNumber, nextNumber);
        }
        
        System.out.printf("%d %d", minNumber, maxNumber);
    }
}
