public class LC232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
    public static class MyQueue {
        private java.util.Stack<Integer> s1;
        private java.util.Stack<Integer> s2;
        private int front;
        public MyQueue() {
            s1 = new java.util.Stack<>();
            s2 = new java.util.Stack<>();
        }
        public void push(int x) {
            if (s1.isEmpty())
                front = x;
            s1.push(x);
        }
        public int pop() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            return s2.pop();
        }
        public int peek() {
            if (!s2.isEmpty())
                return s2.peek();
            return front;
        }
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }
}
