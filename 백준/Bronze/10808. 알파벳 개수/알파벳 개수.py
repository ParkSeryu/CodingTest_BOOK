S = input()

ans = [0] * 26

for i in S:
    ans[ord(i) - 97] += 1

for i in ans:
    print(i, end=' ')
