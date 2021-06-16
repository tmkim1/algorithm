package _10NumberSquare;

public class Main {

	
	// N행 N열의 형태로 사각형을 만든다.
	public static void main(String[] args) {
		Square(5);
		Square(4);
		Square(3);
	}
	
	// 내 풀이
	public static void Square(int n) {
		
		int guideNum = n;
		int sunNum = 1;
		
		for(; n > 0; n--) {
			for (int i=1; i <= guideNum; i++) {
				System.out.printf("%4d",sunNum++);
			}
			System.out.println();
		}
	}
	
	

}
