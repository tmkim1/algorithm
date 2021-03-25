package _12NumberSquare3;

public class Main {
	
	/* 입력 된 n 숫자 만큼 늘어나면서 정사각형 
	*/
	
	public static void main(String[] args) {
		Square2(3);
		
		Square(10);
		
	}

	// 내 풀이
	public static void Square(int n) {
		
		for(int j=1; j <= n; j++) {
			for (int i=1; i <= n; i++) {
				
					System.out.printf("%4d", ((n*n)*(j-1))+((n*(i-1))+1));
				
			}
			System.out.println();
		}
	}
	
	// 배열에 저장해서 푸는 방법으로 (인덱스를 가지고 놀기 때문에 훨씬 편하고 직관적임)
		public static void Square2(int n) {
			
			int arr[][] = new int[n][n];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j < n; j++) {
					arr[i][j] = (i*n*n)+(j*n+1);
					System.out.printf("%3d",arr[i][j]);
				}
				System.out.println();
			}
			
		}
}
