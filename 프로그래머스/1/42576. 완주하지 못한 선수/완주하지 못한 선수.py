def solution(participant, completion):
    answer = ""

    participant.sort()
    completion.sort()
    
    # print(participant)
    # print(completion)
    
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            answer = participant[i]
            return answer
            
    answer = participant.pop()
    
    return answer