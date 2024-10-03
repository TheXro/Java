package BinarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        // answer should be [1,4]
        int ans[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            if (target == nums[i]) {
                ans[0] = i;
                break;
            }
        }
        for(int i = nums.length-1; i>=0; i--){
            if (target == nums[i]) {
                ans[1] = i;
                break;
            }
        }
        // System.out.println(Arrays.toString(ans));
        
    }
    
}
