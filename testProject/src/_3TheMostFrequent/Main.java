package _3TheMostFrequent;

import java.util.Scanner;

/*
- 가장 많이 출현한 수를 출력 

- 1 2 2 3 1 4 2 2 4 3 5 3 2 

- 정답: 2 (5회)
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		int[] mode = new int[10]; 
		
		/* int 배열 각 0으로 초기화 하지 않아도 괜챃음. 자동으로 0으로 초기화
		 * for(int j=0; j<mode.length; j++) {
			mode[j] = 0;
		}*/
		
		// 각 숫자가 몇 회 출현했는지를 저장
		// index -> 출현한 수 
		// index 값 -> index(출현한 수)가 몇 번 인지 저장.
		// ex) mode[3] = 5 // 3이라는 숫자가 5번 출현
		
		for (int i=0; i<inputNum.length; i++) {
			inputNum[i] = sc.nextInt();
			mode[inputNum[i]]++;		// 출현한 숫자의 인덱스 값 ++ 
		}
		
		// 값 비교
		
		int maxNum = 0;
		int maxCnt = 0;
		for (int i=0; i<mode.length; i++) {
			if(mode[i] > maxNum) {
				maxNum =i;				// 값이 아닌 인덱스를 저장.
				maxCnt = mode[i];
			}
		}
		System.out.println("최빈도 숫자: " + maxNum + ", 출현 횟수: "+maxCnt+" 입니다.");
		
		// 강사님하고 동일 : 다만 나는 인풋 받으면서 ++ 
		
	}

}
