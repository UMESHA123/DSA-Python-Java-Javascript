class Fibonachi{
    

    Fibonachi(int n){
        int memo[] = new int[n+1];
       
    }

    public int fib(int n){
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
}

public class O1_Fibonacci_memo{
    public static void main(String args[]){
        int n = 5;
        Fibonachi ob1 = new Fibonachi(n);
        int res = ob1.fib(n);
        System.out.println("Result ", res);
    }
}