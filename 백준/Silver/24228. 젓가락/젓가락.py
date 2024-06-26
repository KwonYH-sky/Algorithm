"""
젓가락
 
시간 제한   메모리 제한
1 초   512 MB
문제
젓가락통에 N 종류의 젓가락이 종류별로 충분히 많이 들어있다. 
당신은 이 젓가락통에서 무작위로 젓가락을 뽑아서 
R개의 짝을 맞춰야 한다. 최악의 경우 몇 개의 젓가락을 뽑아야 하는가?

입력
두 개의 정수 
N, R이 주어진다. 
(1 ≤ N,R ≤ 10^18)

출력
최악의 경우 뽑아야 하는 젓가락의 개수를 출력한다.

예제 입력 1 
2 1
예제 출력 1 
3

2개만 뽑으면 짝이 0개일 가능성이 있다. 
반면에 3개를 뽑으면 모든 경우에 대해서 짝이 최소 1개는 맞춰진다.
"""

# Answer

N, R = map(int, input().split())
print(N + (R * 2) - 1)