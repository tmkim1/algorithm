package _50BubbleSort;

import java.util.Arrays;

//1회전에 첫 번째 원소와 두 번째 원소를, 두 번째 원소와 세 번째 원소를, 세 번째 원소와 네 번째 원소를,
//… 이런 식으로 비교하여 값이 더 큰 원소를 뒤로 가도록 교환한다.
//1회전을 수행하고 나면 가장 큰 원소가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 원소는 정렬에서 제외되고, 
//2회전을 수행하고 나면 끝에서 두 번째 원소까지는 정렬에서 제외된다. 
//이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.

public class Main {

	public static void main(String[] args) {
		int [] numArr = {13,2,15,35,7,5,4,324,255,1};
		BubbleSort(numArr);
		BubbleSort2(numArr);
	}
	
	public static void BubbleSort(int[] arr) {
		int temp = 0;
		for (int i=0; i<arr.length; i++) {               // 1. 전체 숫자 갯수만큼 돌아줘야함 한번 순회할때마다 검사하는 대상이 1개씩 차감 
			for(int j=0; j<arr.length-i-1; j++) {    // 2. 첫번째 원소부터 비교될 대상을 순회, 매 순회마다 가장 큰 값이 뒤에 자리를 찾아가기 때문에 -i만큼 정렬 범위 조정
				if(arr[j] > arr[j+1]) {	
					temp = arr[j];           // 더 큰 값을 temp에 저장.
					arr[j] = arr[j+1];       // 더 작은 값이 앞 인덱스에 오도록 저장.
					arr[j+1] = temp;         // temp에 저장했던 더 큰 값을 뒤에 오도록 저장.
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//연습 
	public static void BubbleSort2(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}


//시간복잡도를 계산하면, (n-1) + (n-2) + (n-3) + .... + 2 + 1 => n(n-1)/2이므로, O(n^2) 이다. 
//또한, Bubble Sort는 정렬이 돼 있던 안 돼있던,
//2개의 원소를 비교하기 때문에 최선, 평균, 최악의 경우 모두 시간복잡도가 O(n^2) 으로 동일하다.
//가장 구현이 쉽고 직관적이지만, 시간 복잡도가 n^2 
