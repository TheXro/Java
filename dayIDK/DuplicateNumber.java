//leetcode 287
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2 };
        checkDuplicate(nums);
    }

    public static void checkDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] - 1 != j) {
                System.out.println("Duplicate Number is: " + arr[j]);
            }
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
