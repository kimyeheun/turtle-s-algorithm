def gcd(a,b):
    while b>0:
        a,b=b, a%b
    return a
    
t=int(input())
for i in range(t):
    l,m=input().split()
    a=len(l)
    b=len(m)
    g=gcd(a,b)
    ans=l[0:g]
    
    if ans in l:
        L=l.replace(ans,"")
        M=m.replace(ans,"")

    if len(L)==0 and len(M)==0:
        print(ans)
    else:
        print("")    
    
    
