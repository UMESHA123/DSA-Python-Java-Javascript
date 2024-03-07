function lcs(str1, str2, m, n){
    if(m === 0 || n === 0){
        return 0;
    }
    if(str1[m-1] === str2[n-1]){
        return 1+lcs(str1, str2, m-1, n-1);
    }else{
        return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
    }
}

let str1 = "GEEK";
let str2 = "GEFK";
let m = str1.length;
let n = str2.length;

let res = lcs(str1, str2, m, n);
let len = (m-res) + (n-res);
console.log(len);