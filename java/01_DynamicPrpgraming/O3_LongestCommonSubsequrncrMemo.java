import java.util.Arrays;

public class O3_LongestCommonSubsequrncrMemo{
    static int[][] memo;
    static int lcs(String str1, String str2, int m, int n){
        if(memo[m][n] != -1){
            return memo[m][n];
        }
        if(m == 0 || n == 0){
            memo[m][n] = 0;
        }
        else{
            if(str1.charAt(m-1) == str2.charAt(n-1)){
                memo[m][n] = 1+lcs(str1, str2, m-1, n-1);
            }
            else{
                memo[m][n] = Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
            }
        }
        return memo[m][n];
    }
    public static void main(String args[]){
        String str1 = "AXYZ";
        String str2 = "BAZ";
        int m = str1.length();
        int n = str2.length();

        memo = new int[m+1][n+1];
        for(int row[] : memo){
            Arrays.fill(row, -1);
        }

        int res = lcs(str1, str2, m, n);
        System.out.println((res));
    }
}