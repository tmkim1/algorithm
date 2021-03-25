package _14NumberSquare5;


public class Main {
	
	/* 입력 된 n 숫자 만큼  정사각형 // 각 행에 해당하는 값만큼 증가 
	 *  1 2 3 4
	 *  2 4 6 8 
	 *  3 6 9 12
	 *  4 8 12 16
	*/
	
	public static void main(String[] args) {
		Square2(3);
		
		//Square(10);
		
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

