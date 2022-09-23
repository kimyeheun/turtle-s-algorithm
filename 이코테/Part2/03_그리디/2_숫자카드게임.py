n, m = map(int, input().split())

ans = []
for i in range(n):
    card = list(map(int, input().split()))
    ans.append(min(card))
print(max(ans))
