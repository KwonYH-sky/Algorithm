/*
홀짝 수열

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	1180	780	691	68.688%
문제
길이가
$N$인 수열의
$i(1 \le i \le N)$번째 원소를 정수
$a_i(1\le a_i \le 100)$라고 하자. 동훈이는 이 수열을 잘 정렬해서 홀짝 수열로 만들고 싶다. 어떤 수열이 홀짝 수열이 되려면 다음 조건을 만족해야 한다.

수열의 홀수번째 원소는 모두 홀수여야 하고, 순서대로 나열했을 때 감소하지 않아야 한다.
$$a_1 \le a_3 \le a_5 \le a_7 \le ...$$ 
수열의 짝수번째 원소는 모두 짝수여야 하고, 순서대로 나열했을 때 감소하지 않아야 한다.
$$a_2 \le a_4 \le a_6 \le a_8 \le ...$$ 
다음과 같은 수열은 홀짝 수열이다.
$[1, 2, 1], [3], [5, 4]$ 그러나 다음과 같은 수열은 홀짝 수열이 아니다.
$[3, 2, 1], [2, 2], [5, 4, 7, 2]$ 

 
$[3, 2, 1]$의 홀수번째 원소들을 순서대로 나열하면
$[3, 1]$인데, 감소하기 때문에 홀짝 수열이 아니다.

 
$[2, 2]$는 첫 번째 원소가 홀수가 아니므로 홀짝 수열이 아니다.

 
$[5,4,7,2]$의 짝수번째 원소들을 순서대로 나열하면
$[4, 2]$인데, 감소하기 때문에 홀짝 수열이 아니다.

길이
$N$의 수열
$a_1,a_2,…a_N$이 주어졌을 때, 이 수열을 잘 정렬한다면 홀짝 수열로 만드는 것이 가능할까?

입력
첫째 줄에 수열의 길이
$N(1\le N \le 100)$이 주어진다.

둘째 줄에
$a_1, a_2, ..., a_N$이 주어진다. 수열의
$i$번째 원소는 정수
$a_i(1\le a_i \le 100)$이다.

출력
주어진 수열을 잘 정렬해서 홀짝 수열로 만들 수 있다면 1을, 어떻게 정렬하더라도 홀짝 수열로 만들 수 없다면 0을 출력한다.

예제 입력 1
3
2 1 1
예제 출력 1
1
예제 입력 2
3
4 2 3
예제 출력 2
0
예제 입력 3
5
4 1 6 3 5
예제 출력 3
1

 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    val vOdd = mutableListOf<Int>()
    val vEven = mutableListOf<Int>()

    for (i in 0 until n) {
        val num = scanner.nextInt()
        if (num % 2 == 1) vOdd.add(num) else vEven.add(num)
    }

    var ans = 1
    if (vOdd.size - vEven.size > 1 || vOdd.size - vEven.size < 0) {
        ans = 0
    } else {
        vOdd.sort()
        vEven.sort()

        for (i in 1 until vEven.size) {
            if (vEven[i] < vEven[i - 1]) {
                ans = 0
                break
            }
        }

        if (ans != 0) {
            for (i in 1 until vOdd.size) {
                if (vOdd[i] < vOdd[i - 1]) {
                    ans = 0
                    break
                }
            }
        }
    }

    println(ans)
}
