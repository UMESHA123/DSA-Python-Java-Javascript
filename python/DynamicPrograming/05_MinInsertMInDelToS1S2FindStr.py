#this function return the lcs string
def lcs(str1, str2, m, n):
    dp = [["" for _ in range(n+1)]  for _ in range(m+1)]

    for i in range(1, m+1):
        for j in range(1, n+1):
            if str1[i-1] == str2[j-1]:
                dp[i][j] = dp[i-1][j-1] + str1[i-1]
            else:
                dp[i][j] = dp[i][j-1] if len(dp[i][j-1]) > len(dp[i-1][j]) else dp[i-1][j]
    print(dp)
    return dp[m][n] 

#this function return the shortestCommonSubsqunce
def shortestCommonSubsqunce(str1, str2, str):
    res = ""
    i, j = 0, 0
    for c in str:
        while str1[i] != c:
            res += str1[i]
            i = i+1
        while str2[j] != c:
            res += str2[j]
            j += 1
        res = res + c 
        i += 1
        j += 1
    return res 

#this function return lorgest common subsequence of a string 
def longestPollindromicSubsquence(str):
    s = str 
    str = str[::-1]
    return lcs(s, str, len(s), len(str))


str1 = "GEEK"
str2 = "GEFK"
m = len(str1)
n = len(str2)
res = lcs(str1, str2, m, n)
print(res)
newString = shortestCommonSubsqunce(str1, str2, res)
print(newString)

# str = "bbabcbcab"
str = "GEEGS"
len_polindrome = longestPollindromicSubsquence(str)
print(len_polindrome)
