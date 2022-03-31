class Solution {
    public void moveZeroes(int[] nums) {
        int moveIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temporalNumber = nums[i];
                nums[i] = nums[moveIndex];
                nums[moveIndex] = temporalNumber;

                moveIndex++;
            }
        }
        System.out.println(nums);
    }
}