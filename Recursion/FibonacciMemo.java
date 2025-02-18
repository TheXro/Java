class FibonacciMemo {

    public int fib(int n) {
            if (n <= 1) {
                return n;
            }
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            memo[0] = 0;
            memo[1] = 1;
            return fibHelper(n, memo);
        }
    
        private int fibHelper(int n, int[] memo) {
            if (memo[n] != -1) {
                return memo[n];
            }
            memo[n] = fibHelper(n - 1, memo) + fibHelper(n - 2, memo);
            return memo[n];
        }
    }