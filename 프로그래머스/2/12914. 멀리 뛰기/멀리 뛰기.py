def solution(n):
    answer = 0
    k = n
    
    while n >= 0:
        answer = answer + combination(k,n)
        k = k - 1
        n = n - 2
            
    return answer % 1234567

def combination(k,n):
    if k - n == 0:
        return 1
        
    num1, num2, num3 = 1, 1, 1
    
    for i in range(1, k+1):
        num1 *= i
        
    for j in range(1, n+1):
        num2 *= j
        
    for m in range(1, k-n+1):
        num3 *= m
        
    return num1 // (num2 * num3)    