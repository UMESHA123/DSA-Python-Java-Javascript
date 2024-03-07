import java.util.Arrays;

public class O6_VarientsLcs {
    static String dp[][];
    static String lcs(String str1, String str2, int m, int n){
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
    static String shortestCommonSubsqunce(String str1, String str2, String str){
        String res = "";
        int j=0, k=0;
        for(int i=0;i<str.length();i++){
            while(str1.charAt(j) != str.charAt(i)){
                res = res + str1.charAt(j++);
            }
            while(str2.charAt(k) != str.charAt(i)){
                res = res + str2.charAt(k++);
            }
            res = res + str.charAt(i);
            j++;
            k++;
        }
        return res;
    }
    static String lorgestpolindromicSubstring(String str){
        String rev = "";
        for(int i=0;i<str.length();i++){
            rev = str.charAt(i) + rev;
        }
        return lcs(str, rev, str.length(), rev.length());
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

        String res = lcs(str1, str2, m, n);
        System.out.println(res);

        String res1 = shortestCommonSubsqunce(str1, str2, res);
        System.out.println(res1);

        String res2 = lorgestpolindromicSubstring(str1);
        System.out.println(res2);
    }
}
