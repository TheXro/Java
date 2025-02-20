//leet code 1922. Count Good Numbers
public class LC1922 {
    public static void main(String[] args) {
        int n = 4;
        countGoodNumbers(n);
    }

    static void countGoodNumbers(int n) {
        int mod = 1000000007;
        long result = 1;
        if (n % 2 == 0) {
            result = (long) Math.pow(5, n / 2) * (long) Math.pow(4, n / 2);
        } else {
            result = (long) Math.pow(5, n / 2) * (long) Math.pow(4, n / 2 + 1);
        }
        System.out.println(result % mod);
    }
}
