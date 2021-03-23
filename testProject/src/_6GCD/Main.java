package _6GCD;

// 최대 공약수 구하기 

public class Main {
	public static void main(String[] args) {
		//12 18 => 6 
		System.out.println(GetGCD(12,18));
		System.out.println(GetGCD(30,30));
		System.out.println(GetGCD(60,120));
	}
	
	//내 풀이 
	public static int GetGCD(int a, int b) {
		int gcd = 0;
		
		// 1. 입력된 수보다 같거나 작은 수중에서 두 값이 동시애 나눠지는 값이 0인 값을 구한다.
		if (a >= b) {
			gcd = b;
		} else {
			gcd = a;
		}
		
		for (;  gcd >= 0; gcd--) {
			if (b % gcd == 0 && a % gcd == 0) {
				break;	// 큰 수 부터 확인하고 동시에 나눠지는 값이 있다면 빠져 나간다.
			}
		}
		
		return gcd;
	}
	
	//강사 풀이  --> 비슷한데 강사는 작은 수 부터 확인 하였음 숫자가 커질수록 큰 값부터 확인 하는게 더 효율적이라 생각 됨.
	public static int GetGCD2(int num1, int num2) {
		int gcd = 0;
		
		int small;
		int big;
		
		if (num1 >= num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		for (int i=1;  i <= small; i++) {
			if (big % i == 0 && small % gcd == 0) {
				gcd = i;	//
			}
		}
		
		return gcd;
	}
}
