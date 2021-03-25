package _9SumOfEachNumber;

//각 자리의 합 구하기.
public class Main {

	public static void main(String[] args) {
		System.out.println(SumResult(1242));
		System.out.println(SumResult2(1242));
	}
	
	// 내 풀이
	//1.포맷팅을 사용하여 정수를 -> Char[] 로 -> 각 char를 int에 += 해주면 될것 같다. 
	public static int SumResult(int num) {
		int result = 0;
		char[] charNum = String.valueOf(num).toCharArray();
		
		for(char c : charNum) {
			result += Integer.parseInt(String.valueOf(c));
		}
		return result;
	}
	
	// 강사 풀이
	// 1. 10으로 나눈 나머지 값으로 끝에 값을 잘라내 누적 합 시킨다.
	public static int SumResult2(int num) {
		int result = 0;
		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
		return result;
	}
	

}
