/*
오락실에 간 총총이

시간 제한	메모리 제한
2 초	1024 MB

문제
곰곰 피규어를 생각하며 신나있는 총총이

우연히 들리게 된 오락실에서, 총총이는 귀여운 곰곰이가 잔뜩 등장하는 게임을 발견했다.
게임의 화면은
N X N 크기의 칸으로 나누어져 있고, 각 칸에는 곰곰이가 있거나 또는 비어있다.
화면에는 최소 한 마리의 곰곰이가 존재한다.

게임은 상하좌우 네 개의 버튼을 눌러서 진행할 수 있다.
각 버튼을 누르게 되면, 화면에 있는 모든 곰곰이들이 그 버튼에 해당하는 방향으로 한 칸 움직이게 된다.
만약 이미 화면의 끝에 있어서 그 방향으로 이동하지 못하는 곰곰이들은 가만히 있는다.
버튼을 잘 눌러서 모든 곰곰이들을 하나의 칸에 모으게 되면, 화면에 GOMGOM 이라는 글자가 뜨면서 승리하게 된다.

현재 오락실에서는 이 게임을 가장 적은 횟수의 버튼을 눌러서 승리한 플레이어에게
곰곰 피규어를 주는 이벤트를 진행하고 있다. 귀여운 곰곰 피규어를 노리는 총총이를 위해,
최소 몇 번의 버튼을 눌러야 게임을 클리어할 수 있는지를 구해보자.

입력
첫째 줄에 정수 N이 주어진다. (1 <= N <= 1,500)

둘째 줄부터 N개의 줄에 걸쳐 게임 화면의 상태가 주어진다.
각 줄에는 N개의 문자가 공백없이 주어지고, 모든 문자는 G 또는 . 중 하나이다.
G 는 그 칸에 곰곰이가 있다는 뜻이고,
. 는 그 칸이 비어있음을 의미한다.

최소 하나 이상의 G 문자가 주어짐이 보장된다.

출력
모든 곰곰이를 하나의 칸에 모으기 위해, 총총이가 최소 몇 번 버튼을 눌러야 하는지 구하시오.

예제 입력 1
3
.G.
G.G
.G.
예제 출력 1
4

예제 1 설명
위와 같이 최소 네 번 버튼을 눌러서 모든 곰곰이를 하나의 칸에 모을 수 있다.

예제 입력 2
4
..G.
G...
...G
....
예제 출력 2
5
*/

fun main() {
    val N = readln().toInt()
    val matrix = Array(N) { readln() }

    var li = N
    var lj = N
    var ui = -1
    var uj = -1

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (matrix[i][j] == 'G') {
                li = minOf(li, i)
                ui = maxOf(ui, i)
                lj = minOf(lj, j)
                uj = maxOf(uj, j)
            }
        }
    }

    var answer = 0
    if (li != ui) answer += minOf(ui, N - 1 - li)
    if (lj != uj) answer += minOf(uj, N - 1 - lj)

    println(answer)
}