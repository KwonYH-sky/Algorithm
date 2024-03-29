/*
2×n 타일링

시간 제한메모리
1 초 256 MB

문제

2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

예제 입력 1
2 

예제 출력 1
2 

예제 입력 2
9 
예제 출력 2
55
*/
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        dp[1] = 2;
        
        for (int i = 2; i < n; i++)
          dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        
		System.out.print(dp[n-1]);

	}

}