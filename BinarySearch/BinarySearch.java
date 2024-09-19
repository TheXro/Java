package BinarySearch;
public class BinarySearch {

    public static void main(String[] args) {
        //binary search = Search algorithm that finds the position of a target value within a sorted array.
        //half of the array is eliminated during each "step".

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int x = search(numbers, target);
        
    }

    public static  int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}