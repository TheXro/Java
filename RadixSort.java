public class RadixSort {
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int index = arr[i] / exp;
            count[index % 10]++;
        }

        System.out.println("Count after counting digits for exp " + exp + ": " + java.util.Arrays.toString(count));

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Cumulative count: " + java.util.Arrays.toString(count));

        for (int i = n - 1; i >= 0; i--) {
            int index = arr[i] / exp;
            output[count[index % 10] - 1] = arr[i];
            count[index % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
        System.out.println("Sorted array for exp " + exp + ": " + java.util.Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        int maxNum = getMax(arr);
        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements in the array:");
        int n = new java.util.Scanner(System.in).nextInt();
        int[] array = new int[n];
        System.out.println("Enter the " + n +" elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println("UnSorted Array: " + java.util.Arrays.toString(array));
        System.out.println("Radix Sort:");
        radixSort(array);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
}
