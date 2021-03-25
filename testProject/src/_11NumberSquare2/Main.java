package _11NumberSquare2;

public class Main {
	
	/* 짝수 행은 내림차순으로 정렬
	 * 1 2 3 4
	 * 8 7 6 5
	 * 9 10 11 12
	 * 16 15 14 13
	*/
	
	public static void main(String[] args) {
		Square(3);
		
		Square(10);
	}

	// 내 풀이
	public static void Square(int n) {
		
		for(int j=1; j <= n; j++) {
			for (int i=1; i <= n; i++) {
				if (j % 2 == 0) {
					System.out.printf("%4d", (n*(j-1))+(n-i+1));
				} else {
					System.out.printf("%4d", (n*(j-1))+i);
				}
			}
			System.out.println();
		}
	}
}



