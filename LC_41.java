public class LC_41 {
    public static void main(String[] args) {
        int[] arr = { 7,8,9,10,11 };
        sort(arr);

    }

    static void sort(int[] arr) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < arr.length) {
            int correct = arr[i];
            if (min > arr[i] && arr[i] > 0) {
                min = arr[i];
            }
            if (correct < arr.length && correct > 0 && correct != i)
            // if (correct > arr.length && i != correct)
            {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            // System.out.println(j + " " + arr[j]);
            if (arr[j] != j) {
                System.out.println(j + 1);
                return;
            }
            else System.out.println(arr.length);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
