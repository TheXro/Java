public class LC20 {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        int n = s.length();
        if (n == 0)
            return true;
        if (n % 2 != 0)
            return false;
        char[] stack = new char[n];
        int top = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
        //matching the closing bracket with the top of the stack
            if (c == ')' && top > 0 && stack[top - 1] == '(') {
                top--;
            } else if (c == ']' && top > 0 && stack[top - 1] == '[') {
                top--;
            } else if (c == '}' && top > 0 && stack[top - 1] == '{') {
                top--;
            } else {
                stack[top++] = c;
            }
            
        }
        return top == 0;
    }
}
