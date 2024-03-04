public class O2_FibonacciTabulation{
    static int fib(int n){
        int first = 0;
        int second = 1;
        int res = 0;
        for(int i=2;i<n+1;i++){
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
    public static void main(String args[]){
        int n = 5;
        int res = fib(n);
        System.out.println(res);
    }
}