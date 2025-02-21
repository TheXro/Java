public class SubtractTwoInts {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int carry = 0;
        while (b != 0) {
            carry = (~a & b) << 1;
            a = a^b;
            b = carry;
        }
        System.out.println(1&5);
    }
}
