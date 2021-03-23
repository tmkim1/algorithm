package _8Factorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetFactorial(5));
		System.out.println(GetFactorial(6));
		System.out.println(GetFactorial(7));
		
		System.out.println(ReFactorial(5));
		System.out.println(ReFactorial(6));
		System.out.println(ReFactorial(7));
	}
	
	//답 동일
	public static int GetFactorial(int num) {
		
		int result = 1;
		
		for (int i=1; i<=num; i++) {
			result = result * i;
		}
		return result;
	}
	
	//재귀 함수 사용, 중단 되는 부분을 잡아 준다 -> 재귀 되는 값을 고려한다. 
	public static int ReFactorial(int num) {
		
		if(num == 1) {
			return 1;
		}
		
		return num * ReFactorial(num-1);
	}

}
