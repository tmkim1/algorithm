package testProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class testClass {
	public static String res = "";
	
	public static void main(String[] args) {
		System.out.println("TEST");
		System.out.println(solution(8154369));
		System.out.println(reverseInt(8154369));
	}
	
/*	람다식 풀이 
 * 
 *  1. 자연수를 Integer.toString() 메소드를 이용해서 String으로 변환.

	2. chars() 메소드로 char배열로 쪼개고 이를 sorted() 메소드로 오름차순 변환!

	3. 그리고 각 요소를 c라는 변수로 forEach(람다식) 형태로 접근. 

	4. 오름차순된 값을 12345라면 1부터 차근차근 오른쪽으로 붙여넣으면 54321 이런식으로 오름차순 정렬 효과를 나타냄.

	5. 반환*/
	
	public static int reverseInt(int n){
		res = "";
		Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
		
		return Integer.parseInt(res);
	}
	
	
	
	public static long solution(long n) {
		long answer = 0;
		String strResult = "";
		String strn = String.valueOf(n);						// Long n을 String으로 변환 
		
		List<String> slist = Arrays.asList(strn.split(""));     // 각 자리수를 잘라서 List에 담는다.
		List<Integer> ilist = new ArrayList<Integer>();			// 숫자를 담을 List 생성
		
		for(String s : slist) {									// 문자로 담긴 리스트를 -> Integer 리스트로 이동 
			ilist.add(Integer.parseInt(s));
		}
		
		ilist.sort(new Comparator<Integer>() {					// List에는 데이터 정렬을 위한 sort라는 메소드가 있다. 
			public int compare(Integer o1, Integer o2) {		// compare => 
				return o2-o1;									// o1-o2:오름차순 o2-o1: 내림차순
			}
		});
		
		for(Integer i : ilist) {
			strResult += String.valueOf(i);
		}
		
		answer = Long.parseLong(strResult);
		
		return answer;
	}
}

/*
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n	       return
118372	873211
*/