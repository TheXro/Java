package dayIDK;

public class LCS {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int[] dp = new int[text1.length()];
        int longest = 0;

        for (char c : text2.toCharArray()) {
            int curLength = 0;
            for (int i = 0; i < dp.length; i++) {
                if (curLength < dp[i]) {
                    curLength = dp[i];
                } else if (c == text1.charAt(i)) {
                    dp[i] = curLength + 1;
                    longest = Math.max(longest, curLength + 1);
                }
            }
        }

        return longest;  
    }
}
