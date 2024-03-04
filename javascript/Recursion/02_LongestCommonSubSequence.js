let str1 = "AXYZ";
let str2 = "BAZ";
m = str1.length; 
n = str2.length;

function lcs(str1, str2, m, n){
    if(m === 0 || n === 0){
        return 0;
    }
    if(str1[m-1] === str2[n-1]){
        return 1 + lcs(str1, str2, m-1, n-1);
    }
    else{
        return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1))
    }
}
let res = lcs(str1, str2, m, n);
console.log(res);