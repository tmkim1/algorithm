package _52InsertionSort;

import java.util.Arrays;

/**
 * 손 안의 카드를 정렬하는 방법과 유사
 * 선택 정렬과 유사하지만 좀 더 효율적 
 * 2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후, 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입 하여 정렬하는 알고리즘
 * 최선의 경우 O(N) ==> 다른 정렬 알고리즘의 일부로 사용될 만큼 좋은 정렬 알고리즘 // 실생활에서 쓰는 정렬법과 유사 
 * 
 * 
 *[point]
 * 1. 삽입하고 싶은 데이터는 변수를 별도로 준비하여 대입해 둔다.
 * 2. 변수의 데이터를 정렬된 데이터와 순서대로 비교한다.
 * 3. 변수의 데이터보다 작은 데이터가 발견되면, 그 뒤의 요소에 변수의 데이터를 대입한다. 
 * 
 * @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html
 *  2. 처음 만나는 알고리즘 
 * 
 * @author kimtaemin
 * 
 */

public class Main {
	public static void main(String[] args) {
		int[] numArr = {25,10,20,40,32,11,23,42};
		insertionSort(numArr);
		insertionSort2(numArr);
		insertionSort3(numArr);
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i ++) {
			int temp = arr[i];				            // 초기 선택 값 지정, 첫 번째 원소 앞에는 어떤 원소도 갖고 있지 않기 때문에, 두 번째 인덱스부터 탐 
			int prev = i-1;
			
			while((prev >= 0) && (arr[prev] > temp)) {	// prev의 값이 더 크다면 자리를 바꿔줘야 함. 
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = temp; 						// prev를 감소 시키다가 자기보다 더 작은 값을 만나면 그 자리에 들어감.
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	//연습1 
	public static void insertionSort2(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int prev = i-1;
			
			while ((prev >= 0) && (arr[prev] > arr[i])) { // 책 꽂을때처럼 선택한 값을 temp에 빼놨다가 다른거 밀고 넣기.
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//연습2
	public static void insertionSort3(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int prev = i-1;
			while((prev >= 0) && (arr[prev] > arr[i])) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
