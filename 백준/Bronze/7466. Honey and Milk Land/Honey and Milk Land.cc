/*
꿀과 우유 나라
 
시간 제한 메모리 제한
1 초 128 MB

문제
꿀과 우유의 나라에 나쁜 소문이 퍼지고 있습니다. 
정보에 입각한 사람들은 유명한 우유 강 그리드의 우유가 시큼하게 변하고 있다고 말합니다. 
물론 보안 서비스는 사람들이 땅의 관광객 인기를 질투하는 타르 왕국에 의해 사람들에게 정보를 제공한다는 
사실을 금방 알아 냈습니다. 그러나이 발견은 이러한 소문을 막는 데 도움이되지 않습니다. 
정부는 관광 산업의 위기를 막기 위해 강에 대한 일일 모니터링을 구축하고자합니다.

우유가 시어지는 것을 방지하는 우유 보안 부서가 새로 설립되었습니다. 
강력한 보일러와 저온 살균기를 갖추고 있어 우유에 대한 어떠한 위험도 신속하게 무력화할 수 있습니다. 
새로운 위협에 더 잘 대처하기 위해 부서는 가능한 위험에 대해 미리 알고 있어야 합니다. 
우유의 신선도를 확인할 수 있는 헬리콥터도 있습니다. 장비는 완벽합니다. 
잠재적으로 위험한 장소를 모두 감지하기 위해 강을 건너는 것만으로도 충분합니다.

우유 보안 부서의 운영을 시작하려면 정부는 육상 예산에 서비스 예산을 추가해야 합니다. 
문제 중 하나는 헬리콥터의 아침 경로입니다. 헬리콥터는 최단 시간 내에 모든 강을 점검해야 합니다. 
예산에 추가하려면 이 비행의 가격을 결정해야 합니다.

그리드는 두 세트의 우유 강으로 구성됩니다. 첫 번째 세트의 강은 북쪽에서 남쪽으로, 
두 번째 세트의 강은 동쪽에서 서쪽으로 흐릅니다. 강은 직선입니다. 
각 세트의 강은 평행하며 인접한 강 사이의 거리를 알 수 있습니다. 
북쪽에서 남쪽으로 흐르는 강이 n개, 동쪽에서 서쪽으로 흐르는 강이 e개가 있습니다.

정부는 최소 아침 비행 비용을 결정해야 합니다. 
각 킬로미터당 비용은 육지 국가 화폐인 꿀통 1통입니다. 
이착륙 비용은 이 비용에 포함되지 않습니다. 
비행의 시작과 끝 지점은 자유롭게 선택할 수 있습니다.

입력
입력 파일의 첫 번째 줄에는 n과 e(1 ≤ n, e ≤ 1,000)가 포함됩니다. 
두 번째 줄에는 북쪽에서 남쪽으로 흐르는 인접한 강 사이의 거리(킬로미터)를 나타내는 
n - 1 정수가 동쪽에서 서쪽으로 나열되어 있습니다. 
세 번째 줄에는 동쪽에서 서쪽으로 흐르는 인접한 강 사이의 거리(킬로미터)를 나타내는 
e - 1 정수가 북쪽에서 남쪽으로 나열되어 있습니다. 
인접한 두 강 사이의 거리는 27킬로미터를 초과하지 않습니다.

출력
최소 아침 비행 비용을 꿀통 단위로 출력합니다. 
더 작은 단위는 없으므로 비행에 필요한 최소한의 꿀통 수를 정수로 출력해야 합니다.

예제 입력 1 
2 1
1
예제 출력 1 
1
예제 입력 2 
10 10
2 2 2 2 2 2 2 2 2
2 2 2 2 2 2 2 2 2
예제 출력 2 
26
예제 입력 3 
1 1
예제 출력 3 
0

Translated with DeepL.com (free version)
*/

#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, e;
    cin >> n >> e;

    vector<int> n_river(n - 1);
    vector<int> e_river(e - 1);

    for (int i = 0; i < n - 1; i++) {
        cin >> n_river[i];
    }

    for (int i = 0; i < e - 1; i++) {
        cin >> e_river[i];
    }

    int sum_n_river = accumulate(n_river.begin(), n_river.end(), 0);
    int sum_e_river = accumulate(e_river.begin(), e_river.end(), 0);

    int result = ceil(sqrt(sum_n_river * sum_n_river + sum_e_river * sum_e_river));

    cout << result;

	return 0;
}