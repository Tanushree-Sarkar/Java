n=int(input("Enter the size of array: "))
arr=[0]*n
for i in range(n):
    arr[i]=int(input())
k=int(input("Enter a positive integer: "))
s=arr[-k:]
del arr[-k:]
s.extend(arr)
print(s)