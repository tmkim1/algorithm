package _55BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제: 떡볶이 떡 만들기 
 * 떡의 개수: N 
 * 요청 떡의 길이: M 
 * 
 * 절단기 높이 최댓값 구하기 (0~10억)
 *
 * 절단기의 높이를 설정하여 떡을 자른 후 요청한 떡의 길이 만큼 합하여 전달해줌. 
 * 
 * point: 큰 탐색 범위를 보면 이진 탐색을 떠올려야 함.
 *  *  *  @출처 
 *  1. 도서: 이코테 
 * @author kimtaemin
 *
 */

public class Main2 {
	public static void main(String[] args) {
		int[] numArr = {19, 15, 10, 17};
		System.out.println(BinarySearch(numArr, 4, 6));
		
		Scanner sc = new Scanner(System.in);

		// 떡의 개수(N)와 요청한 떡의 길이(M)
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 각 떡이 개별 높이 정보 
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 이진 탐색을 위한 절단기 높이 설정으로 가능한 0부터 10억으로 start와 end 시작점과 끝점 설정 
		int start = 0;
		int end = (int) 1e9;  // 10억  
		int result = 0;
		
		while(start <= end) {
			long total = 0;
			int mid = (start + end) / 2;
			
			for(int i=0; i<n; i++) { //전체 떡의 갯수만큼 반복 모두 절단기로 자를지 확인. 
				//잘랐을 때의 떡의 양 계산 
				if(arr[i] > mid) total += arr[i] - mid;
			}
			
			if(total < m) {   // 떡의 양이 부족한 경우 더 많이 자르기 (왼쪽 탐색) 
				end = mid-1;
			} else {          // 떡의 양이 충분한 경우 덜 자르기 (오른쪽 부분 탐색) 
				result = mid; // 최대한 덜 잘랐을때가 정답이므로, 여기에서 result를 기록 
				start = mid+1;
			}
		}
		System.out.println(result);
	}
	
	// 내 풀이 // 답은 맞았지만 이진 탐색 활용을 못 했음. // 이 방법은 선형 탐색 풀이 // 목표 값이 얼마인지 모르기 때문에 현재 값이 목표 값보다 큰지 작은지를 판단할수가 없음.. 
	public static int BinarySearch(int[] arr, int N, int M) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 값을 받아 정렬한다. 
		// 가장 큰 값을 찾아 // 그 값을 몫으로 나눈다. // 몫은 1씩 차감 
		int min = arr[0], max = arr[arr.length-1];
		int sum = 0;
		int tempNum = 0;
		
		//얻고자 하는 떡의 길이 
		for(int i=max; i > 0; i--) { //선형 탐색을 이진 탐색으로 변형 해야한다. 
			for(int j=0; j<arr.length; j++) {
				tempNum = arr[j] % i;					 // 가장 큰 떡의 길이부터 1씩 차감하여 절단기 높이를 설정해야 함, 설정한 절단기 높이로 자른 값들을 tempNum에 담아 sum에 더해주도록 한다. 
				if((sum + tempNum) <= M) sum += tempNum; // 요청한 떡의 길이보다 길면 더해줄 필요가 없음. 
				
				if(sum == M) {
					return i;	//떡의 최대 높이 확인 
				}
				
			}
		}
		return -1;
	}
}