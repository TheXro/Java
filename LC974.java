

public class LC974 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int count = 0;
        // Map<Integer, Integer> map = new HashMap<>()
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < n + 1; i++) {
            count += map.getOrDefault(prefix[i] - k, 0);
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        System.out.println(count);
    }
}
