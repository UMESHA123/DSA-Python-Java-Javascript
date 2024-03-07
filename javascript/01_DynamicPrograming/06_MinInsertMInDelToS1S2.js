function solve(str1, str2, m, n){
    let dp = []
    for(let i=0;i<m+1;i++){
        dp.push([])
    }
    for(let i=0;i<m+1;i++){
        dp[i][0] = 0
    }
    for(let j=0;j<n+1;j++){
        dp[0][j] = 0
    }
    for(let i=1;i<m+1;i++){
        for(let j=1;j<n+1;j++){
            if(str1[i-1] === str2[j-1]){
                dp[i][j] = 1 + dp[i-1][j-1] 
            }else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])
            }
        }
    }
    return dp[m][n];
}


let str1 = "GEEK";
let str2 = "GEFK";
let m = str1.length;
let n = str2.length;

let res = solve(str1, str2, m, n)
len = (m - res) + (n-res)
console.log(len)