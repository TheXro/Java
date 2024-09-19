package BinarySearch;

/**
 * SmallestLetter
 */
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letter = {'c','j','f'};
        System.out.println(smallLetter(letter, 'c'));
    }
    static char smallLetter(char[] letters , char target){
        int start = 0;
        int end = letters.length - 1 ;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}