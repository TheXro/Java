import java.util.*;
public class Arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        arr.set(1, 5);
        arr.remove(2);
        arr.add(1, 6);
        System.out.println(arr);


    }
}
