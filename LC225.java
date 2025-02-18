public class LC225 {
    public static void main(String[] args) {
        //implementing stack using queue
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
    static class MyStack {
        private java.util.Queue<Integer> q1;
        private java.util.Queue<Integer> q2;
    
        private int top;
        public MyStack() {
            q1 = new java.util.LinkedList<>();
            q2 = new java.util.LinkedList<>();
        }
        public void push(int x) {
            q1.add(x);
            top = x;
        }
        public int pop() {
            while (q1.size() > 1) {
                top = q1.remove();
                q2.add(top);
            }
            int res = q1.remove();
            java.util.Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return res;
        }
        public int top() {
            return top;
        }
        public boolean empty() {
            return q1.isEmpty();
        }
    }
}
