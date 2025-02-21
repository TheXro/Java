import java.util.HashMap;

public class LC137 {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 1, 2, 1, 2, 2 };
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (int key : map.keySet()) {
        //     if (map.get(key) == 1) {
        //         System.out.println(key);
        //     }
        // }
        //         optimized approach
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    cnt++;
                }
            }
            if (cnt % 3 != 0) {
                ans |= (1 << i);
            }
        }
        System.out.println(ans);
    }
}
