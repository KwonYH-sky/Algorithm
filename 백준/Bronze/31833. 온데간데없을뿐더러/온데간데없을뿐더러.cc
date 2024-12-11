/*
온데간데없을뿐더러
 
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초 (추가 시간 없음)	1024 MB (추가 메모리 없음)	793	599	537	76.062%
문제
‘온데간데없을뿐더러’는 어떻게 띄어 써야 할까? 형용사 ‘온데간데없다’와 어미 ‘-을뿐더러’가 결합하였기 때문에 띄어쓰기 없이 ‘온데간데없을뿐더러’라고 쓰는 것이 올바른 표현이다.

각각 
$N$개의 양의 정수로 구성된 두 배열 
$A$, 
$B$가 주어진다. 
$A$에 있는 수를 모두 순서대로 공백 없이 이어서 썼을 때 얻게 되는 수를 
$X$, 
$B$에 있는 수를 같은 방식으로 이어서 썼을 때 얻게 되는 수를 
$Y$라고 했을 때, 
$X$와 
$Y$ 중 더 작은 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 각 배열의 원소 개수 
$N$이 주어진다.

둘째 줄에 배열 
$A$의 원소 
$A_1,A_2,\cdots ,A_N$이 차례대로 공백으로 구분되어 주어진다.

셋째 줄에 배열 
$B$의 원소 
$B_1,B_2,\cdots ,B_N$이 차례대로 공백으로 구분되어 주어진다.

출력
 
$X$와 
$Y$ 중 더 작은 값을 출력한다. 
$X$와 
$Y$가 같은 경우 그 값을 출력한다.

제한
 
$1\le N\le 9$ 
 
$1\le A_i\le 99(1\le i\le N)$ 
 
$1\le B_j\le 99(1\le j\le N)$ 
입력으로 주어지는 수는 모두 정수이다.
예제 입력 1 
5
5 4 3 2 1
1 2 34 5 6
예제 출력 1 
54321
예제 입력 2 
9
99 99 99 99 99 99 99 99 99
99 99 99 99 99 99 99 99 99
예제 출력 2 
999999999999999999
노트
 
$X$와 
$Y$는 
$2^{31}-1$보다 클 수 있으므로 C/C++에서는 long long 타입, Java에서는 long 타입을 이용해 저장하는 것을 권장한다.
*/

#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    string A, B;

    for (int i = 0; i < N; i++) {
        int a;
        cin >> a;
        A += to_string(a);
    }

    for (int i = 0; i < N; i++) {
        int b;
        cin >> b;
        B += to_string(b);
    }

    long long X = stoll(A), Y = stoll(B);

    cout << min(X, Y);

	return 0;
}
