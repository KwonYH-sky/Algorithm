/*
카드

시간 제한   메모리 제한
1 초   256 MB
문제
준규는 숫자 카드 N장을 가지고 있다. 숫자 카드에는 정수가 하나 적혀있는데,
적혀있는 수는 -2^62보다 크거나 같고, 2^62보다 작거나 같다.

준규가 가지고 있는 카드가 주어졌을 때, 가장 많이 가지고 있는 정수를 구하는 프로그램을 작성하시오.
만약, 가장 많이 가지고 있는 정수가 여러 가지라면, 작은 것을 출력한다.

입력
첫째 줄에 준규가 가지고 있는 숫자 카드의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
둘째 줄부터 N개 줄에는 숫자 카드에 적혀있는 정수가 주어진다.

출력
첫째 줄에 준규가 가장 많이 가지고 있는 정수를 출력한다.

예제 입력 1
5
1
2
1
2
1
예제 출력 1
1
예제 입력 2
6
1
2
1
2
1
2
예제 출력 2
1
*/

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      Map<Long, Integer> map = new HashMap<>();

      for (int i = 0; i < N; i++) {
         long num = Long.parseLong(br.readLine());
         map.put(num, map.getOrDefault(num, 0) + 1);
      }

      System.out.print(map.keySet().stream()      
            .sorted()
            .sorted((a, b) -> map.get(b) - map.get(a))
            .findFirst()
            .get());
   }
}

