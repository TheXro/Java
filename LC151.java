import java.util.Stack;

public class LC151 {

    public static void main(String[] args) {
        String s = "The sky is blue";
        reverseWords(s);
    }

    static void reverseWords(String s) {
        // String[] words = s.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for (int i = words.length - 1; i >= 0; i--) {
        //     if (!words[i].equals("")) {
        //         sb.append(words[i]).append(" ");
        //     }
        // }
        // System.out.println(sb.toString().trim());
        // OR Using stack
        String[] words = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            if (!word.equals("")) {
                stack.push(word);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb.toString().trim());
        
    }

}
