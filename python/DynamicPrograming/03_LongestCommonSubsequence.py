str1 = "AXYZ"
str2 = "BAZ"
m = len(str1)
n = len(str2)

memo = [[-1 for _ in range(n+1)] for _ in range(m+1) ] 
print(memo)
def lcs(str1, str2, m, n):
    if memo[m][n] != -1:
        return memo[m][n]
    if m == 0 or n == 0:
        memo[m][n] = 0
    else:
        if str1[m-1] == str2[n-1]:
            memo[m][n] = 1 + lcs(str1, str2, m-1, n-1)
        else:
            memo[m][n] = max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1))
    return memo[m][n]

res = lcs(str1, str2, m,n)
print(memo)
print(res)