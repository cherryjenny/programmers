from collections import Counter

def solution(k, tangerine):
    answer = 0
    size_counts = Counter(tangerine)
    
    sorted_counts = sorted(size_counts.values(), reverse=True)
            
    for count in sorted_counts:
        k -= count  
        answer += 1 
        if k <= 0:  
            break

    return answer