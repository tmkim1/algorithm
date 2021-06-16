package _4ConversionBinary;

import java.util.Scanner;

public class Main {
	
	
	/*	10진수 -> 2진수 변환   */
	
	public static void main(String[] args) {
		int inputNum = 0;
		int bin[] = new int[100];
		int i = 0;
		int Rem = 0;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		while(inputNum > 0) {
			Rem = inputNum % 2;			// ex) 33 % 2 = 1 
			inputNum = inputNum / 2;    // ex) 33 / 2 = 16 
			bin[i] = Rem;               // 1     거꾸로 출력 해줘야 함.
			i++;
		}
		
		i--;
		
		//거꾸로 쌓이기 때문에 
		for(; i >= 0; i--) {
			System.out.printf("%d",bin[i]);
		}
		
	}

}
