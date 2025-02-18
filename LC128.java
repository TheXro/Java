import java.util.*;

public class LC128 {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2,0,2,4,2,3,5,6,7,8,9 };
        int n = nums.length;
        if (n == 0)
            System.out.println(0); 
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            map.put(nums[i], 1);
        }
        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(nums[i])) {
                int count = 1;
                int num = nums[i];
                while (map.containsKey(--num)) 
                {
                    count++;
                    map.remove(num);
                }
                num = nums[i];
                while (map.containsKey(++num)) {
                    count++;
                    map.remove(num);
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);


    }
}
