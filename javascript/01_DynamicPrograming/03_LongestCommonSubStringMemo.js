let str1 = "AXYZ";
let str2 = "BAZ";
m = str1.length; 
n = str2.length;
let memo = [];

for(let i=0;i<m+1;i++){
    let temp = [];
    for(let j=0;j<n+1;j++){
        temp[j] = -1;
    }
    memo.push(temp);
}

function lcs(str1, str2, m, n){
    if(memo[m][n] !== -1){
        return memo[m][n];
    }
    if(m === 0 || n === 0){
        return 0;
    }
    else{
        if (str1[m-1] === str2[n-1]){
            memo[m][n] = 1+lcs(str1, str2, m-1, n-1);
        }
        else{
            memo[m][n] = Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
        }
    }
    return memo[m][n];
}
let res = lcs(str1, str2, m, n);
console.log(res);