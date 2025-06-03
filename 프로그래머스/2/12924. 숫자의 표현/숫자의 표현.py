def solution(n):
    answer= 0
    end = int(n/2) + 1
    for i in range(1,end):
        num = 0
        j = i
        while num <= n:
            num += j
            print(num)
            if num == n:
                answer += 1
                print('answer:' , num)
                break
            j += 1
    return answer + 1