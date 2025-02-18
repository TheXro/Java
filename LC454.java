import java.util.HashMap;
import java.util.Map;

public class LC454 {
    public static void main(String[] args) {
       int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = { -1, 2 };
        int[] nums4 = {0,2};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int a : nums1){
            for(int b: nums2){
                mp.put(a+b, mp.getOrDefault(a+b, 0)+1);
            }
        }
        int count = 0;
        for(int c: nums3){
            for(int d: nums4){
                count += mp.getOrDefault(-c-d, 0);
            }
        }
        System.out.println(count);
    }
}
