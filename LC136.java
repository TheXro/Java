public class LC136 {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        // int res = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     res ^= nums[i];
        // }
        // System.out.println(res);

        //second approach using lsd and msd

        int count = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) {
                count |= (1 << i);
            }

        }
        // return count;
        System.out.println(count);
    }
}
