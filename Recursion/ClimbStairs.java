package Recursion;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 234;
        int pro = 1;
        int sum = 0;
        while(n>0){
            sum = sum + n % 10;
            System.out.println(sum);
            pro = pro * (n % 10);
            System.out.println(pro);
            n=n/10;
        }
        System.out.println(pro-sum);
    }
}
