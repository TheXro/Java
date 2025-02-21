public class KthBitSetOrNot {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(isKthBitSet(n, k));
    }

    static boolean isKthBitSet(int n, int k) {
        int mask = 1 << (k);
        return (n & mask) != 0;
    }
}
