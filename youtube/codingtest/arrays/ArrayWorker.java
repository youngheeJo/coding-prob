public class ArrayWorker {


    public int[] moveZeroes(int[] numbers) {
        int indexOfZero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                int temporalNumber = numbers[i];
                numbers[i] = numbers[indexOfZero];
                numbers[indexOfZero] = temporalNumber;

                indexOfZero++;
            }
        }

        return numbers;
    }

}