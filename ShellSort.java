
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;// j = j - gap;
                }
                arr[j] = temp;
            }
            System.out.println("After gap " + gap + ": " + java.util.Arrays.toString(arr));
            gap /= 2;
        }
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
        System.out.println("Shell Sort:");
        shellSort(array);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
}
