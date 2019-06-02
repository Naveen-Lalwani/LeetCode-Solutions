/**
  * Time Complexity: O(N)
  * Space Complexity: O(1)
  *
  * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its       * sum.
  * Algorithm Used: Kadane's Algorithm
  *
  * @author Naveen Lalwani
  */
class Solution {
    public int maxSubArray(int[] nums) {
        /*
         * Variable to store maximum subarray sum.
         */
        int max = nums[0];
        /*
         * Variable to store the sum on the subarray.
         */
        int sum = nums[0];

        /*
         * Algorithm: We start with the second element in the list and we find if the new sum is greater than the current value or not, 
         * if not, we choose the current value which implies, we start a new subarray from this number forward. We then compare if the
         * current sum is bigger than the current maximum or not, and update maximum accordingly.
         */
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
