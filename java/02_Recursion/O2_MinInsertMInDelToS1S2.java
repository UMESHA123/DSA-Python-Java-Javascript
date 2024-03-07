public class O2_MinInsertMInDelToS1S2{
    static int solve(String str1, String str2, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return 1+solve(str1, str2, m-1, n-1);
        }else{
            return Math.max(solve(str1, str2, m-1, n), solve(str1, str2, m, n-1));
        }
    }
    public static void main(String args[]){
        String str1 = "GEEK";
        String str2 = "GEFK";
        int m = str1.length();
        int n = str2.length();

        int res = solve(str1, str2, m, n);
        int len = (m-res) + (n-res);
        System.out.println(len);
    }
}