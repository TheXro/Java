import java.util.ArrayList;

public class Add2Arrays {
    public static void main(String[] args) {
        // arr1 = {9, 9}
        // arr2 = {9, 9, 9}
        // sum = {1, 0, 9, 8}
        int[] arr1 = { 9, 9 };
        int[] arr2 = { 9, 9, 9 };
        System.out.println(add(arr1, arr2));

    }

    public static ArrayList<Integer> add(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }
            sum += carry;
            System.out.println(sum);
            int rem = sum % 10;
            System.out.println(rem);
            carry = sum / 10; 
            System.out.println(carry);
            ans.add(0, rem);
            i--;
            j--;
        }
        if (carry != 0) {
            ans.add(0, carry);
        }
        return ans;
    }
}

//initializeing an arrya
// int[] arr = new int[5];