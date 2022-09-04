
n=int(input())

arr=[]
for i in range(n):
    word=list(input())
    for j in range(len(word)):
        arr.append(word[j])
# arr.sort()
charr=[]

for i in range(len(arr)):
    charr.append(arr.count(arr[i]))
print(charr)
print(arr)
for i in range(len(charr)):
    if charr[i]%n!=0:
        print("false")
        exit()
print("true")
        

