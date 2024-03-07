import java.util.Arrays;

public class O5_LCS_string {
    static String dp[][];
    static String lcs_string(String str1, String str2, int m, int n){
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + str1.charAt(i-1);
                }else{
                    dp[i][j] = (dp[i][j-1].length() > dp[i-1][j].length()) ? dp[i][j-1] : dp[i-1][j];
                }
            }
        }
        
        return dp[m][n];
    }
    public static void main(String args[]){
        String str1 = "GEEK";
        String str2 = "GEFK";
        int m = str1.length();
        int n = str2.length();
        dp = new String[m+1][n+1];

        for (String row[] : dp) {
            Arrays.fill(row, "");
        }
        String res = lcs_string(str1, str2, m, n);
        System.out.println(res);
    }
}
