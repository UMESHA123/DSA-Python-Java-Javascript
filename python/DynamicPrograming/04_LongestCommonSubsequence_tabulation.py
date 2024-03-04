def lcs(str1, str2,m,n):
    matrix = [[-1 for _ in range(n+1)] for _ in range(m+1)]
    for i in range(m+1):
        matrix[i][0] = 0
    for i in range(n+1):
        matrix[0][i] = 0
    for i in range(1,m+1):
        for j in range(1,n+1):
            if str1[i-1] == str2[j-1]:
                matrix[i][j] = 1+ matrix[i-1][j-1]
            else:
                matrix[i][j] = max(matrix[i-1][j], matrix[i][j-1])
    return matrix[m][n]
str1 = "AXYZ"
str2 = "BAZ"

res = lcs(str1, str2, len(str1), len(str2))
print(res)