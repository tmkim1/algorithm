package _17Start2;

public class Main {
	public static void main(String[] args) {
		PrintStar2(6);
		
		//PrintStar(6);
		//PrintStar(10);
		
	}
	
	public static void PrintStar(int n) {
		// 1,2,3,4,5,6 돌면서 엔터
		// 반복문 2개가 필요
		// 1. Enter를 치기 위한 for문 
		// 2 *을 찍기 위한 for문 
		
		// 이번에는 거꿀로 5,4,3,2,1
		// cnt숫자를 조정하며 같을 때 개행과 Break문을 걸어주기 때문에, cnt만 조정해주면 된다.
		
		int cnt = 5;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.printf("*");
				if(j == cnt) {
					System.out.println("");
					break;
				}
			}
			cnt--;
		}
	}
	
	public static void PrintStar2(int n) {
		// 1,2,3,4,5,6 돌면서 엔터
		// 반복문 2개가 필요
		// 1. Enter를 치기 위한 for문 
		// 2 *을 찍기 위한 for문 
		
		// 이번에는 거꿀로 5,4,3,2,1
		// cnt숫자를 조정하며 같을 때 개행과 Break문을 걸어주기 때문에, cnt만 조정해주면 된다.
		// 개행을 주고 싶다면 배열을 사용하면 될듯하다. 
		char numArr[] = new char[n];
		
		int cnt = 0;
		for (int i=1; i<=n; i++) {
			for (int j=0; j<n; j++) {
				numArr[j] = '*';
				if(j < cnt) {
					numArr[j] = ' ';
					//break;
				}
			}
			for(int j=0; j<numArr.length; j++) {
				System.out.printf("%s",numArr[j]);
			}
			System.out.println();
			cnt++;
		}
	}
}
