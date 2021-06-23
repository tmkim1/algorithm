package _53QuickSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 분할 정보(divide and conquer) 방법을 통해 주어진 배열을 정렬한다. 
 * 
 * [Process]
 * 배열 가운데서 하나의 원소를 고른다. 이렇게 고른 원소를 피벗(pivot) 이라고 한다.
 * 피벗 앞에는 피벗보다 값이 작은 모든 원소들이 오고, 피벗 뒤에는 피벗보다 값이 큰 모든 원소들이 오도록 피벗을 기준으로 배열을 둘로 나눈다. 이렇게 배열을 둘로 나누는 것을 분할(Divide) 이라고 한다. 분할을 마친 뒤에 피벗은 더 이상 움직이지 않는다.
 * 분할된 두 개의 작은 배열에 대해 재귀(Recursion)적으로 이 과정을 반복한다. 
 * 재귀 호출이 한번 진행될 때마다 최소한 하나의 원소는 최종적으로 위치가 정해지므로, 이 알고리즘은 반드시 끝난다는 것을 보장할 수 있다.
 * 
 *  * @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html
 *  2. 도서: 처음 만나는 알고리즘 
 *  
 * @author kimtaemin
 * 
 */
public class Main {

	
	public static void main(String[] args) {
		int[] numArr = {25,10,20,40,32,11,23,42,55,79};
		quickSort(numArr, 0, numArr.length-1);
		
		System.out.println(Arrays.toString(numArr));
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left > right) return;           // 값이 아닌 인덱스를 뜻함, 따라서 이미 다 정렬 된 이후를 뜻함.
		
		int pivot = partition(array, left, right);
		
	    // 피벗을 제외한 2개의 부분 배열을 대상으로 순환 호출. 
	    quickSort(array, left, pivot-1);  // 좌측 파티션 
	    quickSort(array, pivot+1, right); // 우측 파티션 
	    
	    System.out.println(Arrays.toString(array));
	}
	
	public static int partition(int[] array, int left, int right) {
		
		 /**
	    // 최악의 경우, 개선 방법
	    int mid = (left + right) / 2;
	    swap(array, left, mid);
	    */
		
		int pivot = array[left]; // 가장 왼쪽값을 pivot으로 설정.
		int i=left, j=right;
		
		while (i < j) { // 초기 반복 
			while(pivot < array[j]) { // pivot이 right보다 작으면 문제 없음 => 인덱스만 감소.
				j--;
			}
			while(i < j && pivot >= array[i]) { // pivot이 left보다 크다면 문제 없음 => 인덱스만 증가 .
				i++;
			}
			swap(array,i,j);	// 위에 반복문을 지나 해당 지점에 왔다는 것은 => swap을 해야하는 상황 ==> array[i] > pivot && array[j] < pivot
		}
		
		// 해당 파티션의 정렬이 끝난 상황, pivot 볁경 
		array[left] = array[i];
		array[i] = pivot;
		
		return i; 
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}


