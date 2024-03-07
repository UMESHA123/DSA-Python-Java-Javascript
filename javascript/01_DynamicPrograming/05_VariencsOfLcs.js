function lcs(str1, str2, m, n) {
    let dp = [];
    for (let i = 0; i < m + 1; i++) {
        dp.push(new Array(n + 1).fill(""));
    }
    
    for (let i = 1; i < m + 1; i++) {
        for (let j = 1; j < n + 1; j++) {
            if (str1[i - 1] === str2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + str1[i - 1];
            } else {
                dp[i][j] = dp[i][j - 1].length > dp[i - 1][j].length ? dp[i][j - 1] : dp[i - 1][j];
            }
        }
    }
    
    return dp[m][n];
}

//function for finding shortestCommonSubsqunce
function shortestCommonSubsqunce(str1, str2, str){
    let res = ""
    let j=0, k=0;

    for(let i=0;i<str.length;i++){
        while(str1[j] != str[i]){
            res = res + str1[j++];
        }
        while(str2[k] != str[i]){
            res = res + str2[k++];
        }
        res = res + str[i]
        j++;
        k++;
    }
    return res;
}

//function for finding logest polindrominc substring
function lorgestpolindromicSubstring(str){
    let rev = ""
    for(let i=0;i<str.length;i++){
        rev = str[i] + rev;
    }
    return lcs(str, rev, str.length, rev.length)
}
let str1 = "GEEK";
let str2 = "GEFK";
let m = str1.length;
let n = str2.length;
let res1 = lcs(str1, str2, m, n);
console.log(res1);

let res2 = shortestCommonSubsqunce(str1, str2, res1)
console.log(res2);

let str = "bbabcbcab"
let res3 = lorgestpolindromicSubstring(str)
console.log(res3)