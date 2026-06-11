package SlidingWindow;

public class MaximumSumSubarray {

    public static int maxSum(int[] nums, int k) {

        int currentSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            currentSum = currentSum - nums[i - k] + nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};

        System.out.println(maxSum(nums, 3));
    }
}