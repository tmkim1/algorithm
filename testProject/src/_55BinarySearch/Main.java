package _55BinarySearch;

import java.util.Arrays;

/**
 * 탐색 범위를 두 부분으로 분할하면서 처리 
 * 선형 -> 순서대로 하나하나씩 찾기 
 * 이진 -> 반씩 제외시키면서 찾기 
 * 
 * [진행 순서]
 * 1. 정렬 진행
 * 2. left와 right로 mid 값 설정 
 * 3. mid와 내가 구하고자 하는 값 비교 
 * 4. 구할 값이 mid보다 높으면 left = mid+1, mid보다 낮으면 right = mid -1 (범위 재설정) 반 덜어내기  
 * 5. left > right 일때까지 반복 
 * 
 *  *  @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html // 코드 오류 
 *  2. 도서: 처음 만나는 알고리즘, 이코
 * 
 * @author kimtaemin
 *
 */

public class Main {
	public static void main(String[] args) {
		int[] numArr = {25,10,20,40,32,11,23,42,55,79};
		int searchIndex = BinarySearch(numArr, 55);
		System.out.println("찾을 값: 55, "+"찾은 값의 위치: " + searchIndex + "값 확인:" + numArr[searchIndex]);
		
	}
	
	public static int BinarySearch(int arr[], int target) { // arr 배열에서 M값 찾기 
		Arrays.sort(arr);
		
		int start = 0, end = arr.length-1;
		
		while(start <= end) {
			int mid = (start+end) / 2;
			// 찾은 경우 중간점 인덱스 반환 
			if (arr[mid] == target) return mid; 
			// 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인. 
			else if (arr[mid] > target) end = mid -1;
			// 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인. 
			else start = mid + 1;
		}
		return -1;
	
	}
}


