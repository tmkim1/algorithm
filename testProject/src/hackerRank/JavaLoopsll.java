package hackerRank;

import java.util.Scanner;

public class JavaLoopsll {

	//내 풀이 
	public static void main(String[] args) {
		// a = 0, b = 2 , n = 10  // 2, 6 , 14
		// a = 5, b = 3 , n = 5  // 2, 6 , 14
		
		// a+2^n*b+2^n*b n 
		
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            //a is added only once.
            result = a;
            
            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.printf("%d ", result);
            }
            System.out.println("");
            result = 0;
        }
        in.close();
		
	}

}
