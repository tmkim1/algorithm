package javaLoopsI;

import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {
		Integer N = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // 입력 값 제한 
		
		while(true) {
			if (N < 2 || N > 20)  {
				System.out.println("please input number (2 < N < 20) ");
				N = sc.nextInt();
			} else {
				break;
			}
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(N+"*"+i+"="+N*i);
		}
		

	}

}
