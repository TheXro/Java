public class CipherGifrChallenge {
    public static void main(String[] args) {
        //given the string s cantaining a or z only
        // input = azazza //output = zzaaza
        // input = azaza //output = zzaaa
        //input = azzazazaaz //output = zzzzaaaaaz

        //print the lexicographically maximum string possible in a new line.
        //you can reverse any or zero substring with an even number of z, any or zero number of times.

        String s = "azazza";
        int n = s.length();
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'z') {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                break;
            }
            if (arr[i] == 'a') {
                if (count % 2 == 0) {
                    for (int j = i; j < n; j++) {
                        if (count == 0) {
                            break;
                        }
                        if (arr[j] == 'z') {
                            arr[j] = 'a';
                            count--;
                        }
                    }
                } else {
                    for (int j = i; j < n; j++) {
                        if (count == 0) {
                            break;
                        }
                        if (arr[j] == 'z') {
                            arr[j] = 'a';
                            count--;
                        }
                    }
                }
            }
        }
        System.out.println(new String(arr));

    }
}
