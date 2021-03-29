package _14CountNum;

public class Main {

	// 내 풀이 강사 풀이랑 동일 // 이전에 비슷한 문제가 있었음 (최다 빈출 찾기) 
	public static void main(String[] args) {

		int n = 321152260;
		int arr[] = new int[10];  // 0 ~ 9 를 카운트 하기 위함 인덱 위치가 숫자를 뜻함.
		
		while (n > 1) {
			arr[n % 10]++; // 10으로 나눈 나머지 값을 사용하여 증감 
			n = n / 10;
		}
		
		/* ex
		 * 0: 1
		 * 1: 2
		 * 2: 3
		 * 3: 1
		 * 5: 1
		 * 6: 1
		 */
		
		for (int i=0; i < arr.length; i++) {
			System.out.println(i+": "+arr[i]);
		}
	}
}
