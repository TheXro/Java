import java.util.Random;

public class RandomizedQuickSort {
    private static int randomizedPartition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = pivot;

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[i + 1] = arr[high];
        return i + 1;
    }

    public static void randomizedQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(arr, low, high);
            System.out.println("Partitioned at " + pivotIndex + " with array: " + java.util.Arrays.toString(arr));
            randomizedQuickSort(arr, low, pivotIndex - 1);
            randomizedQuickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Randomized Quick Sort:");
        randomizedQuickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
}
