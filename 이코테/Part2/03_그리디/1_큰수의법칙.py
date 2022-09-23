
n, m, k = map(int, input().split())


num = list(map(int, input().split()))
num.sort()
# print(arr)

ans = 0
max_cnt = int(m/k)
cnt = int(m % k)
if num[-1] >= num[-2]:
    ans += num[-1]*(k*max_cnt)+num[-2]*cnt
print(ans)


# 1. 수 입력 받기
# 2. 제일 큰 수 찾아서 k번 더하기 (같은 수여도 다른 수로 취급 가능) -> 일단 정렬
# 3. m번까지만 더할 수 있음
