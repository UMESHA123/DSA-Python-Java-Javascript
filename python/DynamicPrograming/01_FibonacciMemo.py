n = 5
memo = [-1]*(n+1)

def fib(n):
    if memo[n] == -1:
        res = 0
        if n == 1 or n == 0:
            res = n 
        else:
            res = fib(n-1) + fib(n-2)
        memo[n] = res
    return memo[n]

res = fib(n)
print(res)
