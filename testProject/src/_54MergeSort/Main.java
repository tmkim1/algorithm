package _54MergeSort;

import java.util.Arrays;

/**
 * 병합 정렬 
 * 합병 정렬이라고도 부르며, 분할 정복 방법을 통해 구현. 
 * 분할 정복 이란:: 큰 문제를 작은 문제로 쪼개면서 해결해나가는 방식 
 * .빠른 정렬로 분류되며, 퀵 소트와 함께 많이 언급되는 방식
 * .퀵소트와는 반대로 안정 정렬에 속함
 * 
 * 시간 복잡도 평균, 최선, 최악: nlogn
 * 요소를 쪼갠 후, 다시 합병시키면서 정렬해나가는 방식으로, 쪼개는 방식은 퀵정렬과 유사
 * 
 * 퀵 정렬과의 차이점
 * 퀵정렬 : 우선 피벗을 통해 정렬(partition) → 영역을 쪼갬(quickSort)
 * 합병정렬 : 영역을 쪼갤 수 있을 만큼 쪼갬(mergeSort) → 정렬(merge) 
 *  @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html
 *  2. 도서: 처음 만나는 알고리즘 
 *  
 * @author kimtaemin
 *
 */
public class Main {
	public static void main(String[] args) {
		int[] numArr = {25,10,20,40,32,11,23,42,55,79};
		
		mergeSort(numArr, 0, numArr.length-1);
		System.out.println(Arrays.toString(numArr));
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right); //merge 정렬 로직 핵심. 
			
		}
	}
	
	public static void merge2(int[] array, int left, int mid, int right) {
	    int[] L = Arrays.copyOfRange(array, left, mid + 1);
	    int[] R = Arrays.copyOfRange(array, mid + 1, right + 1);
	 
	    int i = 0, j = 0, k = left;
	    int ll = L.length, rl = R.length;
	 
	    while (i < ll && j < rl) {
	        if (L[i] <= R[j]) {
	            array[k] = L[i++];
	        } else {
	            array[k] = R[j++];
	        }
	        k++;
	    }
	 
	    while (i < ll) {
	        array[k++] = L[i++];
	    }
	 
	    while (j < rl) {
	        array[k++] = R[j++];
	    }
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] L = Arrays.copyOfRange(arr, left, mid+1);
		int[] R = Arrays.copyOfRange(arr, mid+1, right+1);
		
		int i=0, j=0, k=left;				// i: L의 인덱스 조절, j: R의 인덱스 조절, k: 기존 배열에 인덱스 조절 
		int ll = L.length, rl = R.length;
		
		while(i < ll && j < rl) {			// 나눈 파티션 길이 만큼 다 돌아줘야 끝.  
			if(L[i] <= R[j]) {
				arr[k] = L[i++];
			} else {
				arr[k] = R[j++];
			}
			k++;
		}
		
		//remain, 한 쪽이 다 먼저 돌은 경우, 남은 파티션에 값들을 배열에 추가 
		while(i <ll) {
			arr[k++] = L[i++]; 
		}
		
		while(j <rl) {
			arr[k++] = R[j++];
		}
	}
}
