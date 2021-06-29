package _7PrimeNumber;

import java.util.ArrayList;
/**
 * [소수 구하기]
 * 출처: 소수 구하기 알고리즘 분석 (https://st-lab.tistory.com/81) 
 * @author kimtaemin
 *
 */

public class Main {
	
	public static ArrayList<Integer> list;
	
	//소수 판 별 == 약수가 1 또는 자기 자신만 되는 수 
	
	public static void main(String[] args) {
		System.out.println(getPrimeYN(12));
		System.out.println(getPrimeYN(11));
		System.out.println(getPrimeYN(4));
		System.out.println(getPrimeYN(3));
		
		
		
		//에라토스테네스의 체를 이용한 소수 구하기 알고리즘 
		// 10,000, 50,000, 100,000, 500,000, 1,000,000 까지 TEST
		
		int N = 10000;
		 
		for (int i = 0; i < 5; i++) {
			System.out.println("Prime Numbers less than or equal to " + N);
			
			list = new ArrayList<Integer>();	// list 초기화 
			make_prime3(N);
			list.clear();						// 리스트 비우기
			
			System.out.println();
			if(i % 2 == 0) {
				N *= 5;
			}
			else {
				N *= 2;
			}
		}
		
	}
	
	// 내 풀이 // 강사 풀이 똑같음
	public static boolean getPrimeYN(int num) {
		
		for (int i=2; i<num-1; i++) { // 개선 ==> num-1이 아닌, num/2 까지만 가도 소수인지 판별이 가능하다.
			
			if(num % i == 0) {
				return false;     // 1 또는 자기 자신보다 작은 수 중에서 딱 맞게 나누어지는 숫자가 있다면 소수가 아님.
			}
		}
		return true;
	}
	
	// N 이하의 모든 소수 구하기 
		public static long make_prime3(int number) {
			final long start = System.nanoTime();
	 
			boolean[] check = new boolean[number + 1]; // true : 비소수 , false : 소수
			check[0] = check[1] = true;
	 
			for (int i = 2; i <= Math.sqrt(number); i++) { //Math.sqrt 제곱근 구하는 메서드 
				// 0 과 1 은 소수가 아니므로 skip
	 
				if (check[i])
					continue; // 소수가 아닐경우 skip
	 
				for (int j = i * i; j < check.length; j += i) {
					check[j] = true;
				}
			}
			for (int i = 0; i < check.length; i++) {
				if (!check[i]) list.add(i);	// 소수(flase)인 경우 list 에 추가
			}
			final long end = System.nanoTime();
			System.out.println("run3 : " + (end - start) * 1e-9 + " sec");
			return end - start;
		}
		

}
