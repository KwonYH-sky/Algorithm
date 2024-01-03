/*
DFS와 BFS

시간 제한   메모리 제한
2 초   128 MB
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를,
그 다음 줄에는 BFS를 수행한 결과를 출력한다.
V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4

예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5

예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
*/
import java.io.*;
import java.util.*;

public class Main {
   static boolean[] visited;
   static boolean[][] nodes;


   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      nodes = new boolean[n+1][n+1];

      // 그래프 생성
      for (int i = 0; i < m; i++) {
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
         
         nodes[a][b] = true;
         nodes[b][a] = true;
      }

      StringBuilder sb = new StringBuilder();

      // DFS
      Deque<Integer> stack = new ArrayDeque<>();
      visited = new boolean[n + 1];
      stack.push(v);
      while (!stack.isEmpty()) {
         int node = stack.pop();
         if (!visited[node]) {
            visited[node] = true;
            sb.append(node).append(' ');
            int len = nodes[node].length;
            for (int i = len-1; i >= 0; i--) {
                if(nodes[node][i] && !visited[i]) stack.push(i);
            }
         }
      }
      sb.append('\n');

      // BFS
      Deque<Integer> queue = new ArrayDeque<>();
      visited = new boolean[n + 1];
      queue.offer(v);
      while (!queue.isEmpty()) {
         int node = queue.poll();
         if(!visited[node]) {
            visited[node] = true;
            sb.append(node).append(' ');
            for (int i = 0; i < nodes[node].length; i++ ) {
               if (!visited[i] && nodes[node][i]) queue.offer(i);
            }
         }
      }

      System.out.print(sb.append('\n'));

   }

}