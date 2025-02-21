public class LC136 {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        System.out.println(res);
    }
}
