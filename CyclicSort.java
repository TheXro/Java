public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // if (arr[i] != arr[correct]) {
                if (i != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
