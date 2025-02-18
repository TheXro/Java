public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotate(arr, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        for (int i = 1; i <= k; i++) {
            int temp = arr[n-1];
            for (int j = n - 1; j > 0; j--) { 
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        
    }

}
