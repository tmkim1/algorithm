package _7PrimeNumber;

public class Main {
	
	//소수 판 별 == 약수가 1 또는 자기 자신만 되는 수 

	public static void main(String[] args) {
		System.out.println(getPrimeYN(12));
		System.out.println(getPrimeYN(11));
		System.out.println(getPrimeYN(4));
		System.out.println(getPrimeYN(3));
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

}
