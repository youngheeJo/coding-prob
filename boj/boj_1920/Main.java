import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLength = scanner.nextInt();
        int[] inputArray = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            inputArray[i] = scanner.nextInt();
        }

        Arrays.sort(inputArray);

        int targetLength = scanner.nextInt();
        for (int i = 0; i < targetLength; i++) {
            int targetNumber = scanner.nextInt();

            int left = 0;
            int right = inputLength - 1;
            boolean isExistInInputArray = false;
            while (left <= right) {
                int pivot = (left + right) / 2;
                if (inputArray[pivot] == targetNumber) {
                    isExistInInputArray = true;
                    break;
                } else if (inputArray[pivot] > targetNumber) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }

            System.out.println(isExistInInputArray ? 1 : 0);
        }
    }
}