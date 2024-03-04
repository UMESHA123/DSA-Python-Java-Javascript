function fib(n){
    let first = 0;
    let second = 1;
    let res = 0;
    for(let i=2;i<n+1;i++){
        res = first + second;
        first = second;
        second = res; 
    }
    return res;
}
let res = fib(5)
console.log(res);