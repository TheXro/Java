import java.util.Stack;
public class LC316 {
    public static void main(String[] args) {
        //remove duplicate print lexicagraphically
        String s = "cbacdcbc"; // acdb
        removeDuplicate(s);
    }
    public static void removeDuplicate(String s){
        int[] freq = new int[26];
        boolean[] vis = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        //      using stack
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;
            if (vis[ch - 'a'])
                continue;
            while (!vis[ch - 'a'] && !stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                vis[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            vis[ch - 'a'] = true;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
