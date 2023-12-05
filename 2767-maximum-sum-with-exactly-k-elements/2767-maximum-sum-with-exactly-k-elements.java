/*
2656. 정확히 K개의 요소를 가진 최대 합계 
인덱스가 0인 정수 배열 nums와 정수 k가 주어지며, 점수를 최대화하기 위해 다음 연산을 정확히 k번 수행하는 것이 과제입니다:

nums에서 원소 m을 선택합니다.
배열에서 선택한 원소 m을 제거합니다.
배열에 값이 m + 1인 새 원소를 추가합니다.
점수를 m만큼 늘립니다.
연산을 정확히 k번 수행한 후 얻을 수 있는 최대 점수를 반환합니다.

예제 1:
입력: nums = [1,2,3,4,5], k = 3
Output: 18
설명: 합계를 최대화하려면 nums에서 정확히 3개의 요소를 선택해야 합니다.
첫 번째 반복에서는 5를 선택합니다. 그러면 sum은 5이고 nums = [1,2,3,4,6]이 됩니다.
두 번째 반복에서는 6을 선택합니다. 그러면 sum은 5 + 6이고 nums = [1,2,3,4,7]이 됩니다.
세 번째 반복에서는 7을 선택합니다. 그러면 합계는 5 + 6 + 7 = 18이고 nums = [1,2,3,4,8]입니다.
따라서 18을 반환합니다.
18이 우리가 얻을 수 있는 최대 답이라는 것을 증명할 수 있습니다.

예제 2:
입력: nums = [5,5,5], k = 2
Output: 11
설명: 합계를 최대화하려면 nums에서 정확히 2개의 요소를 선택해야 합니다.
첫 번째 반복에서는 5를 선택합니다. 그러면 합계는 5가 되고 nums = [5,5,6]이 됩니다.
두 번째 반복에서는 6을 선택합니다. 그러면 sum은 5 + 6 = 11이고 nums = [5,5,7]이 됩니다.
따라서 11을 반환합니다.
11이 우리가 얻을 수 있는 최대 답이라는 것을 증명할 수 있습니다.
 

제약 조건이 있습니다:
1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 100
*/

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int res = max;

        for (int i = 1; i < k; i++)
            res += max+i;

        return res;
    }
}