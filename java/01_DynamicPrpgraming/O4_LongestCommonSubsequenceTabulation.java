
public class O4_LongestCommonSubsequenceTabulation {
    static int matrix[][];

    static int lcs(String str1, String str2, int m, int n){
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    matrix[i][j] = 1+matrix[i-1][j-1];
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String args[]){
        
        String str1 = "AXYZ";
        String str2 = "BAZ";
        int m = str1.length();
        int n = str2.length();
        
        matrix = new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                matrix[i][j] = -1;
            }
        }

        int res = lcs(str1, str2, m, n);
        System.out.println(res);
    }
}
