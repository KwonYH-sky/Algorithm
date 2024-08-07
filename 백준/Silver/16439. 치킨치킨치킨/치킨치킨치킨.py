"""
치킨치킨치킨
 
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	1849	1333	1136	74.590%
문제
N명의 고리 회원들은 치킨을 주문하고자 합니다.

치킨은 총 M가지 종류가 있고 회원마다 특정 치킨의 선호도가 있습니다. 한 사람의 만족도는 시킨 치킨 중에서 선호도가 가장 큰 값으로 결정됩니다. 진수는 회원들의 만족도의 합이 최대가 되도록 치킨을 주문하고자 합니다.

시키는 치킨의 종류가 많아질수록 치킨을 튀기는 데에 걸리는 시간도 길어지기 때문에 최대 세 가지 종류의 치킨만 시키고자 합니다.

진수를 도와 가능한 만족도의 합의 최댓값을 구해주세요.

입력
첫 번째 줄에 고리 회원의 수 N (1 ≤ N ≤ 30) 과 치킨 종류의 수 M (3 ≤ M ≤ 30) 이 주어집니다.

두 번째 줄부터 N개의 줄에 각 회원의 치킨 선호도가 주어집니다.

i+1번째 줄에는 i번째 회원의 선호도 ai,1, ai,2, ..., ai,M (1 ≤ ai,j ≤ 9) 가 주어집니다.

출력
첫 번째 줄에 고리 회원들의 만족도의 합의 최댓값을 출력합니다.

예제 입력 1 
3 5
1 2 3 4 5
5 4 3 2 1
1 2 3 2 1
예제 출력 1 
13
예제 입력 2 
4 6
1 2 3 4 5 6
6 5 4 3 2 1
3 2 7 9 2 5
4 5 6 3 2 1
예제 출력 2 
25
"""

# Answer
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
chickens = [list(map(int, input().split())) for _ in range(N)]
answer = 0
for i in range(M):
    for j in range(i+1, M):
        for k in range(j+1, M):
            satisfaction = 0
            for chicken in chickens:
                satisfaction += max(chicken[i], chicken[j], chicken[k])
            answer = max(answer, satisfaction)
print(answer)