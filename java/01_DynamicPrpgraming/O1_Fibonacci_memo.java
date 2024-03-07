import java.util.Arrays;

public class O1_Fibonacci_memo{
    static int memo[];
   
    static int fib(int n){
        if(memo[n] == -1){
            int res;
            if(n==0 || n==1){
                res = n;
            }
            else{
                res = fib(n-1) + fib(n-2);
            }
            memo[n] = res;
        }
        return memo[n];
    }
    public static void main(String args[]){
       int n = 5;
       memo = new int[n+1];
       Arrays.fill(memo, -1);
       
       int res = fib(n);
       System.out.println(res);
    }
}