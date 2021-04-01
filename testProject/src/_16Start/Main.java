package _16Start;

public class Main {

	public static void main(String[] args) {
		// 흐어 프로젝트 막바지라 야근하고 피곤해
		// 간단한 별 찍기 
		
		PrintStar(6);
		PrintStar(10);
	}
	
	public static void PrintStar(int n) {
		// 1,2,3,4,5,6 돌면서 엔터
		// 반복문 2개가 필요
		// 1. Enter를 치기 위한 for문 
		// 2 *을 찍기 위한 for문 
		
		int cnt = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.printf("*");
				if(j == cnt) {
					System.out.println("");
					break;
				}
			}
			cnt++;
		}
	}

}
