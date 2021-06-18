package _51SelectionSort;

import java.util.Arrays;

/**
 * 1. 선택 정렬은 버블 정렬과 유사 
 * 2. 해당 자리를 선택하고 그 자리에 올 값을 찾는다.
 * 
 * Process
 * 1. 주어진 배열 중에 최소값을 찾는다.
 * 2. 그 값을 맨 앞에 위치한 값과 비교한다. (pass)
 * 3. 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 비교한다. 
 * 
 * -- 쉽게 생각해서 맨 앞 index 부터 가장 작은 놈 찾아서 교체 
 * @author kimtaemin
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] numArr = {25,10,20,40,32,11,23,42};
		selectionSort(numArr);
	}

	public static void selectionSort(int[] arr) {
		int indexMain, temp;
		
		for(int i=0; i<arr.length-1; i++) {
			indexMain = i;                // 가장 작은 값의 인덱스를 담을 공간 처음은 i순차로 진행. 
			for(int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[indexMain]) {
					indexMain = j;        // indexMain이 가장 중요 --> 비교하여 값이 더 작으면 indexMain에 담긴 인덱스를 교체 
				}
			}
			//순환을 다 돌은 상태이기 때문에 해당 자리는 가장 작은 값이 배치 됨.
			temp = arr[indexMain];
			arr[indexMain] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
