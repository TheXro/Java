import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        int[] arr3 = intersection(arr1, arr2);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //can't pridict the size of the intersection array 
    //we can by taking the minimum of the two arrays

    public static int[] intersection(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[Math.min(n, m)]; //intersection array
        //arraylist
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                if (arr1[j] == arr2[k]) {
                    arr3[i] = arr1[j];
                    list.add(arr1[j]);
                    i++;
                    break;
                }
            }
        }
        // return arr3; //3 4 5 0 0 
        return list.stream().mapToInt(x -> x).toArray();

    }

}
