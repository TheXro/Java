public class LC_494 {
    //leetcode 494 using dp 
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(findTargetSumWays(arr, target));
    }

    static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < target || (sum + target) % 2 != 0) {
            return 0;
        }
        int s1 = (sum + target) / 2;
        return countSubsetSum(nums, s1);
    }
    static int countSubsetSum(int[] nums, int sum) {
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
