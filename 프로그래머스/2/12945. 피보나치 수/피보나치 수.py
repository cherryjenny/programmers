def solution(n):
    memo = [0,1]
    
    for i in range(2, n+1) :
        memo.append(memo[i-1] + memo[i-2])
    
    print(memo[n])
    # print(memo[n] % 1234567)
        
    return memo[n] % 1234567
    


        