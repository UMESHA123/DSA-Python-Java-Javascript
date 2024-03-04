let str1 = "AXYZ";
let str2 = "BAZ";
m = str1.length; 
n = str2.length;
let matrix = [];

for(let i=0;i<m+1;i++){
    let temp = [];
    for(let j=0;j<n+1;j++){
        temp[j] = -1;
    }
    matrix.push(temp);
}
for(let i=0;i<m+1;i++){
    matrix[i][0] = 0;
}
for(let i=0;i<n+1;i++){
    matrix[0][i] = 0;
}

function lcs(str1, str2, m, n){
    for(let i=1;i<m+1;i++){
        for(let j=1;j<n+1;j++){
            if(str1[i-1] === str2[j-1]){
                matrix[i][j] = 1+matrix[i-1][j-1];
            }
            else{
                matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
            }
        }
    }
    return matrix[m][n];
}

let res = lcs(str1, str2, m, n);
console.log(res);