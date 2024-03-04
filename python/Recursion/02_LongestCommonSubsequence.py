def lcs(str1, str2, m, n):
    if m == 0 or n == 0:
        return 0
    if(str1[m-1] == str2[n-1]):
        return 1 + lcs(str1, str2, m-1, n-1)
    return max(lcs(str1, str2, m-1, n), lcs(str1, str2, m,n-1))

str1 = "AXYZ"
str2 = "BAZ"
res = lcs(str1, str2, len(str1), len(str2))
print(res)