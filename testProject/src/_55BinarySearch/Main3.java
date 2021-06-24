package _55BinarySearch;

import java.util.Scanner;

/**
 * 문제: 정렬된 배열에서 특정 수의 개수 구하기 
 * N개의 원소를 포함하고 있는 배열이 오름차순으로 정렬되어 있음. 
 * 이때 이 수열에서 x가 등장하는 횟수를 구하시오.
 * ex) {1,1,2,2,2,2,3}  에서 x=2가 등장하는 횟수 구하기 (등장 횟수: 4) 
 * 단, 시간 복잡도 O(logN)으로 알고리즘을 설계하지 않으면 시간 초과 // 즉 선형 탐색은 불가능
 * 
 * 원소 갯수 N: 1 <= N <= 1,000,000 
 * 찾을 원소 X: -10^9 <= X <= 10^9 
 * 
 * x원소가 하나도 없는 경우는 -1을 출력 
 * 
 *  *  *  @출처 
 *  1. 도서: 이코테 
 * @author kimtaemin
 *
 */
public class Main3 {
	// 내 풀이 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 원소의 갯수 
		int x = sc.nextInt(); // 찾을 원소 
		int cnt = 0;          // 출연 횟수 
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2; 
			
			// 타겟 원소의 위치를 찾은 경우.
			if(arr[mid] == x) {
				cnt ++;
				// 같은 값은 정렬된 상태이기 때문에 옆에 붙어 있음
				int tempMid = mid;
				
				while(arr[--tempMid] == x) {	// 왼쪽에 있는 같은 값 탐색 
					cnt++;
				}
				
				while(arr[++mid] == x) {        // 오른쪽에 있는 같은 값 탐색 
					cnt ++;
				}
				
				break;
				
			} else if(arr[mid] < x ) {          // 가운데 값이 x보다 작으면 우측 탐색
				 start = mid+1;
			} else {                            // 가운데 값이 x보다 크면 좌측 탐색 
				end = mid -1;
			}
		}
		if(cnt > 0) {
			System.out.println("출연 횟수: " + cnt);
		} else {
			System.out.println("(-1) 출연 횟수가 없습니다. " );
		}
	}

}
