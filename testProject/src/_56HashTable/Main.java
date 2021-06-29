package _56HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * [해시 테이블] 
 *   .알고리즘 필수 // 완전 탐색(브루트 포스)으로는 시간 초과에 빠지는 경우 해시를 적용
 *   .탐색을 최대한 줄여주기 위해, input에 대한 key 값을 얻어 관리
 *   
 *   .충돌을 최소화 해야함   //   같은 방에 몰리는 현상 (충돌) => collison  // 이를 해결하기 위해서는 효과적인 HashAlgorithm을 고안해야 함.
 * 
 * 
 * [input] 
 * 5
 * abcd 
 * abc 
 * abcd 
 * abcd
 * ab 
 * 
 * [output]
 * OK
 * OK
 * abcd1
 * abcd2
 * OK
 * 
 *  *  *  @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html 
 *  2. 도서: 처음 만나는 알고리즘
 *  3. 강의: 엔지니어 대한민국 (https://www.youtube.com/watch?v=Vi0hauJemxA)
 * 
 * @author kimtaemin
 *
 */
public class Main {
	
	static final int HASH_SIZE = 1000;
	static final int HASH_LEN = 400;
	static final int HASH_VAL = 17;		// 소수로 설정 (17,19,23...) 
	
	static int[][] data = new int[HASH_SIZE][HASH_LEN];
	static int[] length = new int[HASH_SIZE];			
	
	static String[][] s_data = new String[HASH_SIZE][HASH_LEN];
	static String str;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		N = Integer.parseInt(br.readLine()); // 입력 수 1 ~ 100,000
		
		for (int i=0; i<N; i++) {
			str = br.readLine();
			
			int key = getHashKey(str);
			int cnt = checking(key);
			
			if(cnt != -1) {
				sb.append(str).append(cnt).append("\n");
			} else {
				sb.append("OK").append("\n");
			}
		}
		System.out.println(sb.toString());
	}
	
	// HashKey 생성 ==> HashKey를 생성하는 알고리즘은 상황에 따라 공간 효율성을 따라 로직이 변경된다. 개발자 역량 필요 
	public static int getHashKey(String str) {
		
		int key = 0;
		
		for (int i=0; i<str.length(); i++) {
			key = (key * HASH_VAL) + str.charAt(i);
		}
		
		if (key < 0) key = -key;
		
		return key % HASH_SIZE;
	}
	
	// 해당 key가 존재하는지 확인. 
	public static int checking(int key) {
		
		int len = length[key];
		
		if(len != 0) { // 이미 같은 key로 들어온 적 있음.
			for(int i=0; i<len; i++) { // 이미 들어온 문자열이 해당key 배열에 있는지 확인.
				if(str.equals(s_data[key][i])) {
					data[key][i]++;
					return data[key][i];
				}
			}
		}
		s_data[key][length[key]++] = str;
		return -1;
	}
}
