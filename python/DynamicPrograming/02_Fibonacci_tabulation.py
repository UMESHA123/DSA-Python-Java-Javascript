n = 5
def fib(n):
    first = 0
    second = 1
    res = 0
    for i in range(2,n+1):
        res = first + second 
        first = second 
        second = res 
    return res 

res = fib(n)
print(res)