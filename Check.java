public class Check {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        // System.out.println(arr[0][0]);
        // String s = "Hello";
        // System.out.println(String.);
        // int a = 536870912;
        // System.out.println(Math.floor(Math.log(a) / Math.log(2)));
        // System.out.printl/n(
            // Math.ceil(Math.log(a) / Math.log(2))
        // );
        // System.out.println(1 << 8);
        int a = 5;
        int b = 7;
        int carry = 0;
        System.out.println((int)(a&b));
        while (b != 0) {
            carry = (a & b) << 1;
            // System.out.println(carry);
            a = a^b;
            b = carry;
        }
        System.out.println(a);
    }
}
