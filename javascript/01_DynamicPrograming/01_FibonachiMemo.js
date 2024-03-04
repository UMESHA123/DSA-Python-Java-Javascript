let memo = [];
let n = 5;

for(let i=0;i<n+1;i++){
    memo[i] = -1;
}

function fib(n){
    
    if(memo[n] === -1){
        let res;
        if(n === 0 || n === 1){
            res = n;
        }
        else{
            res = fib(n-1) + fib(n-2);
        }
        memo[n] = res;
    }
    return memo[n];
}
let res = fib(n);
console.log(res);