public class BinarySearch {
    public int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;

            if (numbers[pivot] == target) {
                return pivot;
            } else if (numbers[pivot] < target) {
                left = pivot + 1;
            } else if (numbers[pivot] > target) {
                right = pivot - 1;
            }
        }

        return -1;
    }
}