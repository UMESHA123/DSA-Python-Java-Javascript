let n = 5;
function fib(n){
    if(n == 0 || n == 1){
        return n;
    }
    return fib(n-1) + fib(n-2);
}
let res = fib(n);
console.log(res);