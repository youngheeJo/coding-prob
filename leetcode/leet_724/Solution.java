class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();
        int pastPivotIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            leftSum += pastPivotIndex;

            if (leftSum == rightSum) {
                return i;
            }

            pastPivotIndex = nums[i];
        }

        return -1;
    }
}