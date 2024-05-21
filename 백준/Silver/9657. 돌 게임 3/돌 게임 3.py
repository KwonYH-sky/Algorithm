"""
돌 게임 3
 
시간 제한   메모리 제한
1 초   128 MB
문제
돌 게임은 두 명이서 즐기는 재밌는 게임이다.

탁자 위에 돌 N개가 있다. 
상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 돌은 1개, 3개 또는 4개 가져갈 수 있다. 
마지막 돌을 가져가는 사람이 게임을 이기게 된다.

두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 
게임은 상근이가 먼저 시작한다.

입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 1000)

출력
상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.

예제 입력 1 
6
예제 출력 1 
SK
"""

# Answer
N = int(input())

dp = [0] * 1001
dp[1] = 1

for i in range(2, 1001):
    if dp[i-1] == 0:
        dp[i] = 1
    if i-3 >= 0 and dp[i-3] == 0:
        dp[i] = 1
    if i-4 >= 0 and dp[i-4] == 0:
        dp[i] = 1
        
if dp[N] == 1:
    print("SK")
else:
    print("CY")